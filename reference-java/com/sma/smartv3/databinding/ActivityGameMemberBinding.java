package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityGameMemberBinding implements ViewBinding {

    @NonNull
    public final LinearLayout gameMemberBanner;

    @NonNull
    public final ImageViewRound gameMemberIvAvatar;

    @NonNull
    public final RecyclerView gameMemberRv;

    @NonNull
    public final PFMedium gameMemberUserMemberTime;

    @NonNull
    public final PFMedium gameMemberUserName;

    @NonNull
    private final RelativeLayout rootView;

    private ActivityGameMemberBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout gameMemberBanner, @NonNull ImageViewRound gameMemberIvAvatar, @NonNull RecyclerView gameMemberRv, @NonNull PFMedium gameMemberUserMemberTime, @NonNull PFMedium gameMemberUserName) {
        this.rootView = rootView;
        this.gameMemberBanner = gameMemberBanner;
        this.gameMemberIvAvatar = gameMemberIvAvatar;
        this.gameMemberRv = gameMemberRv;
        this.gameMemberUserMemberTime = gameMemberUserMemberTime;
        this.gameMemberUserName = gameMemberUserName;
    }

    @NonNull
    public static ActivityGameMemberBinding bind(@NonNull View rootView) {
        int i = R.id.game_member_banner;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.game_member_banner);
        if (linearLayout != null) {
            i = R.id.game_member_iv_avatar;
            ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.game_member_iv_avatar);
            if (imageViewRound != null) {
                i = R.id.game_member_rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.game_member_rv);
                if (recyclerView != null) {
                    i = R.id.game_member_user_member_time;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_member_user_member_time);
                    if (pFMedium != null) {
                        i = R.id.game_member_user_name;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_member_user_name);
                        if (pFMedium2 != null) {
                            return new ActivityGameMemberBinding((RelativeLayout) rootView, linearLayout, imageViewRound, recyclerView, pFMedium, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityGameMemberBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGameMemberBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_game_member, parent, false);
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
