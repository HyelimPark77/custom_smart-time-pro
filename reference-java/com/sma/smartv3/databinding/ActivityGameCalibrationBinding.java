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
import androidx.media3.p007ui.PlayerView;
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
        int i = R.id.game_alone_pay_btn;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.game_alone_pay_btn);
        if (button != null) {
            i = R.id.game_calibration_detail_tip;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_calibration_detail_tip);
            if (pFMedium != null) {
                i = R.id.game_calibration_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.game_calibration_image);
                if (imageView != null) {
                    i = R.id.game_calibration_value;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.game_calibration_value);
                    if (pFMedium2 != null) {
                        i = R.id.player_view;
                        PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(rootView, R.id.player_view);
                        if (playerView != null) {
                            i = R.id.video_layout;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.video_layout);
                            if (relativeLayout != null) {
                                i = R.id.video_layout_vertical;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.video_layout_vertical);
                                if (linearLayout != null) {
                                    i = R.id.video_to_replay;
                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.video_to_replay);
                                    if (pFMedium3 != null) {
                                        return new ActivityGameCalibrationBinding((LinearLayout) rootView, button, pFMedium, imageView, pFMedium2, playerView, relativeLayout, linearLayout, pFMedium3);
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
    public static ActivityGameCalibrationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGameCalibrationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_game_calibration, parent, false);
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
