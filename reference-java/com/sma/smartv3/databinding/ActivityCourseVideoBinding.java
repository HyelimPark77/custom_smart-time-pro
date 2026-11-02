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
import androidx.media3.p007ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.VideoSeekBar;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCourseVideoBinding implements ViewBinding {

    @NonNull
    public final View centerView;

    @NonNull
    public final RelativeLayout courseControllerLayout;

    @NonNull
    public final ImageView courseLockScreen;

    @NonNull
    public final ImageView courseNext;

    @NonNull
    public final ImageView coursePlay;

    @NonNull
    public final ImageView coursePrevious;

    @NonNull
    public final VideoSeekBar courseSeekBar;

    @NonNull
    public final PFMedium courseVideoCurTime;

    @NonNull
    public final PFMedium courseVideoMaxTime;

    @NonNull
    public final PlayerView playerView;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final LinearLayout seekLayout;

    @NonNull
    public final TextView tvHintTitle;

    @NonNull
    public final TextView tvOnBack;

    @NonNull
    public final TextView tvOnPlay;

    private ActivityCourseVideoBinding(@NonNull FrameLayout rootView, @NonNull View centerView, @NonNull RelativeLayout courseControllerLayout, @NonNull ImageView courseLockScreen, @NonNull ImageView courseNext, @NonNull ImageView coursePlay, @NonNull ImageView coursePrevious, @NonNull VideoSeekBar courseSeekBar, @NonNull PFMedium courseVideoCurTime, @NonNull PFMedium courseVideoMaxTime, @NonNull PlayerView playerView, @NonNull LinearLayout seekLayout, @NonNull TextView tvHintTitle, @NonNull TextView tvOnBack, @NonNull TextView tvOnPlay) {
        this.rootView = rootView;
        this.centerView = centerView;
        this.courseControllerLayout = courseControllerLayout;
        this.courseLockScreen = courseLockScreen;
        this.courseNext = courseNext;
        this.coursePlay = coursePlay;
        this.coursePrevious = coursePrevious;
        this.courseSeekBar = courseSeekBar;
        this.courseVideoCurTime = courseVideoCurTime;
        this.courseVideoMaxTime = courseVideoMaxTime;
        this.playerView = playerView;
        this.seekLayout = seekLayout;
        this.tvHintTitle = tvHintTitle;
        this.tvOnBack = tvOnBack;
        this.tvOnPlay = tvOnPlay;
    }

    @NonNull
    public static ActivityCourseVideoBinding bind(@NonNull View rootView) {
        int i = R.id.center_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.center_view);
        if (viewFindChildViewById != null) {
            i = R.id.course_controller_layout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_controller_layout);
            if (relativeLayout != null) {
                i = R.id.course_lock_screen;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_lock_screen);
                if (imageView != null) {
                    i = R.id.course_next;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_next);
                    if (imageView2 != null) {
                        i = R.id.course_play;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_play);
                        if (imageView3 != null) {
                            i = R.id.course_previous;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_previous);
                            if (imageView4 != null) {
                                i = R.id.course_seek_bar;
                                VideoSeekBar videoSeekBar = (VideoSeekBar) ViewBindings.findChildViewById(rootView, R.id.course_seek_bar);
                                if (videoSeekBar != null) {
                                    i = R.id.course_video_cur_time;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_video_cur_time);
                                    if (pFMedium != null) {
                                        i = R.id.course_video_max_time;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_video_max_time);
                                        if (pFMedium2 != null) {
                                            i = R.id.player_view;
                                            PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(rootView, R.id.player_view);
                                            if (playerView != null) {
                                                i = R.id.seek_layout;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.seek_layout);
                                                if (linearLayout != null) {
                                                    i = R.id.tv_hint_title;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_hint_title);
                                                    if (textView != null) {
                                                        i = R.id.tv_on_back;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_on_back);
                                                        if (textView2 != null) {
                                                            i = R.id.tv_on_play;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_on_play);
                                                            if (textView3 != null) {
                                                                return new ActivityCourseVideoBinding((FrameLayout) rootView, viewFindChildViewById, relativeLayout, imageView, imageView2, imageView3, imageView4, videoSeekBar, pFMedium, pFMedium2, playerView, linearLayout, textView, textView2, textView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCourseVideoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCourseVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_course_video, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
