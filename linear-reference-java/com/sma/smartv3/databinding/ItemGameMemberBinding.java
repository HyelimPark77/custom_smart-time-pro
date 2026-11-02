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
public final class ItemGameMemberBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemGameContent;

    @NonNull
    public final ImageViewRound itemGameIcon;

    @NonNull
    public final PFMedium itemGamePlayNum;

    @NonNull
    public final PFMedium itemGameTitle;

    @NonNull
    private final LinearLayout rootView;

    private ItemGameMemberBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemGameContent, @NonNull ImageViewRound itemGameIcon, @NonNull PFMedium itemGamePlayNum, @NonNull PFMedium itemGameTitle) {
        this.rootView = rootView;
        this.itemGameContent = itemGameContent;
        this.itemGameIcon = itemGameIcon;
        this.itemGamePlayNum = itemGamePlayNum;
        this.itemGameTitle = itemGameTitle;
    }

    @NonNull
    public static ItemGameMemberBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_game_content;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_game_content);
        if (r4 == null) goto L13;
        r0 = R.id.item_game_icon;
        ImageViewRound r5 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.item_game_icon);
        if (r5 == null) goto L13;
        r0 = R.id.item_game_play_num;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_game_play_num);
        if (r6 == null) goto L13;
        r0 = R.id.item_game_title;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_game_title);
        if (r7 == null) goto L13;
        return new ItemGameMemberBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemGameMemberBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemGameMemberBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_game_member, parent, false);
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
