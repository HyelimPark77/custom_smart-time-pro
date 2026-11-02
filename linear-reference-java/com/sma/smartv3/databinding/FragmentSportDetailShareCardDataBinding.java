package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailShareCardDataBinding implements ViewBinding {

    @NonNull
    public final CardView baseShareCardView;

    @NonNull
    public final Button btnShare;

    @NonNull
    public final PFMedium edtNickname;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final LinearLayout llPaceValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout shareCardCustomizeTopLl;

    @NonNull
    public final TextView shareCardCustomizeTv;

    @NonNull
    public final ImageView shareCardMapCamera;

    @NonNull
    public final ImageView shareCardMapEdit;

    @NonNull
    public final RelativeLayout shareCardRl;

    @NonNull
    public final ImageView shareCardRouteImage;

    @NonNull
    public final ImageView shareCardRouteImageFigure;

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

    private FragmentSportDetailShareCardDataBinding(@NonNull LinearLayout rootView, @NonNull CardView baseShareCardView, @NonNull Button btnShare, @NonNull PFMedium edtNickname, @NonNull ImageViewRound ivAvatar, @NonNull LinearLayout llPaceValue, @NonNull LinearLayout shareCardCustomizeTopLl, @NonNull TextView shareCardCustomizeTv, @NonNull ImageView shareCardMapCamera, @NonNull ImageView shareCardMapEdit, @NonNull RelativeLayout shareCardRl, @NonNull ImageView shareCardRouteImage, @NonNull ImageView shareCardRouteImageFigure, @NonNull PFMedium tvCaloriesValue, @NonNull PFMedium tvDateTime, @NonNull PFMedium tvDetailName, @NonNull PFMedium tvDistanceUnit, @NonNull PFMedium tvDistanceValue, @NonNull PFMedium tvDuration, @NonNull PFMedium tvPaceValue) {
        this.rootView = rootView;
        this.baseShareCardView = baseShareCardView;
        this.btnShare = btnShare;
        this.edtNickname = edtNickname;
        this.ivAvatar = ivAvatar;
        this.llPaceValue = llPaceValue;
        this.shareCardCustomizeTopLl = shareCardCustomizeTopLl;
        this.shareCardCustomizeTv = shareCardCustomizeTv;
        this.shareCardMapCamera = shareCardMapCamera;
        this.shareCardMapEdit = shareCardMapEdit;
        this.shareCardRl = shareCardRl;
        this.shareCardRouteImage = shareCardRouteImage;
        this.shareCardRouteImageFigure = shareCardRouteImageFigure;
        this.tvCaloriesValue = tvCaloriesValue;
        this.tvDateTime = tvDateTime;
        this.tvDetailName = tvDetailName;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvDistanceValue = tvDistanceValue;
        this.tvDuration = tvDuration;
        this.tvPaceValue = tvPaceValue;
    }

    @NonNull
    public static FragmentSportDetailShareCardDataBinding bind(@NonNull View rootView) {
        int r1 = R.id.base_share_cardView;
        CardView r5 = (CardView) ViewBindings.findChildViewById(rootView, R.id.base_share_cardView);
        if (r5 == null) goto L43;
        r1 = R.id.btn_share;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_share);
        if (r6 == null) goto L43;
        r1 = R.id.edt_nickname;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (r7 == null) goto L43;
        r1 = R.id.iv_avatar;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r8 == null) goto L43;
        r1 = R.id.ll_pace_value;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_pace_value);
        if (r9 == null) goto L43;
        r1 = R.id.share_card_customize_top_ll;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_card_customize_top_ll);
        if (r10 == null) goto L43;
        r1 = R.id.share_card_customize_tv;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_card_customize_tv);
        if (r11 == null) goto L43;
        r1 = R.id.share_card_map_camera;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_map_camera);
        if (r12 == null) goto L43;
        r1 = R.id.share_card_map_edit;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_map_edit);
        if (r13 == null) goto L43;
        r1 = R.id.share_card_rl;
        RelativeLayout r14 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_card_rl);
        if (r14 == null) goto L43;
        r1 = R.id.share_card_route_image;
        ImageView r15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_route_image);
        if (r15 == null) goto L43;
        r1 = R.id.share_card_route_image_figure;
        ImageView r16 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_route_image_figure);
        if (r16 == null) goto L43;
        r1 = R.id.tv_calories_value;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
        if (r17 == null) goto L43;
        r1 = R.id.tv_dateTime;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
        if (r18 == null) goto L43;
        r1 = R.id.tv_detail_name;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
        if (r19 == null) goto L43;
        r1 = R.id.tv_distance_unit;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
        if (r20 == null) goto L43;
        r1 = R.id.tv_distance_value;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
        if (r21 == null) goto L43;
        r1 = R.id.tv_duration;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
        if (r22 == null) goto L43;
        r1 = R.id.tv_pace_value;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
        if (r23 == null) goto L43;
        return new FragmentSportDetailShareCardDataBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    L43:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailShareCardDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailShareCardDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_share_card_data, parent, false);
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
