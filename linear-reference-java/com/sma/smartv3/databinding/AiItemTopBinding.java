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
        int r1 = R.id.ai_vip_icon;
        AppCompatImageView r5 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.ai_vip_icon);
        if (r5 == null) goto L43;
        r1 = R.id.ai_vip_tv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ai_vip_tv);
        if (r6 == null) goto L43;
        r1 = R.id.distanceUnit;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
        if (r7 == null) goto L43;
        r1 = R.id.iv_avatar;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r8 == null) goto L43;
        r1 = R.id.ivWeather;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivWeather);
        if (r9 == null) goto L43;
        r1 = R.id.llCalories;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
        if (r10 == null) goto L43;
        r1 = R.id.llDistance;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
        if (r11 == null) goto L43;
        r1 = R.id.llSteps;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSteps);
        if (r12 == null) goto L43;
        r1 = R.id.llWeather;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llWeather);
        if (r13 == null) goto L43;
        r1 = R.id.search_item;
        CardView r14 = (CardView) ViewBindings.findChildViewById(rootView, R.id.search_item);
        if (r14 == null) goto L43;
        r1 = R.id.tvCalorie;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvCalorie);
        if (r15 == null) goto L43;
        r1 = R.id.tvDistance;
        DINCondBold r16 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvDistance);
        if (r16 == null) goto L43;
        r1 = R.id.tv_nickname;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
        if (r17 == null) goto L43;
        r1 = R.id.tvStep;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvStep);
        if (r18 == null) goto L43;
        r1 = R.id.tvTemperature;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvTemperature);
        if (r19 == null) goto L43;
        r1 = R.id.tv_title;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r20 == null) goto L43;
        r1 = R.id.tv_vip_info;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_vip_info);
        if (r21 == null) goto L43;
        r1 = R.id.tvWeatherTime;
        DINCondBold r22 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvWeatherTime);
        if (r22 == null) goto L43;
        r1 = R.id.vip_layout;
        FrameLayout r23 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.vip_layout);
        if (r23 == null) goto L43;
        return new AiItemTopBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    L43:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static AiItemTopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiItemTopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_item_top, parent, false);
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
