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
        int r0 = R.id.game_member_banner;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.game_member_banner);
        if (r4 == null) goto L15;
        r0 = R.id.game_member_iv_avatar;
        ImageViewRound r5 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.game_member_iv_avatar);
        if (r5 == null) goto L15;
        r0 = R.id.game_member_rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.game_member_rv);
        if (r6 == null) goto L15;
        r0 = R.id.game_member_user_member_time;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_member_user_member_time);
        if (r7 == null) goto L15;
        r0 = R.id.game_member_user_name;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_member_user_name);
        if (r8 == null) goto L15;
        return new ActivityGameMemberBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityGameMemberBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityGameMemberBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_game_member, parent, false);
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
