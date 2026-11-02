package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityGameCalibrationBinding implements ViewBinding {

    @NonNull
    public final Button gameAlonePayBtn;

    @NonNull
    public final PFMedium gameCalibrationDetailTip;

    @NonNull
    public final ImageView gameCalibrationImage;

    @NonNull
    public final PFMedium gameCalibrationValue;

    @NonNull
    public final PlayerView playerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RelativeLayout videoLayout;

    @NonNull
    public final LinearLayout videoLayoutVertical;

    @NonNull
    public final PFMedium videoToReplay;

    private ActivityGameCalibrationBinding(@NonNull LinearLayout rootView, @NonNull Button gameAlonePayBtn, @NonNull PFMedium gameCalibrationDetailTip, @NonNull ImageView gameCalibrationImage, @NonNull PFMedium gameCalibrationValue, @NonNull PlayerView playerView, @NonNull RelativeLayout videoLayout, @NonNull LinearLayout videoLayoutVertical, @NonNull PFMedium videoToReplay) {
        this.rootView = rootView;
        this.gameAlonePayBtn = gameAlonePayBtn;
        this.gameCalibrationDetailTip = gameCalibrationDetailTip;
        this.gameCalibrationImage = gameCalibrationImage;
        this.gameCalibrationValue = gameCalibrationValue;
        this.playerView = playerView;
        this.videoLayout = videoLayout;
        this.videoLayoutVertical = videoLayoutVertical;
        this.videoToReplay = videoToReplay;
    }

    @NonNull
    public static ActivityGameCalibrationBinding bind(@NonNull View rootView) {
        int r0 = R.id.game_alone_pay_btn;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.game_alone_pay_btn);
        if (r4 == null) goto L21;
        r0 = R.id.game_calibration_detail_tip;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_calibration_detail_tip);
        if (r5 == null) goto L21;
        r0 = R.id.game_calibration_image;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.game_calibration_image);
        if (r6 == null) goto L21;
        r0 = R.id.game_calibration_value;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_calibration_value);
        if (r7 == null) goto L21;
        r0 = R.id.player_view;
        PlayerView r8 = (PlayerView) ViewBindings.findChildViewById(rootView, R.id.player_view);
        if (r8 == null) goto L21;
        r0 = R.id.video_layout;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.video_layout);
        if (r9 == null) goto L21;
        r0 = R.id.video_layout_vertical;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.video_layout_vertical);
        if (r10 == null) goto L21;
        r0 = R.id.video_to_replay;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.video_to_replay);
        if (r11 == null) goto L21;
        return new ActivityGameCalibrationBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityGameCalibrationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityGameCalibrationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_game_calibration, parent, false);
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
