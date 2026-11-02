package com.sma.smartv3.p610ui.sport.course;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p007ui.PlayerView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.p610ui.sport.course.CourseVideoActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.VideoSeekBar;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n36#2:322\n1563#3:323\n1634#3,3:324\n1878#3,3:327\n*S KotlinDebug\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n*L\n103#1:322\n215#1:323\n215#1:324,3\n230#1:327,3\n*E\n"})
public final class CourseVideoActivity extends BaseActivity implements Player.Listener, View.OnClickListener {
    private boolean isPlay;

    @tb1
    private CourseDetails mCourseDetails;
    private ExoPlayer mPlayer;

    @tb1
    private Timer mTimer;

    @aa1
    private final String TAG = "CourseVideoActivity";

    @aa1
    private final Lazy mPlayerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1Xi0IOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mPlayerView_delegate$lambda$0(this.f7687IO);
        }
    });

    @aa1
    private final Lazy mControllerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OX00O01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mControllerView_delegate$lambda$0(this.f7634IO);
        }
    });

    @aa1
    private final Lazy mCourseMaxTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0IXOI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mCourseMaxTime_delegate$lambda$0(this.f2879IO);
        }
    });

    @aa1
    private final Lazy mCourseCurTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0II0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mCourseCurTime_delegate$lambda$0(this.f3953IO);
        }
    });

    @aa1
    private final Lazy mCourseSeekBar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0iiiXXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mCourseSeekBar_delegate$lambda$0(this.f2610IO);
        }
    });

    @aa1
    private final Lazy mTvOnBack$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X01Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mTvOnBack_delegate$lambda$0(this.f3933IO);
        }
    });

    @aa1
    private final Lazy mTvOnPlay$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX1IIO1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mTvOnPlay_delegate$lambda$0(this.f8280IO);
        }
    });

    @aa1
    private final Lazy mTvHintTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIIXii0XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mTvHintTitle_delegate$lambda$0(this.f4524IO);
        }
    });

    @aa1
    private final Lazy mCourseNext$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI00i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mCourseNext_delegate$lambda$0(this.f7789IO);
        }
    });

    @aa1
    private final Lazy mCoursePlay$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX1Oi0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mCoursePlay_delegate$lambda$0(this.f4994IO);
        }
    });

    @aa1
    private final Lazy mCoursePrevious$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiIX1IOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mCoursePrevious_delegate$lambda$0(this.f3720IO);
        }
    });

    @aa1
    private final Lazy mCourseLockScreen$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseVideoActivity.mCourseLockScreen_delegate$lambda$0(this.f2810IO);
        }
    });

    @aa1
    private final TimerTask task = new OXO1();

    @aa1
    private final List<Integer> mActionIndex = new ArrayList();
    private boolean isShowView = true;

    public static final class OXO1 extends TimerTask {
        public OXO1() {
        }

        public static final void XIi00iiXO(CourseVideoActivity courseVideoActivity) {
            PFMedium mCourseCurTime = courseVideoActivity.getMCourseCurTime();
            ExoPlayer exoPlayer = courseVideoActivity.mPlayer;
            ExoPlayer exoPlayer2 = null;
            if (exoPlayer == null) {
                Intrinsics.XXO("mPlayer");
                exoPlayer = null;
            }
            long j = 1000;
            mCourseCurTime.setText(O0X11OiO.XOO0XOOii((int) (exoPlayer.getCurrentPosition() / j)));
            PFMedium mCourseMaxTime = courseVideoActivity.getMCourseMaxTime();
            ExoPlayer exoPlayer3 = courseVideoActivity.mPlayer;
            if (exoPlayer3 == null) {
                Intrinsics.XXO("mPlayer");
                exoPlayer3 = null;
            }
            mCourseMaxTime.setText(O0X11OiO.XOO0XOOii((int) (exoPlayer3.getDuration() / j)));
            VideoSeekBar mCourseSeekBar = courseVideoActivity.getMCourseSeekBar();
            ExoPlayer exoPlayer4 = courseVideoActivity.mPlayer;
            if (exoPlayer4 == null) {
                Intrinsics.XXO("mPlayer");
                exoPlayer4 = null;
            }
            mCourseSeekBar.setProgress((int) (exoPlayer4.getCurrentPosition() / j));
            VideoSeekBar mCourseSeekBar2 = courseVideoActivity.getMCourseSeekBar();
            ExoPlayer exoPlayer5 = courseVideoActivity.mPlayer;
            if (exoPlayer5 == null) {
                Intrinsics.XXO("mPlayer");
            } else {
                exoPlayer2 = exoPlayer5;
            }
            mCourseSeekBar2.setMax((int) (exoPlayer2.getDuration() / j));
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final CourseVideoActivity courseVideoActivity = CourseVideoActivity.this;
            courseVideoActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I0OI1I0
                @Override // java.lang.Runnable
                public final void run() {
                    CourseVideoActivity.OXO1.XIi00iiXO(courseVideoActivity);
                }
            });
        }
    }

    private final void completeCourse() {
    }

    private final View getMControllerView() {
        return (View) this.mControllerView$delegate.getValue();
    }

    private final PlayerView getMPlayerView() {
        return (PlayerView) this.mPlayerView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mControllerView_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return courseVideoActivity.findViewById(R.id.course_controller_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseCurTime_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (PFMedium) courseVideoActivity.findViewById(R.id.course_video_cur_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCourseLockScreen_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (ImageView) courseVideoActivity.findViewById(R.id.course_lock_screen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCourseMaxTime_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (PFMedium) courseVideoActivity.findViewById(R.id.course_video_max_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCourseNext_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (ImageView) courseVideoActivity.findViewById(R.id.course_next);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCoursePlay_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (ImageView) courseVideoActivity.findViewById(R.id.course_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCoursePrevious_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (ImageView) courseVideoActivity.findViewById(R.id.course_previous);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoSeekBar mCourseSeekBar_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (VideoSeekBar) courseVideoActivity.findViewById(R.id.course_seek_bar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView mPlayerView_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (PlayerView) courseVideoActivity.findViewById(R.id.player_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTvHintTitle_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (TextView) courseVideoActivity.findViewById(R.id.tv_hint_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTvOnBack_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (TextView) courseVideoActivity.findViewById(R.id.tv_on_back);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTvOnPlay_delegate$lambda$0(CourseVideoActivity courseVideoActivity) {
        return (TextView) courseVideoActivity.findViewById(R.id.tv_on_play);
    }

    public final void curPlayAction(boolean z) {
        initActionIndex();
        ExoPlayer exoPlayer = this.mPlayer;
        ExoPlayer exoPlayer2 = null;
        if (exoPlayer == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer = null;
        }
        long currentPosition = exoPlayer.getCurrentPosition() / ((long) 1000);
        int i = 0;
        int i2 = -1;
        for (Object obj : this.mActionIndex) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            int iIntValue = ((Number) obj).intValue();
            LogUtils.m11128d(this.TAG + "  mActionIndex 执行--?> " + i + " " + iIntValue);
            if (z) {
                if (iIntValue > currentPosition && i2 == -1) {
                    i2 = i;
                }
            } else if (iIntValue <= currentPosition) {
                i--;
                i2 = i;
            }
            i = i3;
        }
        if (i2 != -1) {
            ExoPlayer exoPlayer3 = this.mPlayer;
            if (exoPlayer3 == null) {
                Intrinsics.XXO("mPlayer");
            } else {
                exoPlayer2 = exoPlayer3;
            }
            exoPlayer2.seekTo(this.mActionIndex.get(i2).longValue() * 1000);
            return;
        }
        if (z) {
            completeCourse();
            return;
        }
        ExoPlayer exoPlayer4 = this.mPlayer;
        if (exoPlayer4 == null) {
            Intrinsics.XXO("mPlayer");
        } else {
            exoPlayer2 = exoPlayer4;
        }
        exoPlayer2.seekTo(0L);
    }

    public final PFMedium getMCourseCurTime() {
        return (PFMedium) this.mCourseCurTime$delegate.getValue();
    }

    public final ImageView getMCourseLockScreen() {
        return (ImageView) this.mCourseLockScreen$delegate.getValue();
    }

    public final PFMedium getMCourseMaxTime() {
        return (PFMedium) this.mCourseMaxTime$delegate.getValue();
    }

    public final ImageView getMCourseNext() {
        return (ImageView) this.mCourseNext$delegate.getValue();
    }

    public final ImageView getMCoursePlay() {
        return (ImageView) this.mCoursePlay$delegate.getValue();
    }

    public final ImageView getMCoursePrevious() {
        return (ImageView) this.mCoursePrevious$delegate.getValue();
    }

    public final VideoSeekBar getMCourseSeekBar() {
        return (VideoSeekBar) this.mCourseSeekBar$delegate.getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public int getMStatusStyle() {
        return 1;
    }

    @tb1
    public final Timer getMTimer() {
        return this.mTimer;
    }

    public final TextView getMTvHintTitle() {
        return (TextView) this.mTvHintTitle$delegate.getValue();
    }

    public final TextView getMTvOnBack() {
        return (TextView) this.mTvOnBack$delegate.getValue();
    }

    public final TextView getMTvOnPlay() {
        return (TextView) this.mTvOnPlay$delegate.getValue();
    }

    @aa1
    public final TimerTask getTask() {
        return this.task;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.mCourseDetails = (CourseDetails) getMArg3();
    }

    public final void initActionIndex() {
        if (this.mActionIndex.size() == 0) {
            CourseDetails courseDetails = this.mCourseDetails;
            List<ProgressMarkers> progressMarkers = courseDetails != null ? courseDetails.getProgressMarkers() : null;
            if (progressMarkers != null) {
                List<ProgressMarkers> list = progressMarkers;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
                for (ProgressMarkers progressMarkers2 : list) {
                    LogUtils.m11128d(this.TAG + " 当前下标  ---> ???  = " + progressMarkers2.getOffset());
                    arrayList.add(Boolean.valueOf(this.mActionIndex.add(Integer.valueOf(Integer.parseInt(progressMarkers2.getOffset())))));
                }
            }
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        CourseDetails courseDetails = this.mCourseDetails;
        textView.setText(courseDetails != null ? courseDetails.getCourseName() : null);
        setRequestedOrientation(0);
        getMPlayerView().setKeepScreenOn(true);
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this).build();
        Intrinsics.O10IXXX0X(exoPlayerBuild, "build(...)");
        this.mPlayer = exoPlayerBuild;
        PlayerView mPlayerView = getMPlayerView();
        ExoPlayer exoPlayer = this.mPlayer;
        if (exoPlayer == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer = null;
        }
        mPlayerView.setPlayer(exoPlayer);
        ExoPlayer exoPlayer2 = this.mPlayer;
        if (exoPlayer2 == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer2 = null;
        }
        exoPlayer2.addListener(this);
        getMPlayerView().setUseController(false);
        ExoPlayer exoPlayer3 = this.mPlayer;
        if (exoPlayer3 == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer3 = null;
        }
        String mArg0 = getMArg0();
        Intrinsics.XXI(mArg0);
        exoPlayer3.setMediaItem(MediaItem.fromUri(Uri.fromFile(new File(mArg0))));
        ExoPlayer exoPlayer4 = this.mPlayer;
        if (exoPlayer4 == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer4 = null;
        }
        exoPlayer4.prepare();
        ExoPlayer exoPlayer5 = this.mPlayer;
        if (exoPlayer5 == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer5 = null;
        }
        exoPlayer5.play();
        initActionIndex();
        getMCourseSeekBar().setRulerCount(this.mActionIndex);
        getMCourseSeekBar().setEnabled(false);
        PFMedium mCourseCurTime = getMCourseCurTime();
        ExoPlayer exoPlayer6 = this.mPlayer;
        if (exoPlayer6 == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer6 = null;
        }
        mCourseCurTime.setText(String.valueOf(exoPlayer6.getCurrentPosition() / ((long) 1000)));
        PFMedium mCourseMaxTime = getMCourseMaxTime();
        CourseDetails courseDetails2 = this.mCourseDetails;
        mCourseMaxTime.setText(String.valueOf(courseDetails2 != null ? courseDetails2.getCourseTime() : null));
        getMCourseNext().setOnClickListener(this);
        getMCoursePlay().setOnClickListener(this);
        getMCoursePrevious().setOnClickListener(this);
        getMCourseLockScreen().setOnClickListener(this);
        getMPlayerView().setOnClickListener(this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(CollectionsKt___CollectionsKt.O011OOIO0(CollectionsKt__CollectionsKt.iXiX011(Integer.valueOf(Color.parseColor("#21201F")), 0, Integer.valueOf(Color.parseColor("#21201F")))));
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        getMControllerView().setBackground(gradientDrawable);
        Timer timer = new Timer();
        this.mTimer = timer;
        timer.schedule(this.task, 0L, 1000L);
    }

    public final boolean isShowView() {
        return this.isShowView;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_course_video;
    }

    public final void onBack(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@tb1 View view) {
        LogUtils.m11128d(this.TAG + " 点击了监听 isPlay " + this.isPlay);
        ExoPlayer exoPlayer = null;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.course_next) {
            curPlayAction(true);
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != R.id.course_play) {
            if (numValueOf != null && numValueOf.intValue() == R.id.course_previous) {
                curPlayAction(false);
                return;
            }
            if ((numValueOf != null && numValueOf.intValue() == R.id.course_lock_screen) || numValueOf == null || numValueOf.intValue() != R.id.player_view) {
                return;
            }
            this.isShowView = !this.isShowView;
            getMControllerView().setVisibility(this.isShowView ? 0 : 8);
            return;
        }
        if (this.isPlay) {
            ExoPlayer exoPlayer2 = this.mPlayer;
            if (exoPlayer2 == null) {
                Intrinsics.XXO("mPlayer");
            } else {
                exoPlayer = exoPlayer2;
            }
            exoPlayer.pause();
            getMCoursePlay().setImageResource(R.drawable.icon_course_play);
            getMTvOnBack().setVisibility(0);
            getMTvOnPlay().setVisibility(0);
            getMTvHintTitle().setVisibility(0);
        } else {
            ExoPlayer exoPlayer3 = this.mPlayer;
            if (exoPlayer3 == null) {
                Intrinsics.XXO("mPlayer");
            } else {
                exoPlayer = exoPlayer3;
            }
            exoPlayer.play();
            getMCoursePlay().setImageResource(R.drawable.icon_course_pause);
            getMTvOnBack().setVisibility(8);
            getMTvOnPlay().setVisibility(8);
            getMTvHintTitle().setVisibility(8);
        }
        this.isPlay = !this.isPlay;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ExoPlayer exoPlayer = this.mPlayer;
        ExoPlayer exoPlayer2 = null;
        if (exoPlayer == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer = null;
        }
        exoPlayer.removeListener(this);
        ExoPlayer exoPlayer3 = this.mPlayer;
        if (exoPlayer3 == null) {
            Intrinsics.XXO("mPlayer");
        } else {
            exoPlayer2 = exoPlayer3;
        }
        exoPlayer2.release();
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean z) {
        super.onIsPlayingChanged(z);
        LogUtils.m11128d(this.TAG + " onIsPlayingChanged  isPlaying = " + z);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getMPlayerView().onPause();
    }

    public final void onPlay(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ExoPlayer exoPlayer = this.mPlayer;
        if (exoPlayer == null) {
            Intrinsics.XXO("mPlayer");
            exoPlayer = null;
        }
        exoPlayer.play();
        getMCoursePlay().setImageResource(R.drawable.icon_course_pause);
        this.isPlay = !this.isPlay;
        getMTvOnBack().setVisibility(8);
        getMTvOnPlay().setVisibility(8);
        getMTvHintTitle().setVisibility(8);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayWhenReadyChanged(boolean z, int i) {
        super.onPlayWhenReadyChanged(z, i);
        LogUtils.m11128d(this.TAG + " onPlayWhenReadyChanged");
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int i) {
        super.onPlaybackStateChanged(i);
        LogUtils.m11128d(this.TAG + " onPlaybackStateChanged playbackState = " + i);
        if (i != 4) {
            return;
        }
        completeCourse();
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(@aa1 PlaybackException error) {
        Intrinsics.X0O(error, "error");
        super.onPlayerError(error);
        error.getCause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getMPlayerView().onResume();
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(long j) {
        super.onSeekBackIncrementChanged(j);
        LogUtils.m11128d(this.TAG + " onSeekBackIncrementChanged " + j);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(long j) {
        super.onSeekForwardIncrementChanged(j);
        LogUtils.m11128d(this.TAG + " onSeekForwardIncrementChanged " + j);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void setMTimer(@tb1 Timer timer) {
        this.mTimer = timer;
    }

    public final void setShowView(boolean z) {
        this.isShowView = z;
    }
}
