package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.media3.p007ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTouchRepairBinding implements ViewBinding {

    @NonNull
    public final CardView cvPlayerView;

    @NonNull
    public final PlayerView playerView;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium videoToReplay;

    private ActivityTouchRepairBinding(@NonNull LinearLayout rootView, @NonNull CardView cvPlayerView, @NonNull PlayerView playerView, @NonNull LinearLayout root, @NonNull PFMedium videoToReplay) {
        this.rootView = rootView;
        this.cvPlayerView = cvPlayerView;
        this.playerView = playerView;
        this.root = root;
        this.videoToReplay = videoToReplay;
    }

    @NonNull
    public static ActivityTouchRepairBinding bind(@NonNull View rootView) {
        int i = R.id.cv_player_view;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.cv_player_view);
        if (cardView != null) {
            i = R.id.player_view;
            PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(rootView, R.id.player_view);
            if (playerView != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.video_to_replay;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.video_to_replay);
                if (pFMedium != null) {
                    return new ActivityTouchRepairBinding(linearLayout, cardView, playerView, linearLayout, pFMedium);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityTouchRepairBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTouchRepairBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_touch_repair, parent, false);
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
