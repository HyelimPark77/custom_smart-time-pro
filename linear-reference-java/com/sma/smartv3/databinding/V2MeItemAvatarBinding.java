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
        int r0 = R.id.app_notification;
        AppCompatImageView r4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.app_notification);
        if (r4 == null) goto L21;
        r0 = R.id.app_notification_ivRemind;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.app_notification_ivRemind);
        if (r5 == null) goto L21;
        r0 = R.id.edt_nickname;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_nickname);
        if (r6 == null) goto L21;
        r0 = R.id.id_panel;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.id_panel);
        if (r7 == null) goto L21;
        r0 = R.id.iv_avatar;
        ImageViewRound r8 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r8 == null) goto L21;
        r0 = R.id.iv_avatar_vip;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_avatar_vip);
        if (r9 == null) goto L21;
        r0 = R.id.iv_gender;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_gender);
        if (r10 == null) goto L21;
        r0 = R.id.userID;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.userID);
        if (r11 == null) goto L21;
        return new V2MeItemAvatarBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2MeItemAvatarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_me_item_avatar, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
