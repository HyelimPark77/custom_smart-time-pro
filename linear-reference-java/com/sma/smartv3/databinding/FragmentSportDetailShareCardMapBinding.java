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
        int r1 = R.id.bMapView;
        TextureMapView r5 = (TextureMapView) ViewBindings.findChildViewById(rootView, R.id.bMapView);
        if (r5 == null) goto L49;
        r1 = R.id.base_share_cardView;
        CardView r6 = (CardView) ViewBindings.findChildViewById(rootView, R.id.base_share_cardView);
        if (r6 == null) goto L49;
        r1 = R.id.btn_map_3d;
        CheckBox r7 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_3d);
        if (r7 == null) goto L49;
        r1 = R.id.btn_map_hot;
        CheckBox r8 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_hot);
        if (r8 == null) goto L49;
        r1 = R.id.btn_map_mark;
        CheckBox r9 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.btn_map_mark);
        if (r9 == null) goto L49;
        r1 = R.id.btn_share;
        Button r10 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_share);
        if (r10 == null) goto L49;
        r1 = R.id.btn_track_play;
        Button r11 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_track_play);
        if (r11 == null) goto L49;
        r1 = R.id.data_panel;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r12 == null) goto L49;
        r1 = R.id.downloadGpxIb;
        CheckBox r13 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.downloadGpxIb);
        if (r13 == null) goto L49;
        r1 = R.id.edt_nickname;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (r14 == null) goto L49;
        r1 = R.id.gMapView;
        CustomGoogleMapView r15 = (CustomGoogleMapView) ViewBindings.findChildViewById(rootView, R.id.gMapView);
        if (r15 == null) goto L49;
        r1 = R.id.iv_avatar;
        ImageViewRound r16 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r16 == null) goto L49;
        r1 = R.id.ll_pace_value;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_pace_value);
        if (r17 == null) goto L49;
        r1 = R.id.share_card_map_showMapPoi;
        ImageView r18 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_map_showMapPoi);
        if (r18 == null) goto L49;
        r1 = R.id.tv_avg_bpm_value;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
        if (r19 == null) goto L49;
        r1 = R.id.tv_calories_value;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
        if (r20 == null) goto L49;
        r1 = R.id.tv_dateTime;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
        if (r21 == null) goto L49;
        r1 = R.id.tv_detail_name;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
        if (r22 == null) goto L49;
        r1 = R.id.tv_distance_unit;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
        if (r23 == null) goto L49;
        r1 = R.id.tv_distance_value;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
        if (r24 == null) goto L49;
        r1 = R.id.tv_duration;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
        if (r25 == null) goto L49;
        r1 = R.id.tv_pace_value;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
        if (r26 == null) goto L49;
        return new FragmentSportDetailShareCardMapBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    L49:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailShareCardMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailShareCardMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_share_card_map, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
