package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityUserInfoBinding implements ViewBinding {

    @NonNull
    public final ImageViewRound ivAvatar;

    @NonNull
    public final LinearLayout llEmailItem;

    @NonNull
    public final LinearLayout llPhoneItem;

    @NonNull
    public final LinearLayout llReceivePhoneItem;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvBirthday;

    @NonNull
    public final PFMedium tvEmail;

    @NonNull
    public final PFMedium tvGender;

    @NonNull
    public final PFMedium tvHeight;

    @NonNull
    public final PFMedium tvNickname;

    @NonNull
    public final PFMedium tvPhone;

    @NonNull
    public final PFMedium tvReceivePhone;

    @NonNull
    public final PFMedium tvWeight;

    private ActivityUserInfoBinding(@NonNull LinearLayout rootView_, @NonNull ImageViewRound ivAvatar, @NonNull LinearLayout llEmailItem, @NonNull LinearLayout llPhoneItem, @NonNull LinearLayout llReceivePhoneItem, @NonNull LinearLayout rootView, @NonNull PFMedium tvBirthday, @NonNull PFMedium tvEmail, @NonNull PFMedium tvGender, @NonNull PFMedium tvHeight, @NonNull PFMedium tvNickname, @NonNull PFMedium tvPhone, @NonNull PFMedium tvReceivePhone, @NonNull PFMedium tvWeight) {
        this.rootView_ = rootView_;
        this.ivAvatar = ivAvatar;
        this.llEmailItem = llEmailItem;
        this.llPhoneItem = llPhoneItem;
        this.llReceivePhoneItem = llReceivePhoneItem;
        this.rootView = rootView;
        this.tvBirthday = tvBirthday;
        this.tvEmail = tvEmail;
        this.tvGender = tvGender;
        this.tvHeight = tvHeight;
        this.tvNickname = tvNickname;
        this.tvPhone = tvPhone;
        this.tvReceivePhone = tvReceivePhone;
        this.tvWeight = tvWeight;
    }

    @NonNull
    public static ActivityUserInfoBinding bind(@NonNull View rootView) {
        int r1 = R.id.iv_avatar;
        ImageViewRound r5 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (r5 == null) goto L29;
        r1 = R.id.ll_email_item;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_email_item);
        if (r6 == null) goto L29;
        r1 = R.id.ll_phone_item;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_phone_item);
        if (r7 == null) goto L29;
        r1 = R.id.ll_receive_phone_item;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_receive_phone_item);
        if (r8 == null) goto L29;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.tv_birthday;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_birthday);
        if (r10 == null) goto L29;
        r1 = R.id.tv_email;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_email);
        if (r11 == null) goto L29;
        r1 = R.id.tv_gender;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_gender);
        if (r12 == null) goto L29;
        r1 = R.id.tv_height;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_height);
        if (r13 == null) goto L29;
        r1 = R.id.tv_nickname;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
        if (r14 == null) goto L29;
        r1 = R.id.tv_phone;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_phone);
        if (r15 == null) goto L29;
        r1 = R.id.tv_receive_phone;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_receive_phone);
        if (r16 == null) goto L29;
        r1 = R.id.tv_weight;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weight);
        if (r17 == null) goto L29;
        return new ActivityUserInfoBinding(r4, r5, r6, r7, r8, r4, r10, r11, r12, r13, r14, r15, r16, r17);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityUserInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityUserInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_user_info, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
