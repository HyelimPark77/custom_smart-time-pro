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
        int i = R.id.iv_avatar;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_avatar);
        if (imageViewRound != null) {
            i = R.id.ll_email_item;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_email_item);
            if (linearLayout != null) {
                i = R.id.ll_phone_item;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_phone_item);
                if (linearLayout2 != null) {
                    i = R.id.ll_receive_phone_item;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_receive_phone_item);
                    if (linearLayout3 != null) {
                        LinearLayout linearLayout4 = (LinearLayout) rootView;
                        i = R.id.tv_birthday;
                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_birthday);
                        if (pFMedium != null) {
                            i = R.id.tv_email;
                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_email);
                            if (pFMedium2 != null) {
                                i = R.id.tv_gender;
                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_gender);
                                if (pFMedium3 != null) {
                                    i = R.id.tv_height;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_height);
                                    if (pFMedium4 != null) {
                                        i = R.id.tv_nickname;
                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_nickname);
                                        if (pFMedium5 != null) {
                                            i = R.id.tv_phone;
                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_phone);
                                            if (pFMedium6 != null) {
                                                i = R.id.tv_receive_phone;
                                                PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_receive_phone);
                                                if (pFMedium7 != null) {
                                                    i = R.id.tv_weight;
                                                    PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weight);
                                                    if (pFMedium8 != null) {
                                                        return new ActivityUserInfoBinding(linearLayout4, imageViewRound, linearLayout, linearLayout2, linearLayout3, linearLayout4, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8);
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
    public static ActivityUserInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityUserInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_user_info, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
