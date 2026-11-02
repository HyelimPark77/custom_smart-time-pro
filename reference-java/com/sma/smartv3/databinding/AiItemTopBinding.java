package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiItemTopBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView aiVipIcon;

    @NonNull
    public final TextView aiVipTv;

    @NonNull
    public final PFMedium distanceUnit;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final ImageView ivWeather;

    @NonNull
    public final LinearLayout llCalories;

    @NonNull
    public final LinearLayout llDistance;

    @NonNull
    public final LinearLayout llSteps;

    @NonNull
    public final LinearLayout llWeather;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CardView searchItem;

    @NonNull
    public final DINCondBold tvCalorie;

    @NonNull
    public final DINCondBold tvDistance;

    @NonNull
    public final PFMedium tvNickname;

    @NonNull
    public final DINCondBold tvStep;

    @NonNull
    public final DINCondBold tvTemperature;

    @NonNull
    public final PFMedium tvTitle;

    @NonNull
    public final PFMedium tvVipInfo;

    @NonNull
    public final DINCondBold tvWeatherTime;

    @NonNull
    public final FrameLayout vipLayout;

    private AiItemTopBinding(@NonNull LinearLayout rootView, @NonNull AppCompatImageView aiVipIcon, @NonNull TextView aiVipTv, @NonNull PFMedium distanceUnit, @NonNull ImageViewRound ivAvatar, @NonNull ImageView ivWeather, @NonNull LinearLayout llCalories, @NonNull LinearLayout llDistance, @NonNull LinearLayout llSteps, @NonNull LinearLayout llWeather, @NonNull CardView searchItem, @NonNull DINCondBold tvCalorie, @NonNull DINCondBold tvDistance, @NonNull PFMedium tvNickname, @NonNull DINCondBold tvStep, @NonNull DINCondBold tvTemperature, @NonNull PFMedium tvTitle, @NonNull PFMedium tvVipInfo, @NonNull DINCondBold tvWeatherTime, @NonNull FrameLayout vipLayout) {
        this.rootView = rootView;
        this.aiVipIcon = aiVipIcon;
        this.aiVipTv = aiVipTv;
        this.distanceUnit = distanceUnit;
        this.ivAvatar = ivAvatar;
        this.ivWeather = ivWeather;
        this.llCalories = llCalories;
        this.llDistance = llDistance;
        this.llSteps = llSteps;
        this.llWeather = llWeather;
        this.searchItem = searchItem;
        this.tvCalorie = tvCalorie;
        this.tvDistance = tvDistance;
        this.tvNickname = tvNickname;
        this.tvStep = tvStep;
        this.tvTemperature = tvTemperature;
        this.tvTitle = tvTitle;
        this.tvVipInfo = tvVipInfo;
        this.tvWeatherTime = tvWeatherTime;
        this.vipLayout = vipLayout;
    }

    @NonNull
    public static AiItemTopBinding bind(@NonNull View rootView) {
        int i = R.id.ai_vip_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.ai_vip_icon);
        if (appCompatImageView != null) {
            i = R.id.ai_vip_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ai_vip_tv);
            if (textView != null) {
                i = R.id.distanceUnit;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
                if (pFMedium != null) {
                    i = R.id.iv_avatar;
                    ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                    if (imageViewRound != null) {
                        i = R.id.ivWeather;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivWeather);
                        if (imageView != null) {
                            i = R.id.llCalories;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
                            if (linearLayout != null) {
                                i = R.id.llDistance;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
                                if (linearLayout2 != null) {
                                    i = R.id.llSteps;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSteps);
                                    if (linearLayout3 != null) {
                                        i = R.id.llWeather;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llWeather);
                                        if (linearLayout4 != null) {
                                            i = R.id.search_item;
                                            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.search_item);
                                            if (cardView != null) {
                                                i = R.id.tvCalorie;
                                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvCalorie);
                                                if (dINCondBold != null) {
                                                    i = R.id.tvDistance;
                                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvDistance);
                                                    if (dINCondBold2 != null) {
                                                        i = R.id.tv_nickname;
                                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
                                                        if (pFMedium2 != null) {
                                                            i = R.id.tvStep;
                                                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvStep);
                                                            if (dINCondBold3 != null) {
                                                                i = R.id.tvTemperature;
                                                                DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvTemperature);
                                                                if (dINCondBold4 != null) {
                                                                    i = R.id.tv_title;
                                                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                                                                    if (pFMedium3 != null) {
                                                                        i = R.id.tv_vip_info;
                                                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_vip_info);
                                                                        if (pFMedium4 != null) {
                                                                            i = R.id.tvWeatherTime;
                                                                            DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvWeatherTime);
                                                                            if (dINCondBold5 != null) {
                                                                                i = R.id.vip_layout;
                                                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.vip_layout);
                                                                                if (frameLayout != null) {
                                                                                    return new AiItemTopBinding((LinearLayout) rootView, appCompatImageView, textView, pFMedium, imageViewRound, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, cardView, dINCondBold, dINCondBold2, pFMedium2, dINCondBold3, dINCondBold4, pFMedium3, pFMedium4, dINCondBold5, frameLayout);
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
    public static AiItemTopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiItemTopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_item_top, parent, false);
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
