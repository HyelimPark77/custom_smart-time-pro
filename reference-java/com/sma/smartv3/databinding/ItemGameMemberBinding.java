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
        int i = R.id.item_game_content;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_game_content);
        if (pFMedium != null) {
            i = R.id.item_game_icon;
            ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.item_game_icon);
            if (imageViewRound != null) {
                i = R.id.item_game_play_num;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_game_play_num);
                if (pFMedium2 != null) {
                    i = R.id.item_game_title;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_game_title);
                    if (pFMedium3 != null) {
                        return new ItemGameMemberBinding((LinearLayout) rootView, pFMedium, imageViewRound, pFMedium2, pFMedium3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemGameMemberBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemGameMemberBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_game_member, parent, false);
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
