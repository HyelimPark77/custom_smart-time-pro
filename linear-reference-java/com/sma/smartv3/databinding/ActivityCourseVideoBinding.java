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
import androidx.media3.ui.PlayerView;
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
        int r1 = R.id.center_view;
        View r4 = ViewBindings.findChildViewById(rootView, R.id.center_view);
        if (r4 == null) goto L33;
        r1 = R.id.course_controller_layout;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.course_controller_layout);
        if (r5 == null) goto L33;
        r1 = R.id.course_lock_screen;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_lock_screen);
        if (r6 == null) goto L33;
        r1 = R.id.course_next;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_next);
        if (r7 == null) goto L33;
        r1 = R.id.course_play;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_play);
        if (r8 == null) goto L33;
        r1 = R.id.course_previous;
        ImageView r9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.course_previous);
        if (r9 == null) goto L33;
        r1 = R.id.course_seek_bar;
        VideoSeekBar r10 = (VideoSeekBar) ViewBindings.findChildViewById(rootView, R.id.course_seek_bar);
        if (r10 == null) goto L33;
        r1 = R.id.course_video_cur_time;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_video_cur_time);
        if (r11 == null) goto L33;
        r1 = R.id.course_video_max_time;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.course_video_max_time);
        if (r12 == null) goto L33;
        r1 = R.id.player_view;
        PlayerView r13 = (PlayerView) ViewBindings.findChildViewById(rootView, R.id.player_view);
        if (r13 == null) goto L33;
        r1 = R.id.seek_layout;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.seek_layout);
        if (r14 == null) goto L33;
        r1 = R.id.tv_hint_title;
        TextView r15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_hint_title);
        if (r15 == null) goto L33;
        r1 = R.id.tv_on_back;
        TextView r16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_on_back);
        if (r16 == null) goto L33;
        r1 = R.id.tv_on_play;
        TextView r17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_on_play);
        if (r17 == null) goto L33;
        return new ActivityCourseVideoBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
    L33:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityCourseVideoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCourseVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_course_video, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
