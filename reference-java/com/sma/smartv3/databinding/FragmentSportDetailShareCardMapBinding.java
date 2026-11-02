package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baidu.mapapi.map.TextureMapView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailShareCardMapBinding implements ViewBinding {

    @NonNull
    public final TextureMapView bMapView;

    @NonNull
    public final CardView baseShareCardView;

    @NonNull
    public final CheckBox btnMap3d;

    @NonNull
    public final CheckBox btnMapHot;

    @NonNull
    public final CheckBox btnMapMark;

    @NonNull
    public final Button btnShare;

    @NonNull
    public final Button btnTrackPlay;

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final CheckBox downloadGpxIb;

    @NonNull
    public final PFMedium edtNickname;

    @NonNull
    public final CustomGoogleMapView gMapView;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final LinearLayout llPaceValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ImageView shareCardMapShowMapPoi;

    @NonNull
    public final PFMedium tvAvgBpmValue;

    @NonNull
    public final PFMedium tvCaloriesValue;

    @NonNull
    public final PFMedium tvDateTime;

    @NonNull
    public final PFMedium tvDetailName;

    @NonNull
    public final PFMedium tvDistanceUnit;

    @NonNull
    public final PFMedium tvDistanceValue;

    @NonNull
    public final PFMedium tvDuration;

    @NonNull
    public final PFMedium tvPaceValue;

    private FragmentSportDetailShareCardMapBinding(@NonNull LinearLayout rootView, @NonNull TextureMapView bMapView, @NonNull CardView baseShareCardView, @NonNull CheckBox btnMap3d, @NonNull CheckBox btnMapHot, @NonNull CheckBox btnMapMark, @NonNull Button btnShare, @NonNull Button btnTrackPlay, @NonNull LinearLayout dataPanel, @NonNull CheckBox downloadGpxIb, @NonNull PFMedium edtNickname, @NonNull CustomGoogleMapView gMapView, @NonNull ImageViewRound ivAvatar, @NonNull LinearLayout llPaceValue, @NonNull ImageView shareCardMapShowMapPoi, @NonNull PFMedium tvAvgBpmValue, @NonNull PFMedium tvCaloriesValue, @NonNull PFMedium tvDateTime, @NonNull PFMedium tvDetailName, @NonNull PFMedium tvDistanceUnit, @NonNull PFMedium tvDistanceValue, @NonNull PFMedium tvDuration, @NonNull PFMedium tvPaceValue) {
        this.rootView = rootView;
        this.bMapView = bMapView;
        this.baseShareCardView = baseShareCardView;
        this.btnMap3d = btnMap3d;
        this.btnMapHot = btnMapHot;
        this.btnMapMark = btnMapMark;
        this.btnShare = btnShare;
        this.btnTrackPlay = btnTrackPlay;
        this.dataPanel = dataPanel;
        this.downloadGpxIb = downloadGpxIb;
        this.edtNickname = edtNickname;
        this.gMapView = gMapView;
        this.ivAvatar = ivAvatar;
        this.llPaceValue = llPaceValue;
        this.shareCardMapShowMapPoi = shareCardMapShowMapPoi;
        this.tvAvgBpmValue = tvAvgBpmValue;
        this.tvCaloriesValue = tvCaloriesValue;
        this.tvDateTime = tvDateTime;
        this.tvDetailName = tvDetailName;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvDistanceValue = tvDistanceValue;
        this.tvDuration = tvDuration;
        this.tvPaceValue = tvPaceValue;
    }

    @NonNull
    public static FragmentSportDetailShareCardMapBinding bind(@NonNull View rootView) {
        int i = R.id.bMapView;
        TextureMapView textureMapView = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (textureMapView != null) {
            i = R.id.base_share_cardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.base_share_cardView);
            if (cardView != null) {
                i = R.id.btn_map_3d;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_3d);
                if (checkBox != null) {
                    i = R.id.btn_map_hot;
                    CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_hot);
                    if (checkBox2 != null) {
                        i = R.id.btn_map_mark;
                        CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_mark);
                        if (checkBox3 != null) {
                            i = R.id.btn_share;
                            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_share);
                            if (button != null) {
                                i = R.id.btn_track_play;
                                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_track_play);
                                if (button2 != null) {
                                    i = R.id.data_panel;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
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
                                                    i = R.id.iv_avatar;
                                                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                                                    if (imageViewRound != null) {
                                                        i = R.id.ll_pace_value;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_pace_value);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.share_card_map_showMapPoi;
                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_map_showMapPoi);
                                                            if (imageView != null) {
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
                                                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
                                                                            if (pFMedium5 != null) {
                                                                                i = R.id.tv_distance_unit;
                                                                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
                                                                                if (pFMedium6 != null) {
                                                                                    i = R.id.tv_distance_value;
                                                                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
                                                                                    if (pFMedium7 != null) {
                                                                                        i = R.id.tv_duration;
                                                                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
                                                                                        if (pFMedium8 != null) {
                                                                                            i = R.id.tv_pace_value;
                                                                                            PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
                                                                                            if (pFMedium9 != null) {
                                                                                                return new FragmentSportDetailShareCardMapBinding((LinearLayout) rootView, textureMapView, cardView, checkBox, checkBox2, checkBox3, button, button2, linearLayout, checkBox4, pFMedium, customGoogleMapView, imageViewRound, linearLayout2, imageView, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9);
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
    public static FragmentSportDetailShareCardMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailShareCardMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_share_card_map, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
