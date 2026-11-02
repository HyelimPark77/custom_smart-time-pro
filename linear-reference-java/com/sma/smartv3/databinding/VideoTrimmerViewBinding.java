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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.trim.view.ZVideoView;

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
        int r1 = R.id.cancelBtn;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancelBtn);
        if (r5 == null) goto L29;
        r1 = R.id.crop_image_content;
        CropImageView r6 = (CropImageView) ViewBindings.findChildViewById(rootView, R.id.crop_image_content);
        if (r6 == null) goto L29;
        r1 = R.id.finishBtn;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.finishBtn);
        if (r7 == null) goto L29;
        r1 = R.id.icon_video_play;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_video_play);
        if (r8 == null) goto L29;
        r1 = R.id.layout;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.layout);
        if (r9 == null) goto L29;
        r1 = R.id.layout_surface_view;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.layout_surface_view);
        if (r10 == null) goto L29;
        r1 = R.id.positionIcon;
        ImageView r11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.positionIcon);
        if (r11 == null) goto L29;
        r1 = R.id.seekBarLayout;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.seekBarLayout);
        if (r12 == null) goto L29;
        r1 = R.id.video_frames_layout;
        FrameLayout r13 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.video_frames_layout);
        if (r13 == null) goto L29;
        r1 = R.id.video_frames_recyclerView;
        RecyclerView r14 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.video_frames_recyclerView);
        if (r14 == null) goto L29;
        r1 = R.id.video_loader;
        ZVideoView r15 = (ZVideoView) ViewBindings.findChildViewById(rootView, R.id.video_loader);
        if (r15 == null) goto L29;
        r1 = R.id.video_shoot_tip;
        TextView r16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.video_shoot_tip);
        if (r16 == null) goto L29;
        return new VideoTrimmerViewBinding((RelativeLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static VideoTrimmerViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static VideoTrimmerViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.video_trimmer_view, parent, false);
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
