package com.sma.smartv3.p610ui.trim.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I11ii01;
import com.android.mltcode.paycertificationapi.InterfaceC2558j0;
import com.android.mltcode.paycertificationapi.ag6;
import com.android.mltcode.paycertificationapi.r56;
import com.android.mltcode.paycertificationapi.zf6;
import com.android.mltcode.paycertificationapi.zi4;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.PathUtils;
import com.github.gzuliyujiang.imagepicker.CropImageOptions;
import com.github.gzuliyujiang.imagepicker.CropImageView;
import com.sma.smartv3.p610ui.trim.VideoTrimmerAdapter;
import com.sma.smartv3.p610ui.trim.view.VideoTrimmerView;
import com.sma.smartv3.pro.R;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class VideoTrimmerView extends FrameLayout implements InterfaceC2558j0 {
    public static final String iiIOiX = "VideoTrimmerView";

    /* JADX INFO: renamed from: I1 */
    public Context f54885I1;

    /* JADX INFO: renamed from: IO */
    public final int f54886IO;
    public CropImageOptions IO0II0i;
    public int IXI;
    public Uri IXOIIIO;
    public int Ii0X0X;
    public int Ii0i;
    public Uri Ii1iii0;
    public int IiiXiI0I;
    public TextView O001I;

    /* JADX INFO: renamed from: OO */
    public long f54887OO;
    public long OX110i;
    public int X00XIX1;
    public Handler X00Xi1X;
    public RangeSeekBarView X0i1O;

    /* JADX INFO: renamed from: X1 */
    public CropImageView f54888X1;
    public VideoTrimmerAdapter X100O;
    public int X11I;
    public ZVideoView X11iII1O1;
    public RecyclerView X1IX;
    public boolean XO0X10iO;
    public final RangeSeekBarView.OXO1 XOIX;
    public final Runnable XOO0XOOii;
    public long XOX0O0;
    public final RecyclerView.OnScrollListener XOXiX0;
    public boolean XX1Oi;
    public float XXO;
    public ImageView XXX11i;
    public ValueAnimator XXiIiX10;
    public int i0X000X0O;
    public boolean i11I;
    public LinearLayout iIXi1iiXI;
    public long iOiXi11II;
    public RelativeLayout iX1O1;
    public ImageView iXiX011;
    public float iXiiiO;
    public zf6 iiiO;

    public class OXO1 implements Runnable {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Bitmap f54890IO;

        public OXO1(final Bitmap val$bitmap) {
            this.f54890IO = val$bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoTrimmerView.this.X100O.addBitmaps(this.f54890IO);
        }
    }

    public class XIi00iiXO implements RangeSeekBarView.OXO1 {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.ui.trim.view.RangeSeekBarView.OXO1
        public void OXO1(RangeSeekBarView bar, long minValue, long maxValue, int action, boolean isMin, RangeSeekBarView.Thumb pressedThumb) {
            Log.d(VideoTrimmerView.iiIOiX, "-----minValue----->>>>>>" + minValue);
            Log.d(VideoTrimmerView.iiIOiX, "-----maxValue----->>>>>>" + maxValue);
            VideoTrimmerView videoTrimmerView = VideoTrimmerView.this;
            videoTrimmerView.OX110i = minValue + videoTrimmerView.iOiXi11II;
            VideoTrimmerView videoTrimmerView2 = VideoTrimmerView.this;
            videoTrimmerView2.XOX0O0 = videoTrimmerView2.OX110i;
            VideoTrimmerView videoTrimmerView3 = VideoTrimmerView.this;
            videoTrimmerView3.f54887OO = maxValue + videoTrimmerView3.iOiXi11II;
            Log.d(VideoTrimmerView.iiIOiX, "-----mLeftProgressPos----->>>>>>" + VideoTrimmerView.this.OX110i);
            Log.d(VideoTrimmerView.iiIOiX, "-----mRightProgressPos----->>>>>>" + VideoTrimmerView.this.f54887OO);
            if (action == 0) {
                VideoTrimmerView.this.i11I = false;
            } else if (action == 1) {
                VideoTrimmerView.this.i11I = false;
                VideoTrimmerView videoTrimmerView4 = VideoTrimmerView.this;
                videoTrimmerView4.iXiX011((int) videoTrimmerView4.OX110i);
            } else if (action == 2) {
                VideoTrimmerView.this.i11I = true;
                VideoTrimmerView videoTrimmerView5 = VideoTrimmerView.this;
                videoTrimmerView5.iXiX011((int) (pressedThumb == RangeSeekBarView.Thumb.MIN ? videoTrimmerView5.OX110i : videoTrimmerView5.f54887OO));
            }
            VideoTrimmerView.this.X0i1O.O10IXXX0X(VideoTrimmerView.this.OX110i, VideoTrimmerView.this.f54887OO);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.trim.view.VideoTrimmerView$iO */
    public class C19044iO extends RecyclerView.OnScrollListener {
        public C19044iO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            Log.d(VideoTrimmerView.iiIOiX, "newState = " + newState);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            VideoTrimmerView.this.i11I = false;
            int iI010I = VideoTrimmerView.this.i010I();
            if (Math.abs(VideoTrimmerView.this.i0X000X0O - iI010I) < VideoTrimmerView.this.X00XIX1) {
                VideoTrimmerView.this.XO0X10iO = false;
                return;
            }
            VideoTrimmerView.this.XO0X10iO = true;
            int i = ag6.XOO0ii0;
            if (iI010I == (-i)) {
                VideoTrimmerView.this.iOiXi11II = 0L;
                VideoTrimmerView videoTrimmerView = VideoTrimmerView.this;
                videoTrimmerView.OX110i = videoTrimmerView.X0i1O.getSelectedMinValue() + VideoTrimmerView.this.iOiXi11II;
                VideoTrimmerView videoTrimmerView2 = VideoTrimmerView.this;
                videoTrimmerView2.f54887OO = videoTrimmerView2.X0i1O.getSelectedMaxValue() + VideoTrimmerView.this.iOiXi11II;
                Log.d(VideoTrimmerView.iiIOiX, "onScrolled >>>> mLeftProgressPos = " + VideoTrimmerView.this.OX110i);
                VideoTrimmerView videoTrimmerView3 = VideoTrimmerView.this;
                videoTrimmerView3.XOX0O0 = videoTrimmerView3.OX110i;
            } else {
                VideoTrimmerView.this.i11I = true;
                VideoTrimmerView videoTrimmerView4 = VideoTrimmerView.this;
                videoTrimmerView4.iOiXi11II = (long) ((videoTrimmerView4.XXO * (i + iI010I)) / ag6.OIi0);
                VideoTrimmerView videoTrimmerView5 = VideoTrimmerView.this;
                videoTrimmerView5.OX110i = videoTrimmerView5.X0i1O.getSelectedMinValue() + VideoTrimmerView.this.iOiXi11II;
                VideoTrimmerView videoTrimmerView6 = VideoTrimmerView.this;
                videoTrimmerView6.f54887OO = videoTrimmerView6.X0i1O.getSelectedMaxValue() + VideoTrimmerView.this.iOiXi11II;
                Log.d(VideoTrimmerView.iiIOiX, "onScrolled >>>> mLeftProgressPos = " + VideoTrimmerView.this.OX110i);
                VideoTrimmerView videoTrimmerView7 = VideoTrimmerView.this;
                videoTrimmerView7.XOX0O0 = videoTrimmerView7.OX110i;
                if (VideoTrimmerView.this.X11iII1O1.isPlaying()) {
                    VideoTrimmerView.this.X11iII1O1.pause();
                    VideoTrimmerView.this.setPlayPauseViewIcon(false);
                }
                VideoTrimmerView.this.iXiX011.setVisibility(8);
                VideoTrimmerView videoTrimmerView8 = VideoTrimmerView.this;
                videoTrimmerView8.iXiX011(videoTrimmerView8.OX110i);
                VideoTrimmerView.this.X0i1O.O10IXXX0X(VideoTrimmerView.this.OX110i, VideoTrimmerView.this.f54887OO);
                VideoTrimmerView.this.X0i1O.invalidate();
            }
            VideoTrimmerView.this.i0X000X0O = iI010I;
        }
    }

    public VideoTrimmerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public static /* synthetic */ void IiI10X(VideoTrimmerView videoTrimmerView, Bitmap bitmap, Integer num) {
        videoTrimmerView.getClass();
        if (bitmap != null) {
            r56.O00("", videoTrimmerView.new OXO1(bitmap), 0L);
        }
    }

    public static /* synthetic */ void XO0O10(VideoTrimmerView videoTrimmerView, FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        videoTrimmerView.getClass();
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        videoTrimmerView.iXiX011.setLayoutParams(layoutParams);
        Log.d(iiIOiX, "----onAnimationUpdate--->>>>>>>" + videoTrimmerView.XOX0O0);
    }

    public static /* synthetic */ void XOO0ii0(VideoTrimmerView videoTrimmerView, MediaPlayer mediaPlayer) {
        videoTrimmerView.getClass();
        mediaPlayer.setVideoScalingMode(1);
        videoTrimmerView.X11I(mediaPlayer);
    }

    private boolean getRestoreState() {
        return this.XX1Oi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayPauseViewIcon(boolean isPlaying) {
        this.XXX11i.setImageResource(isPlaying ? R.drawable.ic_video_pause_black : R.drawable.ic_video_play_black);
    }

    public void IXXOO(int width, int height, int totalCount) {
        this.Ii0i = width;
        this.IXI = height;
        this.IiiXiI0I = totalCount;
    }

    public final void Ii1iii0() {
        long currentPosition = this.X11iII1O1.getCurrentPosition();
        Log.d(iiIOiX, "updateVideoProgress currentPosition = " + currentPosition);
        if (currentPosition < this.f54887OO) {
            this.X00Xi1X.post(this.XOO0XOOii);
            return;
        }
        this.XOX0O0 = this.OX110i;
        XXX11i();
        iX1O1();
    }

    public final void O001I() {
        findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.gg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6879IO.XXIIO1i11();
            }
        });
        findViewById(R.id.finishBtn).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.hg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7123IO.m38800iI();
            }
        });
        this.X11iII1O1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.android.mltcode.paycertificationapi.ig6
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoTrimmerView.XOO0ii0(this.f8500IO, mediaPlayer);
            }
        });
        this.X11iII1O1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.android.mltcode.paycertificationapi.jg6
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f8961IO.iiiO();
            }
        });
        this.XXX11i.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.kg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9166IO.X1IX();
            }
        });
    }

    public void O1O(final Uri videoURI) {
        this.Ii1iii0 = videoURI;
        this.X11iII1O1.setVideoURI(videoURI);
        this.X11iII1O1.requestFocus();
        this.O001I.setText(String.format(this.f54885I1.getResources().getString(R.string.video_shoot_tip), 10));
    }

    public final void X0i1O() {
        if (this.iXiX011.getVisibility() == 8) {
            this.iXiX011.setVisibility(0);
        }
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.iXiX011.getLayoutParams();
        int i = ag6.XOO0ii0;
        long j = this.XOX0O0;
        long j2 = this.iOiXi11II;
        float f = this.iXiiiO;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) (i + ((j - j2) * f)), (int) (i + ((this.f54887OO - j2) * f)));
        long j3 = this.f54887OO;
        long j4 = this.iOiXi11II;
        ValueAnimator duration = valueAnimatorOfInt.setDuration((j3 - j4) - (this.XOX0O0 - j4));
        this.XXiIiX10 = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.XXiIiX10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.fg6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoTrimmerView.XO0O10(this.f6642IO, layoutParams, valueAnimator);
            }
        });
        this.XXiIiX10.start();
    }

    public final void X11I(MediaPlayer mp) {
        ViewGroup.LayoutParams layoutParams = this.X11iII1O1.getLayoutParams();
        int videoWidth = mp.getVideoWidth();
        int videoHeight = mp.getVideoHeight();
        int width = this.iX1O1.getWidth();
        int height = this.iX1O1.getHeight();
        if (videoHeight > videoWidth) {
            layoutParams.width = width;
            layoutParams.height = height;
        } else {
            layoutParams.width = width;
            layoutParams.height = (int) (width * (videoHeight / videoWidth));
        }
        this.X11iII1O1.setLayoutParams(layoutParams);
        this.X11I = this.X11iII1O1.getDuration();
        if (getRestoreState()) {
            setRestoreState(false);
            iXiX011((int) this.XOX0O0);
        } else {
            iXiX011((int) this.XOX0O0);
        }
        iOO1ii1();
        iXiiiO(this.f54885I1, this.Ii1iii0, this.Ii0X0X, 0L, this.X11I);
        XXO(this.f54885I1, Bitmap.createBitmap(layoutParams.width, layoutParams.height, Bitmap.Config.ARGB_8888), this.Ii0i, this.IXI);
    }

    public final void X11iII1O1() {
        this.X11iII1O1.pause();
        setPlayPauseViewIcon(false);
    }

    public final void X1IX() {
        this.XOX0O0 = this.X11iII1O1.getCurrentPosition();
        if (this.X11iII1O1.isPlaying()) {
            this.X11iII1O1.pause();
            XXX11i();
        } else {
            this.X11iII1O1.start();
            iIXi1iiXI();
        }
        setPlayPauseViewIcon(this.X11iII1O1.isPlaying());
    }

    public final void XXIIO1i11() {
        this.iiiO.onCancel();
    }

    public final void XXO(Context context, Bitmap bitmap, int cropW, int cropH) {
        Log.d(iiIOiX, "showCropView -> " + bitmap.getWidth() + " " + bitmap.getHeight() + " " + cropW + " " + cropH);
        StringBuilder sb = new StringBuilder();
        sb.append(PathUtils.getExternalAppCachePath());
        sb.append("/tmp.png");
        String string = sb.toString();
        ImageUtils.save(bitmap, string, Bitmap.CompressFormat.PNG);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(".imagepicker.provider");
        Uri uriForFile = FileProvider.getUriForFile(context, sb2.toString(), new File(string));
        com.github.gzuliyujiang.imagepicker.OXO1 oxo1 = new com.github.gzuliyujiang.imagepicker.OXO1(uriForFile);
        oxo1.XIi00iiXO.m15202iO();
        oxo1.OII(false).X1ii(CropImageView.Guidelines.ON_TOUCH).I0iXXO(CropImageView.CropShape.RECTANGLE).II1Xi0(cropW, cropH).m15221iO(cropW, cropH).XO0O10(false);
        CropImageOptions cropImageOptions = oxo1.XIi00iiXO;
        this.IO0II0i = cropImageOptions;
        this.f54888X1.setCropImageOptions(cropImageOptions);
        this.IXOIIIO = uriForFile;
        this.f54888X1.setImageUriAsync(uriForFile);
    }

    public final void XXX11i() {
        this.iXiX011.clearAnimation();
        ValueAnimator valueAnimator = this.XXiIiX10;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.X00Xi1X.removeCallbacks(this.XOO0XOOii);
        this.XXiIiX10.cancel();
    }

    public final int i010I() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.X1IX.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        return (iFindFirstVisibleItemPosition * viewFindViewByPosition.getWidth()) - viewFindViewByPosition.getLeft();
    }

    /* JADX INFO: renamed from: iI */
    public final void m38800iI() {
        if (this.f54887OO - this.OX110i < 1000) {
            Toast.makeText(this.f54885I1, "The video is less than 1 second long", 0).show();
            return;
        }
        this.X11iII1O1.pause();
        String str = PathUtils.getExternalAppCachePath() + "/trim";
        FileUtils.deleteFilesInDir(str);
        ag6.O00(this.f54885I1, this.Ii1iii0, str, this.IiiXiI0I, this.OX110i, this.f54887OO, this.f54888X1.getCropRect(), this.X11iII1O1.getWidth(), this.X11iII1O1.getHeight(), this.Ii0i, this.IXI, this.iiiO);
    }

    public final void iIXi1iiXI() {
        XXX11i();
        X0i1O();
        this.X00Xi1X.post(this.XOO0XOOii);
    }

    public final void iOO1ii1() {
        if (this.X0i1O != null) {
            return;
        }
        this.OX110i = 0L;
        int i = this.X11I;
        if (i <= 10000) {
            this.Ii0X0X = 10;
            this.f54887OO = i;
        } else {
            this.Ii0X0X = (int) (((i * 1.0f) / 10000.0f) * 10.0f);
            this.f54887OO = 10000L;
        }
        this.X1IX.addItemDecoration(new SpacesItemDecoration2(ag6.XOO0ii0, this.Ii0X0X));
        RangeSeekBarView rangeSeekBarView = new RangeSeekBarView(this.f54885I1, this.OX110i, this.f54887OO);
        this.X0i1O = rangeSeekBarView;
        rangeSeekBarView.setSelectedMinValue(this.OX110i);
        this.X0i1O.setSelectedMaxValue(this.f54887OO);
        this.X0i1O.O10IXXX0X(this.OX110i, this.f54887OO);
        this.X0i1O.setMinShootTime(1000L);
        this.X0i1O.setNotifyWhileDragging(true);
        this.X0i1O.setOnRangeSeekBarChangeListener(this.XOIX);
        this.iIXi1iiXI.addView(this.X0i1O);
        int i2 = this.Ii0X0X;
        if (i2 - 10 > 0) {
            this.XXO = (((long) this.X11I) - 10000) / (i2 - 10);
        } else {
            this.XXO = 0.0f;
        }
        this.iXiiiO = (this.f54886IO * 1.0f) / (this.f54887OO - this.OX110i);
    }

    /* JADX INFO: renamed from: iX */
    public final void m38801iX(Context context) {
        this.f54885I1 = context;
        LayoutInflater.from(context).inflate(R.layout.video_trimmer_view, (ViewGroup) this, true);
        this.iX1O1 = (RelativeLayout) findViewById(R.id.layout_surface_view);
        this.X11iII1O1 = (ZVideoView) findViewById(R.id.video_loader);
        this.XXX11i = (ImageView) findViewById(R.id.icon_video_play);
        this.iIXi1iiXI = (LinearLayout) findViewById(R.id.seekBarLayout);
        this.iXiX011 = (ImageView) findViewById(R.id.positionIcon);
        this.O001I = (TextView) findViewById(R.id.video_shoot_tip);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.video_frames_recyclerView);
        this.X1IX = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f54885I1, 0, false));
        VideoTrimmerAdapter videoTrimmerAdapter = new VideoTrimmerAdapter(this.f54885I1);
        this.X100O = videoTrimmerAdapter;
        this.X1IX.setAdapter(videoTrimmerAdapter);
        this.X1IX.addOnScrollListener(this.XOXiX0);
        O001I();
        this.f54888X1 = (CropImageView) findViewById(R.id.crop_image_content);
    }

    public void iX1O1() {
        if (this.X11iII1O1.isPlaying()) {
            iXiX011(this.OX110i);
            this.X11iII1O1.pause();
            setPlayPauseViewIcon(false);
            this.iXiX011.setVisibility(8);
        }
    }

    public final void iXiX011(long msec) {
        this.X11iII1O1.seekTo((int) msec);
        Log.d(iiIOiX, "seekTo = " + msec);
    }

    public final void iXiiiO(final Context context, final Uri videoUri, int totalThumbsCount, long startPosition, long endPosition) {
        ag6.XO0O10(context, videoUri, totalThumbsCount, startPosition, endPosition, new zi4() { // from class: com.android.mltcode.paycertificationapi.eg6
            @Override // com.android.mltcode.paycertificationapi.zi4
            public final void OXO1(Object obj, Object obj2) {
                VideoTrimmerView.IiI10X(this.OXO1, (Bitmap) obj, (Integer) obj2);
            }
        });
    }

    public final void iiiO() {
        iXiX011(this.OX110i);
        setPlayPauseViewIcon(false);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2558j0
    public void onDestroy() {
        I11ii01.XO0O10("", true);
        r56.XIi00iiXO("");
        this.X00Xi1X.removeCallbacks(this.XOO0XOOii);
    }

    public void setOnTrimVideoListener(zf6 onTrimVideoListener) {
        this.iiiO = onTrimVideoListener;
    }

    public void setRestoreState(boolean fromRestore) {
        this.XX1Oi = fromRestore;
    }

    public VideoTrimmerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f54886IO = ag6.I0IIOi;
        this.X11I = 0;
        this.XX1Oi = false;
        this.XOX0O0 = 0L;
        this.iOiXi11II = 0L;
        this.X00Xi1X = new Handler();
        this.IiiXiI0I = 14;
        this.XOIX = new XIi00iiXO();
        this.XOXiX0 = new C19044iO();
        this.XOO0XOOii = new Runnable() { // from class: com.android.mltcode.paycertificationapi.lg6
            @Override // java.lang.Runnable
            public final void run() {
                this.f9431IO.Ii1iii0();
            }
        };
        m38801iX(context);
    }
}
