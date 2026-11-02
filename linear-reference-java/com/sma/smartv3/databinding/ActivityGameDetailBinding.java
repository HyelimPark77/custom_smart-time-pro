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
        int r0 = R.id.game_alone_pay_btn;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.game_alone_pay_btn);
        if (r4 == null) goto L25;
        r0 = R.id.game_detail_content;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_content);
        if (r5 == null) goto L25;
        r0 = R.id.game_detail_content_icon;
        ImageViewRound r6 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.game_detail_content_icon);
        if (r6 == null) goto L25;
        r0 = R.id.game_detail_iv_avatar;
        ImageViewRound r7 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.game_detail_iv_avatar);
        if (r7 == null) goto L25;
        r0 = R.id.game_detail_new_label;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_new_label);
        if (r8 == null) goto L25;
        r0 = R.id.game_detail_pay_label;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_pay_label);
        if (r9 == null) goto L25;
        r0 = R.id.game_detail_play_num;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_play_num);
        if (r10 == null) goto L25;
        r0 = R.id.game_detail_title;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_detail_title);
        if (r11 == null) goto L25;
        r0 = R.id.game_pay_layout;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.game_pay_layout);
        if (r12 == null) goto L25;
        r0 = R.id.game_pay_member_btn;
        Button r13 = (Button) ViewBindings.findChildViewById(rootView, R.id.game_pay_member_btn);
        if (r13 == null) goto L25;
        return new ActivityGameDetailBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityGameDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityGameDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_game_detail, parent, false);
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
