package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.gzuliyujiang.imagepicker.CropImageView;
import com.sma.smartv3.p610ui.trim.view.ZVideoView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoTrimmerViewBinding implements ViewBinding {

    @NonNull
    public final TextView cancelBtn;

    @NonNull
    public final CropImageView cropImageContent;

    @NonNull
    public final TextView finishBtn;

    @NonNull
    public final ImageView iconVideoPlay;

    @NonNull
    public final RelativeLayout layout;

    @NonNull
    public final RelativeLayout layoutSurfaceView;

    @NonNull
    public final ImageView positionIcon;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final LinearLayout seekBarLayout;

    @NonNull
    public final FrameLayout videoFramesLayout;

    @NonNull
    public final RecyclerView videoFramesRecyclerView;

    @NonNull
    public final ZVideoView videoLoader;

    @NonNull
    public final TextView videoShootTip;

    private VideoTrimmerViewBinding(@NonNull RelativeLayout rootView, @NonNull TextView cancelBtn, @NonNull CropImageView cropImageContent, @NonNull TextView finishBtn, @NonNull ImageView iconVideoPlay, @NonNull RelativeLayout layout, @NonNull RelativeLayout layoutSurfaceView, @NonNull ImageView positionIcon, @NonNull LinearLayout seekBarLayout, @NonNull FrameLayout videoFramesLayout, @NonNull RecyclerView videoFramesRecyclerView, @NonNull ZVideoView videoLoader, @NonNull TextView videoShootTip) {
        this.rootView = rootView;
        this.cancelBtn = cancelBtn;
        this.cropImageContent = cropImageContent;
        this.finishBtn = finishBtn;
        this.iconVideoPlay = iconVideoPlay;
        this.layout = layout;
        this.layoutSurfaceView = layoutSurfaceView;
        this.positionIcon = positionIcon;
        this.seekBarLayout = seekBarLayout;
        this.videoFramesLayout = videoFramesLayout;
        this.videoFramesRecyclerView = videoFramesRecyclerView;
        this.videoLoader = videoLoader;
        this.videoShootTip = videoShootTip;
    }

    @NonNull
    public static VideoTrimmerViewBinding bind(@NonNull View rootView) {
        int i = R.id.cancelBtn;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancelBtn);
        if (textView != null) {
            i = R.id.crop_image_content;
            CropImageView cropImageView = (CropImageView) ViewBindings.findChildViewById(rootView, R.id.crop_image_content);
            if (cropImageView != null) {
                i = R.id.finishBtn;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.finishBtn);
                if (textView2 != null) {
                    i = R.id.icon_video_play;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_video_play);
                    if (imageView != null) {
                        i = R.id.layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.layout);
                        if (relativeLayout != null) {
                            i = R.id.layout_surface_view;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.layout_surface_view);
                            if (relativeLayout2 != null) {
                                i = R.id.positionIcon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.positionIcon);
                                if (imageView2 != null) {
                                    i = R.id.seekBarLayout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.seekBarLayout);
                                    if (linearLayout != null) {
                                        i = R.id.video_frames_layout;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.video_frames_layout);
                                        if (frameLayout != null) {
                                            i = R.id.video_frames_recyclerView;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.video_frames_recyclerView);
                                            if (recyclerView != null) {
                                                i = R.id.video_loader;
                                                ZVideoView zVideoView = (ZVideoView) ViewBindings.findChildViewById(rootView, R.id.video_loader);
                                                if (zVideoView != null) {
                                                    i = R.id.video_shoot_tip;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.video_shoot_tip);
                                                    if (textView3 != null) {
                                                        return new VideoTrimmerViewBinding((RelativeLayout) rootView, textView, cropImageView, textView2, imageView, relativeLayout, relativeLayout2, imageView2, linearLayout, frameLayout, recyclerView, zVideoView, textView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static VideoTrimmerViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static VideoTrimmerViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.video_trimmer_view, parent, false);
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
