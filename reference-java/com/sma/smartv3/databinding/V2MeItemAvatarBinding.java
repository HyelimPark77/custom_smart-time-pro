package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class V2MeItemAvatarBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView appNotification;

    @NonNull
    public final ImageView appNotificationIvRemind;

    @NonNull
    public final PFMedium edtNickname;

    @NonNull
    public final LinearLayout idPanel;

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final ImageView ivAvatarVip;

    @NonNull
    public final ImageView ivGender;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium userID;

    private V2MeItemAvatarBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatImageView appNotification, @NonNull ImageView appNotificationIvRemind, @NonNull PFMedium edtNickname, @NonNull LinearLayout idPanel, @NonNull ImageViewRound ivAvatar, @NonNull ImageView ivAvatarVip, @NonNull ImageView ivGender, @NonNull PFMedium userID) {
        this.rootView = rootView;
        this.appNotification = appNotification;
        this.appNotificationIvRemind = appNotificationIvRemind;
        this.edtNickname = edtNickname;
        this.idPanel = idPanel;
        this.ivAvatar = ivAvatar;
        this.ivAvatarVip = ivAvatarVip;
        this.ivGender = ivGender;
        this.userID = userID;
    }

    @NonNull
    public static V2MeItemAvatarBinding bind(@NonNull View rootView) {
        int i = R.id.app_notification;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.app_notification);
        if (appCompatImageView != null) {
            i = R.id.app_notification_ivRemind;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.app_notification_ivRemind);
            if (imageView != null) {
                i = R.id.edt_nickname;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
                if (pFMedium != null) {
                    i = R.id.id_panel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.id_panel);
                    if (linearLayout != null) {
                        i = R.id.iv_avatar;
                        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
                        if (imageViewRound != null) {
                            i = R.id.iv_avatar_vip;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_avatar_vip);
                            if (imageView2 != null) {
                                i = R.id.iv_gender;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_gender);
                                if (imageView3 != null) {
                                    i = R.id.userID;
                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.userID);
                                    if (pFMedium2 != null) {
                                        return new V2MeItemAvatarBinding((RelativeLayout) rootView, appCompatImageView, imageView, pFMedium, linearLayout, imageViewRound, imageView2, imageView3, pFMedium2);
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
    public static V2MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_me_item_avatar, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
