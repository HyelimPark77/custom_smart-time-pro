package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityGameDetailBinding implements ViewBinding {

    @NonNull
    public final Button gameAlonePayBtn;

    @NonNull
    public final PFMedium gameDetailContent;

    @NonNull
    public final ImageViewRound gameDetailContentIcon;

    @NonNull
    public final ImageViewRound gameDetailIvAvatar;

    @NonNull
    public final PFMedium gameDetailNewLabel;

    @NonNull
    public final PFMedium gameDetailPayLabel;

    @NonNull
    public final PFMedium gameDetailPlayNum;

    @NonNull
    public final PFMedium gameDetailTitle;

    @NonNull
    public final LinearLayout gamePayLayout;

    @NonNull
    public final Button gamePayMemberBtn;

    @NonNull
    private final LinearLayout rootView;

    private ActivityGameDetailBinding(@NonNull LinearLayout rootView, @NonNull Button gameAlonePayBtn, @NonNull PFMedium gameDetailContent, @NonNull ImageViewRound gameDetailContentIcon, @NonNull ImageViewRound gameDetailIvAvatar, @NonNull PFMedium gameDetailNewLabel, @NonNull PFMedium gameDetailPayLabel, @NonNull PFMedium gameDetailPlayNum, @NonNull PFMedium gameDetailTitle, @NonNull LinearLayout gamePayLayout, @NonNull Button gamePayMemberBtn) {
        this.rootView = rootView;
        this.gameAlonePayBtn = gameAlonePayBtn;
        this.gameDetailContent = gameDetailContent;
        this.gameDetailContentIcon = gameDetailContentIcon;
        this.gameDetailIvAvatar = gameDetailIvAvatar;
        this.gameDetailNewLabel = gameDetailNewLabel;
        this.gameDetailPayLabel = gameDetailPayLabel;
        this.gameDetailPlayNum = gameDetailPlayNum;
        this.gameDetailTitle = gameDetailTitle;
        this.gamePayLayout = gamePayLayout;
        this.gamePayMemberBtn = gamePayMemberBtn;
    }

    @NonNull
    public static ActivityGameDetailBinding bind(@NonNull View rootView) {
        int i = R.id.game_alone_pay_btn;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.game_alone_pay_btn);
        if (button != null) {
            i = R.id.game_detail_content;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_content);
            if (pFMedium != null) {
                i = R.id.game_detail_content_icon;
                ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.game_detail_content_icon);
                if (imageViewRound != null) {
                    i = R.id.game_detail_iv_avatar;
                    ImageViewRound imageViewRound2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.game_detail_iv_avatar);
                    if (imageViewRound2 != null) {
                        i = R.id.game_detail_new_label;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_new_label);
                        if (pFMedium2 != null) {
                            i = R.id.game_detail_pay_label;
                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_pay_label);
                            if (pFMedium3 != null) {
                                i = R.id.game_detail_play_num;
                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_play_num);
                                if (pFMedium4 != null) {
                                    i = R.id.game_detail_title;
                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_title);
                                    if (pFMedium5 != null) {
                                        i = R.id.game_pay_layout;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.game_pay_layout);
                                        if (linearLayout != null) {
                                            i = R.id.game_pay_member_btn;
                                            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.game_pay_member_btn);
                                            if (button2 != null) {
                                                return new ActivityGameDetailBinding((LinearLayout) rootView, button, pFMedium, imageViewRound, imageViewRound2, pFMedium2, pFMedium3, pFMedium4, pFMedium5, linearLayout, button2);
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
    public static ActivityGameDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGameDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_game_detail, parent, false);
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
