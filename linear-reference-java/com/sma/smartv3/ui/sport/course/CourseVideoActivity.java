package com.sma.smartv3.ui.sport.course;

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
import androidx.media3.ui.PlayerView;
import com.android.mltcode.paycertificationapi.I0OI1I0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0iiiXXi;
import com.android.mltcode.paycertificationapi.O1XXi;
import com.android.mltcode.paycertificationapi.OI0IXOI1;
import com.android.mltcode.paycertificationapi.OiIX1IOI;
import com.android.mltcode.paycertificationapi.X01Xi;
import com.android.mltcode.paycertificationapi.X0II0;
import com.android.mltcode.paycertificationapi.XIIXii0XO;
import com.android.mltcode.paycertificationapi.XX1Oi0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1OX00O01;
import com.android.mltcode.paycertificationapi.i1Xi0IOO;
import com.android.mltcode.paycertificationapi.iI00i;
import com.android.mltcode.paycertificationapi.iX1IIO1i;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.VideoSeekBar;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n36#2:322\n1563#3:323\n1634#3,3:324\n1878#3,3:327\n*S KotlinDebug\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n*L\n103#1:322\n215#1:323\n215#1:324,3\n230#1:327,3\n*E\n"})
public final class CourseVideoActivity extends BaseActivity implements Player.Listener, View.OnClickListener {

    @aa1
    private final String TAG;
    private boolean isPlay;
    private boolean isShowView;

    @aa1
    private final List<Integer> mActionIndex;

    @aa1
    private final Lazy mControllerView$delegate;

    @aa1
    private final Lazy mCourseCurTime$delegate;

    @tb1
    private CourseDetails mCourseDetails;

    @aa1
    private final Lazy mCourseLockScreen$delegate;

    @aa1
    private final Lazy mCourseMaxTime$delegate;

    @aa1
    private final Lazy mCourseNext$delegate;

    @aa1
    private final Lazy mCoursePlay$delegate;

    @aa1
    private final Lazy mCoursePrevious$delegate;

    @aa1
    private final Lazy mCourseSeekBar$delegate;
    private ExoPlayer mPlayer;

    @aa1
    private final Lazy mPlayerView$delegate;

    @tb1
    private Timer mTimer;

    @aa1
    private final Lazy mTvHintTitle$delegate;

    @aa1
    private final Lazy mTvOnBack$delegate;

    @aa1
    private final Lazy mTvOnPlay$delegate;

    @aa1
    private final TimerTask task;

    public static final class OXO1 extends TimerTask {
        public final /* synthetic */ CourseVideoActivity IO;

        public OXO1(CourseVideoActivity r1) {
            this.IO = r1;
        }

        public static /* synthetic */ void OXO1(CourseVideoActivity r0) {
            XIi00iiXO(r0);
        }

        public static final void XIi00iiXO(CourseVideoActivity r8) {
            PFMedium r0 = r8.getMCourseCurTime();
            ExoPlayer r1 = CourseVideoActivity.access$getMPlayer$p(r8);
            ExoPlayer r2 = null;
            if (r1 != null) goto L5;
            Intrinsics.XXO("mPlayer");
            r1 = null;
        L5:
            long r6 = 1000;
            r0.setText(O0X11OiO.XOO0XOOii((int) (r1.getCurrentPosition() / r6)));
            PFMedium r3 = r8.getMCourseMaxTime();
            ExoPlayer r4 = CourseVideoActivity.access$getMPlayer$p(r8);
            if (r4 != null) goto L8;
            Intrinsics.XXO("mPlayer");
            r4 = null;
        L8:
            r3.setText(O0X11OiO.XOO0XOOii((int) (r4.getDuration() / r6)));
            VideoSeekBar r5 = r8.getMCourseSeekBar();
            ExoPlayer r7 = CourseVideoActivity.access$getMPlayer$p(r8);
            if (r7 != null) goto L11;
            Intrinsics.XXO("mPlayer");
            r7 = null;
        L11:
            r5.setProgress((int) (r7.getCurrentPosition() / r6));
            VideoSeekBar r9 = r8.getMCourseSeekBar();
            ExoPlayer r10 = CourseVideoActivity.access$getMPlayer$p(r8);
            if (r10 != null) goto L14;
            Intrinsics.XXO("mPlayer");
        L15:
            r9.setMax((int) (r2.getDuration() / r6));
            return;
        L14:
            r2 = r10;
            goto L15
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final CourseVideoActivity r0 = this.IO;
            r0.runOnUiThread(new I0OI1I0(r0));
        }
    }

    public CourseVideoActivity() {
        this.TAG = "CourseVideoActivity";
        this.mPlayerView$delegate = LazyKt__LazyJVMKt.iO(new i1Xi0IOO(this));
        this.mControllerView$delegate = LazyKt__LazyJVMKt.iO(new i1OX00O01(this));
        this.mCourseMaxTime$delegate = LazyKt__LazyJVMKt.iO(new OI0IXOI1(this));
        this.mCourseCurTime$delegate = LazyKt__LazyJVMKt.iO(new X0II0(this));
        this.mCourseSeekBar$delegate = LazyKt__LazyJVMKt.iO(new O0iiiXXi(this));
        this.mTvOnBack$delegate = LazyKt__LazyJVMKt.iO(new X01Xi(this));
        this.mTvOnPlay$delegate = LazyKt__LazyJVMKt.iO(new iX1IIO1i(this));
        this.mTvHintTitle$delegate = LazyKt__LazyJVMKt.iO(new XIIXii0XO(this));
        this.mCourseNext$delegate = LazyKt__LazyJVMKt.iO(new iI00i(this));
        this.mCoursePlay$delegate = LazyKt__LazyJVMKt.iO(new XX1Oi0i(this));
        this.mCoursePrevious$delegate = LazyKt__LazyJVMKt.iO(new OiIX1IOI(this));
        this.mCourseLockScreen$delegate = LazyKt__LazyJVMKt.iO(new O1XXi(this));
        this.task = new OXO1(this);
        this.mActionIndex = new ArrayList();
        this.isShowView = true;
    }

    public static /* synthetic */ ImageView I0iXXO(CourseVideoActivity r0) {
        return mCoursePlay_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(CourseVideoActivity r0) {
        return mTvOnBack_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView IIX1OXO(CourseVideoActivity r0) {
        return mCourseNext_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(CourseVideoActivity r0) {
        return mCourseCurTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(CourseVideoActivity r0) {
        return mCoursePrevious_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PlayerView OiIIX101O(CourseVideoActivity r0) {
        return mPlayerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(CourseVideoActivity r0) {
        return mTvOnPlay_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(CourseVideoActivity r0) {
        return mTvHintTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XX0(CourseVideoActivity r0) {
        return mCourseLockScreen_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(CourseVideoActivity r0) {
        return mCourseMaxTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ VideoSeekBar XiOIO(CourseVideoActivity r0) {
        return mCourseSeekBar_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ ExoPlayer access$getMPlayer$p(CourseVideoActivity r0) {
        return r0.mPlayer;
    }

    private final void completeCourse() {
    }

    private final View getMControllerView() {
        return (View) getValue();
    }

    private final PlayerView getMPlayerView() {
        return (PlayerView) getValue();
    }

    public static /* synthetic */ View iIiiO(CourseVideoActivity r0) {
        return mControllerView_delegate$lambda$0(r0);
    }

    private static final View mControllerView_delegate$lambda$0(CourseVideoActivity r1) {
        return r1.findViewById(R.id.course_controller_layout);
    }

    private static final PFMedium mCourseCurTime_delegate$lambda$0(CourseVideoActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_video_cur_time);
    }

    private static final ImageView mCourseLockScreen_delegate$lambda$0(CourseVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.course_lock_screen);
    }

    private static final PFMedium mCourseMaxTime_delegate$lambda$0(CourseVideoActivity r1) {
        return (PFMedium) r1.findViewById(R.id.course_video_max_time);
    }

    private static final ImageView mCourseNext_delegate$lambda$0(CourseVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.course_next);
    }

    private static final ImageView mCoursePlay_delegate$lambda$0(CourseVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.course_play);
    }

    private static final ImageView mCoursePrevious_delegate$lambda$0(CourseVideoActivity r1) {
        return (ImageView) r1.findViewById(R.id.course_previous);
    }

    private static final VideoSeekBar mCourseSeekBar_delegate$lambda$0(CourseVideoActivity r1) {
        return (VideoSeekBar) r1.findViewById(R.id.course_seek_bar);
    }

    private static final PlayerView mPlayerView_delegate$lambda$0(CourseVideoActivity r1) {
        return (PlayerView) r1.findViewById(R.id.player_view);
    }

    private static final TextView mTvHintTitle_delegate$lambda$0(CourseVideoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_hint_title);
    }

    private static final TextView mTvOnBack_delegate$lambda$0(CourseVideoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_on_back);
    }

    private static final TextView mTvOnPlay_delegate$lambda$0(CourseVideoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_on_play);
    }

    public final void curPlayAction(boolean r13) {
        initActionIndex();
        ExoPlayer r0 = this.mPlayer;
        ExoPlayer r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mPlayer");
        r0 = null;
    L5:
        long r3 = r0.getCurrentPosition() / ((long) 1000);
        Iterator<T> r2 = this.mActionIndex.iterator();
        int r6 = 0;
        int r7 = -1;
    L7:
        if (r2.hasNext() == false) goto L21;
        Object r8 = r2.next();
        int r9 = r6 + 1;
        if (r6 >= 0) goto L11;
        CollectionsKt__CollectionsKt.XOX0O0();
    L11:
        int r10 = ((Number) r8).intValue();
        LogUtils.d(new Object[]{this.TAG + "  mActionIndex 执行--?> " + r6 + " " + r10});
        if (r13 == false) goto L18;
        if (r10 <= r3) goto L20;
        if (r7 != (-1)) goto L20;
    L16:
        r7 = r6;
    L20:
        r6 = r9;
        goto L7
    L18:
        if (r10 > r3) goto L20;
        r6 = r6 - 1;
        goto L16
    L21:
        if (r7 != (-1)) goto L31;
        if (r13 == false) goto L25;
        completeCourse();
        return;
    L25:
        ExoPlayer r14 = this.mPlayer;
        if (r14 != null) goto L28;
        Intrinsics.XXO("mPlayer");
    L29:
        r1.seekTo(0);
        return;
    L28:
        r1 = r14;
        goto L29
    L31:
        ExoPlayer r15 = this.mPlayer;
        if (r15 != null) goto L34;
        Intrinsics.XXO("mPlayer");
    L35:
        r1.seekTo(this.mActionIndex.get(r7).longValue() * 1000);
        return;
    L34:
        r1 = r15;
        goto L35
    }

    public final PFMedium getMCourseCurTime() {
        return (PFMedium) getValue();
    }

    public final ImageView getMCourseLockScreen() {
        return (ImageView) getValue();
    }

    public final PFMedium getMCourseMaxTime() {
        return (PFMedium) getValue();
    }

    public final ImageView getMCourseNext() {
        return (ImageView) getValue();
    }

    public final ImageView getMCoursePlay() {
        return (ImageView) getValue();
    }

    public final ImageView getMCoursePrevious() {
        return (ImageView) getValue();
    }

    public final VideoSeekBar getMCourseSeekBar() {
        return (VideoSeekBar) getValue();
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
        return (TextView) getValue();
    }

    public final TextView getMTvOnBack() {
        return (TextView) getValue();
    }

    public final TextView getMTvOnPlay() {
        return (TextView) getValue();
    }

    @aa1
    public final TimerTask getTask() {
        return this.task;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        this.mCourseDetails = (CourseDetails) getMArg3();
    }

    public final void initActionIndex() {
        if (this.mActionIndex.size() != 0) goto L13;
        CourseDetails r0 = this.mCourseDetails;
        if (r0 == null) goto L7;
        List<ProgressMarkers> r1 = r0.getProgressMarkers();
    L8:
        if (r1 == null) goto L15;
        List<ProgressMarkers> r2 = r1;
        ArrayList r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
        Iterator<T> r4 = r2.iterator();
    L11:
        if (r4.hasNext() == false) goto L16;
        ProgressMarkers r5 = (ProgressMarkers) r4.next();
        LogUtils.d(new Object[]{this.TAG + " 当前下标  ---> ???  = " + r5.getOffset()});
        r3.add(Boolean.valueOf(this.mActionIndex.add(Integer.valueOf(Integer.parseInt(r5.getOffset())))));
        goto L11
    L16:
        return;
    L15:
        return;
    L7:
        r1 = null;
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        CourseDetails r1 = this.mCourseDetails;
        String r2 = null;
        if (r1 == null) goto L5;
        String r3 = r1.getCourseName();
    L6:
        r0.setText(r3);
        setRequestedOrientation(0);
        getMPlayerView().setKeepScreenOn(true);
        ExoPlayer r4 = new ExoPlayer.Builder(this).build();
        Intrinsics.O10IXXX0X(r4, "build(...)");
        this.mPlayer = r4;
        PlayerView r5 = getMPlayerView();
        ExoPlayer r6 = this.mPlayer;
        if (r6 != null) goto L9;
        Intrinsics.XXO("mPlayer");
        r6 = null;
    L9:
        r5.setPlayer(r6);
        ExoPlayer r7 = this.mPlayer;
        if (r7 != null) goto L12;
        Intrinsics.XXO("mPlayer");
        r7 = null;
    L12:
        r7.addListener(this);
        getMPlayerView().setUseController(false);
        ExoPlayer r8 = this.mPlayer;
        if (r8 != null) goto L15;
        Intrinsics.XXO("mPlayer");
        r8 = null;
    L15:
        String r9 = getMArg0();
        Intrinsics.XXI(r9);
        r8.setMediaItem(MediaItem.fromUri(Uri.fromFile(new File(r9))));
        ExoPlayer r10 = this.mPlayer;
        if (r10 != null) goto L18;
        Intrinsics.XXO("mPlayer");
        r10 = null;
    L18:
        r10.prepare();
        ExoPlayer r11 = this.mPlayer;
        if (r11 != null) goto L21;
        Intrinsics.XXO("mPlayer");
        r11 = null;
    L21:
        r11.play();
        initActionIndex();
        getMCourseSeekBar().setRulerCount(this.mActionIndex);
        getMCourseSeekBar().setEnabled(false);
        PFMedium r12 = getMCourseCurTime();
        ExoPlayer r13 = this.mPlayer;
        if (r13 != null) goto L24;
        Intrinsics.XXO("mPlayer");
        r13 = null;
    L24:
        r12.setText(String.valueOf(r13.getCurrentPosition() / ((long) 1000)));
        PFMedium r14 = getMCourseMaxTime();
        CourseDetails r15 = this.mCourseDetails;
        if (r15 == null) goto L27;
        r2 = r15.getCourseTime();
    L27:
        r14.setText(String.valueOf(r2));
        getMCourseNext().setOnClickListener(this);
        getMCoursePlay().setOnClickListener(this);
        getMCoursePrevious().setOnClickListener(this);
        getMCourseLockScreen().setOnClickListener(this);
        getMPlayerView().setOnClickListener(this);
        GradientDrawable r16 = new GradientDrawable();
        r16.setShape(0);
        r16.setColors(CollectionsKt___CollectionsKt.O011OOIO0(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{Integer.valueOf(Color.parseColor("#21201F")), 0, Integer.valueOf(Color.parseColor("#21201F"))})));
        r16.setGradientType(0);
        r16.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        getMControllerView().setBackground(r16);
        Timer r17 = new Timer();
        this.mTimer = r17;
        r17.schedule(this.task, 0, 1000);
        return;
    L5:
        r3 = null;
        goto L6
    }

    public final boolean isShowView() {
        return this.isShowView;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_course_video;
    }

    public final void onBack(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@tb1 View r7) {
        LogUtils.d(new Object[]{this.TAG + " 点击了监听 isPlay " + this.isPlay});
        ExoPlayer r0 = null;
        if (r7 == null) goto L5;
        Integer r8 = Integer.valueOf(r7.getId());
    L7:
        if (r8 != null) goto L10;
    L13:
        int r2 = 8;
        if (r8 != null) goto L17;
    L32:
        if (r8 != null) goto L35;
    L38:
        if (r8 != null) goto L41;
    L42:
        if (r8 != null) goto L45;
        return;
    L45:
        if (r8.intValue() != R.id.player_view) goto L52;
        this.isShowView = !this.isShowView;
        View r9 = getMControllerView();
        if (this.isShowView == false) goto L49;
        r2 = 0;
    L49:
        r9.setVisibility(r2);
        return;
    L52:
        return;
    L41:
        if (r8.intValue() != R.id.course_lock_screen) goto L42;
        return;
    L35:
        if (r8.intValue() != R.id.course_previous) goto L38;
        curPlayAction(false);
        return;
    L17:
        if (r8.intValue() != R.id.course_play) goto L32;
        if (this.isPlay == false) goto L25;
        ExoPlayer r10 = this.mPlayer;
        if (r10 != null) goto L23;
        Intrinsics.XXO("mPlayer");
    L24:
        r0.pause();
        getMCoursePlay().setImageResource(R.drawable.icon_course_play);
        getMTvOnBack().setVisibility(0);
        getMTvOnPlay().setVisibility(0);
        getMTvHintTitle().setVisibility(0);
    L30:
        this.isPlay = !this.isPlay;
        return;
    L23:
        r0 = r10;
        goto L24
    L25:
        ExoPlayer r11 = this.mPlayer;
        if (r11 != null) goto L28;
        Intrinsics.XXO("mPlayer");
    L29:
        r0.play();
        getMCoursePlay().setImageResource(R.drawable.icon_course_pause);
        getMTvOnBack().setVisibility(8);
        getMTvOnPlay().setVisibility(8);
        getMTvHintTitle().setVisibility(8);
        goto L30
    L28:
        r0 = r11;
        goto L29
    L10:
        if (r8.intValue() != R.id.course_next) goto L13;
        curPlayAction(true);
        return;
    L5:
        r8 = null;
        goto L7
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r3) {
        getWindow().setFlags(1024, 1024);
        super.onCreate(r3);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ExoPlayer r0 = this.mPlayer;
        ExoPlayer r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mPlayer");
        r0 = null;
    L5:
        r0.removeListener(this);
        ExoPlayer r2 = this.mPlayer;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mPlayer");
    L9:
        r1.release();
        return;
    L8:
        r1 = r2;
        goto L9
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean r3) {
        super.onIsPlayingChanged(r3);
        LogUtils.d(new Object[]{this.TAG + " onIsPlayingChanged  isPlaying = " + r3});
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getMPlayerView().onPause();
    }

    public final void onPlay(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        ExoPlayer r3 = this.mPlayer;
        if (r3 != null) goto L5;
        Intrinsics.XXO("mPlayer");
        r3 = null;
    L5:
        r3.play();
        getMCoursePlay().setImageResource(R.drawable.icon_course_pause);
        this.isPlay = !this.isPlay;
        getMTvOnBack().setVisibility(8);
        getMTvOnPlay().setVisibility(8);
        getMTvHintTitle().setVisibility(8);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayWhenReadyChanged(boolean r1, int r2) {
        super.onPlayWhenReadyChanged(r1, r2);
        LogUtils.d(new Object[]{this.TAG + " onPlayWhenReadyChanged"});
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int r3) {
        super.onPlaybackStateChanged(r3);
        LogUtils.d(new Object[]{this.TAG + " onPlaybackStateChanged playbackState = " + r3});
        if (r3 == 4) goto L5;
        return;
    L5:
        completeCourse();
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(@aa1 PlaybackException r2) {
        Intrinsics.X0O(r2, "error");
        super.onPlayerError(r2);
        r2.getCause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getMPlayerView().onResume();
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(long r3) {
        super.onSeekBackIncrementChanged(r3);
        LogUtils.d(new Object[]{this.TAG + " onSeekBackIncrementChanged " + r3});
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(long r3) {
        super.onSeekForwardIncrementChanged(r3);
        LogUtils.d(new Object[]{this.TAG + " onSeekForwardIncrementChanged " + r3});
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void setMTimer(@tb1 Timer r1) {
        this.mTimer = r1;
    }

    public final void setShowView(boolean r1) {
        this.isShowView = r1;
    }
}
