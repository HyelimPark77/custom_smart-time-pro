package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.media3.ui.PlayerView;
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
        int r0 = R.id.cv_player_view;
        CardView r4 = (CardView) ViewBindings.findChildViewById(rootView, R.id.cv_player_view);
        if (r4 == null) goto L11;
        r0 = R.id.player_view;
        PlayerView r5 = (PlayerView) ViewBindings.findChildViewById(rootView, R.id.player_view);
        if (r5 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.video_to_replay;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.video_to_replay);
        if (r7 == null) goto L11;
        return new ActivityTouchRepairBinding(r3, r4, r5, r3, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityTouchRepairBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityTouchRepairBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_touch_repair, parent, false);
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
