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
        int i = R.id.base_share_cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.base_share_cardView);
        if (cardView != null) {
            i = R.id.btn_share;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_share);
            if (button != null) {
                i = R.id.edt_nickname;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
                if (pFMedium != null) {
                    i = R.id.iv_avatar;
                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                    if (imageViewRound != null) {
                        i = R.id.ll_pace_value;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_pace_value);
                        if (linearLayout != null) {
                            i = R.id.share_card_customize_top_ll;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_card_customize_top_ll);
                            if (linearLayout2 != null) {
                                i = R.id.share_card_customize_tv;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_card_customize_tv);
                                if (textView != null) {
                                    i = R.id.share_card_map_camera;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_map_camera);
                                    if (imageView != null) {
                                        i = R.id.share_card_map_edit;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_map_edit);
                                        if (imageView2 != null) {
                                            i = R.id.share_card_rl;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_card_rl);
                                            if (relativeLayout != null) {
                                                i = R.id.share_card_route_image;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_route_image);
                                                if (imageView3 != null) {
                                                    i = R.id.share_card_route_image_figure;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_card_route_image_figure);
                                                    if (imageView4 != null) {
                                                        i = R.id.tv_calories_value;
                                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
                                                        if (pFMedium2 != null) {
                                                            i = R.id.tv_dateTime;
                                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
                                                            if (pFMedium3 != null) {
                                                                i = R.id.tv_detail_name;
                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_detail_name);
                                                                if (pFMedium4 != null) {
                                                                    i = R.id.tv_distance_unit;
                                                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
                                                                    if (pFMedium5 != null) {
                                                                        i = R.id.tv_distance_value;
                                                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
                                                                        if (pFMedium6 != null) {
                                                                            i = R.id.tv_duration;
                                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
                                                                            if (pFMedium7 != null) {
                                                                                i = R.id.tv_pace_value;
                                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
                                                                                if (pFMedium8 != null) {
                                                                                    return new FragmentSportDetailShareCardDataBinding((LinearLayout) rootView, cardView, button, pFMedium, imageViewRound, linearLayout, linearLayout2, textView, imageView, imageView2, relativeLayout, imageView3, imageView4, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8);
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
    public static FragmentSportDetailShareCardDataBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailShareCardDataBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_share_card_data, parent, false);
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
