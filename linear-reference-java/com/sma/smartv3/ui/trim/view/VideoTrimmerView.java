package com.sma.smartv3.ui.trim.view;

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
import com.android.mltcode.paycertificationapi.ag6;
import com.android.mltcode.paycertificationapi.eg6;
import com.android.mltcode.paycertificationapi.fg6;
import com.android.mltcode.paycertificationapi.gg6;
import com.android.mltcode.paycertificationapi.hg6;
import com.android.mltcode.paycertificationapi.ig6;
import com.android.mltcode.paycertificationapi.j0;
import com.android.mltcode.paycertificationapi.jg6;
import com.android.mltcode.paycertificationapi.kg6;
import com.android.mltcode.paycertificationapi.lg6;
import com.android.mltcode.paycertificationapi.r56;
import com.android.mltcode.paycertificationapi.zf6;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.PathUtils;
import com.github.gzuliyujiang.imagepicker.CropImageOptions;
import com.github.gzuliyujiang.imagepicker.CropImageView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.trim.VideoTrimmerAdapter;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class VideoTrimmerView extends FrameLayout implements j0 {
    public static final String iiIOiX = "VideoTrimmerView";
    public Context I1;
    public final int IO;
    public CropImageOptions IO0II0i;
    public int IXI;
    public Uri IXOIIIO;
    public int Ii0X0X;
    public int Ii0i;
    public Uri Ii1iii0;
    public int IiiXiI0I;
    public TextView O001I;
    public long OO;
    public long OX110i;
    public int X00XIX1;
    public Handler X00Xi1X;
    public RangeSeekBarView X0i1O;
    public CropImageView X1;
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
        public final /* synthetic */ VideoTrimmerView I1;
        public final /* synthetic */ Bitmap IO;

        public OXO1(final VideoTrimmerView this$0, final Bitmap val$bitmap) {
            this.I1 = this$0;
            this.IO = val$bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoTrimmerView.X0O(this.I1).addBitmaps(this.IO);
        }
    }

    public class XIi00iiXO implements RangeSeekBarView.OXO1 {
        public final /* synthetic */ VideoTrimmerView OXO1;

        public XIi00iiXO(final VideoTrimmerView this$0) {
            this.OXO1 = this$0;
        }

        @Override // com.sma.smartv3.ui.trim.view.RangeSeekBarView.OXO1
        public void OXO1(RangeSeekBarView bar, long minValue, long maxValue, int action, boolean isMin, RangeSeekBarView.Thumb pressedThumb) {
            Log.d(VideoTrimmerView.II1Xi0(), "-----minValue----->>>>>>" + minValue);
            Log.d(VideoTrimmerView.II1Xi0(), "-----maxValue----->>>>>>" + maxValue);
            VideoTrimmerView r3 = this.OXO1;
            VideoTrimmerView.OiIIX101O(r3, minValue + VideoTrimmerView.IIX1OXO(r3));
            VideoTrimmerView r4 = this.OXO1;
            VideoTrimmerView.XiOIii1(r4, VideoTrimmerView.OIX0iXi(r4));
            VideoTrimmerView r5 = this.OXO1;
            VideoTrimmerView.OII(r5, maxValue + VideoTrimmerView.IIX1OXO(r5));
            Log.d(VideoTrimmerView.II1Xi0(), "-----mLeftProgressPos----->>>>>>" + VideoTrimmerView.OIX0iXi(this.OXO1));
            Log.d(VideoTrimmerView.II1Xi0(), "-----mRightProgressPos----->>>>>>" + VideoTrimmerView.X1ii(this.OXO1));
            if (action != 0) goto L5;
            VideoTrimmerView.iIiiO(this.OXO1, false);
        L16:
            VideoTrimmerView.I0iXXO(this.OXO1).O10IXXX0X(VideoTrimmerView.OIX0iXi(this.OXO1), VideoTrimmerView.X1ii(this.OXO1));
            return;
        L5:
            if (action != 1) goto L7;
            VideoTrimmerView.iIiiO(this.OXO1, false);
            VideoTrimmerView r6 = this.OXO1;
            VideoTrimmerView.iOOX010X(r6, (int) VideoTrimmerView.OIX0iXi(r6));
            goto L16
        L7:
            if (action != 2) goto L16;
            VideoTrimmerView.iIiiO(this.OXO1, true);
            VideoTrimmerView r7 = this.OXO1;
            if (pressedThumb != RangeSeekBarView.Thumb.MIN) goto L12;
            long r8 = VideoTrimmerView.OIX0iXi(r7);
        L13:
            VideoTrimmerView.iOOX010X(r7, (int) r8);
            goto L16
        L12:
            r8 = VideoTrimmerView.X1ii(r7);
            goto L13
        }
    }

    public class iO extends RecyclerView.OnScrollListener {
        public final /* synthetic */ VideoTrimmerView OXO1;

        public iO(final VideoTrimmerView this$0) {
            this.OXO1 = this$0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            Log.d(VideoTrimmerView.II1Xi0(), "newState = " + newState);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            VideoTrimmerView.iIiiO(this.OXO1, false);
            int r6 = VideoTrimmerView.I1(this.OXO1);
            if (Math.abs(VideoTrimmerView.OIi0(this.OXO1) - r6) >= VideoTrimmerView.O10IXXX0X(this.OXO1)) goto L6;
            VideoTrimmerView.XiOIO(this.OXO1, false);
            return;
        L6:
            VideoTrimmerView.XiOIO(this.OXO1, true);
            int r8 = ag6.XOO0ii0;
            if (r6 != (-r8)) goto L9;
            VideoTrimmerView.OX(this.OXO1, 0);
            VideoTrimmerView r7 = this.OXO1;
            VideoTrimmerView.OiIIX101O(r7, VideoTrimmerView.I0iXXO(r7).getSelectedMinValue() + VideoTrimmerView.IIX1OXO(this.OXO1));
            VideoTrimmerView r9 = this.OXO1;
            VideoTrimmerView.OII(r9, VideoTrimmerView.I0iXXO(r9).getSelectedMaxValue() + VideoTrimmerView.IIX1OXO(this.OXO1));
            Log.d(VideoTrimmerView.II1Xi0(), "onScrolled >>>> mLeftProgressPos = " + VideoTrimmerView.OIX0iXi(this.OXO1));
            VideoTrimmerView r10 = this.OXO1;
            VideoTrimmerView.XiOIii1(r10, VideoTrimmerView.OIX0iXi(r10));
        L13:
            VideoTrimmerView.XX0(this.OXO1, r6);
            return;
        L9:
            VideoTrimmerView.iIiiO(this.OXO1, true);
            VideoTrimmerView r0 = this.OXO1;
            VideoTrimmerView.OX(r0, (long) ((VideoTrimmerView.IO(r0) * (r8 + r6)) / ag6.OIi0));
            VideoTrimmerView r11 = this.OXO1;
            VideoTrimmerView.OiIIX101O(r11, VideoTrimmerView.I0iXXO(r11).getSelectedMinValue() + VideoTrimmerView.IIX1OXO(this.OXO1));
            VideoTrimmerView r12 = this.OXO1;
            VideoTrimmerView.OII(r12, VideoTrimmerView.I0iXXO(r12).getSelectedMaxValue() + VideoTrimmerView.IIX1OXO(this.OXO1));
            Log.d(VideoTrimmerView.II1Xi0(), "onScrolled >>>> mLeftProgressPos = " + VideoTrimmerView.OIX0iXi(this.OXO1));
            VideoTrimmerView r13 = this.OXO1;
            VideoTrimmerView.XiOIii1(r13, VideoTrimmerView.OIX0iXi(r13));
            if (VideoTrimmerView.I1XOi1(this.OXO1).isPlaying() == false) goto L12;
            VideoTrimmerView.I1XOi1(this.OXO1).pause();
            VideoTrimmerView.X01IiOiIi(this.OXO1, false);
        L12:
            VideoTrimmerView.XXI(this.OXO1).setVisibility(8);
            VideoTrimmerView r14 = this.OXO1;
            VideoTrimmerView.iOOX010X(r14, VideoTrimmerView.OIX0iXi(r14));
            VideoTrimmerView.I0iXXO(this.OXO1).O10IXXX0X(VideoTrimmerView.OIX0iXi(this.OXO1), VideoTrimmerView.X1ii(this.OXO1));
            VideoTrimmerView.I0iXXO(this.OXO1).invalidate();
            goto L13
        }
    }

    static {
    }

    public VideoTrimmerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public static /* synthetic */ void I0IIOi(VideoTrimmerView r0, View r1) {
        r0.iI();
    }

    public static /* bridge */ /* synthetic */ RangeSeekBarView I0iXXO(VideoTrimmerView r0) {
        return r0.X0i1O;
    }

    public static /* bridge */ /* synthetic */ int I1(VideoTrimmerView r0) {
        return r0.i010I();
    }

    public static /* bridge */ /* synthetic */ ZVideoView I1XOi1(VideoTrimmerView r0) {
        return r0.X11iII1O1;
    }

    public static /* bridge */ /* synthetic */ String II1Xi0() {
        return iiIOiX;
    }

    public static /* bridge */ /* synthetic */ long IIX1OXO(VideoTrimmerView r2) {
        return r2.iOiXi11II;
    }

    public static /* bridge */ /* synthetic */ float IO(VideoTrimmerView r0) {
        return r0.XXO;
    }

    public static /* synthetic */ void IiI10X(VideoTrimmerView r1, Bitmap r2, Integer r3) {
        r1.getClass();
        if (r2 == null) goto L6;
        r56.O00("", new OXO1(r1, r2), 0);
        return;
    }

    public static /* synthetic */ void O00(VideoTrimmerView r0) {
        r0.Ii1iii0();
    }

    public static /* bridge */ /* synthetic */ int O10IXXX0X(VideoTrimmerView r0) {
        return r0.X00XIX1;
    }

    public static /* bridge */ /* synthetic */ void OII(VideoTrimmerView r0, long r1) {
        r0.OO = r1;
    }

    public static /* bridge */ /* synthetic */ long OIX0iXi(VideoTrimmerView r2) {
        return r2.OX110i;
    }

    public static /* bridge */ /* synthetic */ int OIi0(VideoTrimmerView r0) {
        return r0.i0X000X0O;
    }

    public static /* bridge */ /* synthetic */ void OX(VideoTrimmerView r0, long r1) {
        r0.iOiXi11II = r1;
    }

    public static /* synthetic */ void OXO1(VideoTrimmerView r0, View r1) {
        r0.XXIIO1i11();
    }

    public static /* bridge */ /* synthetic */ void OiIIX101O(VideoTrimmerView r0, long r1) {
        r0.OX110i = r1;
    }

    public static /* bridge */ /* synthetic */ void X01IiOiIi(VideoTrimmerView r0, boolean r1) {
        r0.setPlayPauseViewIcon(r1);
    }

    public static /* bridge */ /* synthetic */ VideoTrimmerAdapter X0O(VideoTrimmerView r0) {
        return r0.X100O;
    }

    public static /* bridge */ /* synthetic */ long X1ii(VideoTrimmerView r2) {
        return r2.OO;
    }

    public static /* synthetic */ void XIi00iiXO(VideoTrimmerView r0, MediaPlayer r1) {
        r0.iiiO();
    }

    public static /* synthetic */ void XO0O10(VideoTrimmerView r2, FrameLayout.LayoutParams r3, ValueAnimator r4) {
        r2.getClass();
        r3.leftMargin = ((Integer) r4.getAnimatedValue()).intValue();
        r2.iXiX011.setLayoutParams(r3);
        Log.d(iiIOiX, "----onAnimationUpdate--->>>>>>>" + r2.XOX0O0);
    }

    public static /* synthetic */ void XOO0ii0(VideoTrimmerView r1, MediaPlayer r2) {
        r1.getClass();
        r2.setVideoScalingMode(1);
        r1.X11I(r2);
    }

    public static /* bridge */ /* synthetic */ void XX0(VideoTrimmerView r0, int r1) {
        r0.i0X000X0O = r1;
    }

    public static /* bridge */ /* synthetic */ ImageView XXI(VideoTrimmerView r0) {
        return r0.iXiX011;
    }

    public static /* bridge */ /* synthetic */ void XiOIO(VideoTrimmerView r0, boolean r1) {
        r0.XO0X10iO = r1;
    }

    public static /* bridge */ /* synthetic */ void XiOIii1(VideoTrimmerView r0, long r1) {
        r0.XOX0O0 = r1;
    }

    private boolean getRestoreState() {
        return this.XX1Oi;
    }

    public static /* bridge */ /* synthetic */ void iIiiO(VideoTrimmerView r0, boolean r1) {
        r0.i11I = r1;
    }

    public static /* synthetic */ void iO(VideoTrimmerView r0, View r1) {
        r0.X1IX();
    }

    public static /* bridge */ /* synthetic */ void iOOX010X(VideoTrimmerView r0, long r1) {
        r0.iXiX011(r1);
    }

    private void setPlayPauseViewIcon(boolean isPlaying) {
        ImageView r0 = this.XXX11i;
        if (isPlaying == false) goto L5;
        int r2 = R.drawable.ic_video_pause_black;
    L6:
        r0.setImageResource(r2);
        return;
    L5:
        r2 = R.drawable.ic_video_play_black;
        goto L6
    }

    public void IXXOO(int width, int height, int totalCount) {
        this.Ii0i = width;
        this.IXI = height;
        this.IiiXiI0I = totalCount;
    }

    public final void Ii1iii0() {
        long r0 = this.X11iII1O1.getCurrentPosition();
        Log.d(iiIOiX, "updateVideoProgress currentPosition = " + r0);
        if (r0 < this.OO) goto L6;
        this.XOX0O0 = this.OX110i;
        XXX11i();
        iX1O1();
        return;
    L6:
        this.X00Xi1X.post(this.XOO0XOOii);
    }

    public final void O001I() {
        findViewById(R.id.cancelBtn).setOnClickListener(new gg6(this));
        findViewById(R.id.finishBtn).setOnClickListener(new hg6(this));
        this.X11iII1O1.setOnPreparedListener(new ig6(this));
        this.X11iII1O1.setOnCompletionListener(new jg6(this));
        this.XXX11i.setOnClickListener(new kg6(this));
    }

    public void O1O(final Uri videoURI) {
        this.Ii1iii0 = videoURI;
        this.X11iII1O1.setVideoURI(videoURI);
        this.X11iII1O1.requestFocus();
        this.O001I.setText(String.format(this.I1.getResources().getString(R.string.video_shoot_tip), new Object[]{10}));
    }

    public final void X0i1O() {
        if (this.iXiX011.getVisibility() != 8) goto L5;
        this.iXiX011.setVisibility(0);
    L5:
        final FrameLayout.LayoutParams r0 = (FrameLayout.LayoutParams) this.iXiX011.getLayoutParams();
        int r1 = ag6.XOO0ii0;
        long r3 = this.XOX0O0;
        long r5 = this.iOiXi11II;
        float r4 = this.iXiiiO;
        ValueAnimator r2 = ValueAnimator.ofInt(new int[]{(int) (r1 + ((r3 - r5) * r4)), (int) (r1 + ((this.OO - r5) * r4))});
        long r6 = this.OO;
        long r7 = this.iOiXi11II;
        ValueAnimator r8 = r2.setDuration((r6 - r7) - (this.XOX0O0 - r7));
        this.XXiIiX10 = r8;
        r8.setInterpolator(new LinearInterpolator());
        this.XXiIiX10.addUpdateListener(new fg6(this, r0));
        this.XXiIiX10.start();
    }

    public final void X11I(MediaPlayer mp) {
        ViewGroup.LayoutParams r0 = this.X11iII1O1.getLayoutParams();
        int r1 = mp.getVideoWidth();
        int r12 = mp.getVideoHeight();
        int r2 = this.iX1O1.getWidth();
        int r3 = this.iX1O1.getHeight();
        if (r12 <= r1) goto L5;
        r0.width = r2;
        r0.height = r3;
    L6:
        this.X11iII1O1.setLayoutParams(r0);
        this.X11I = this.X11iII1O1.getDuration();
        if (getRestoreState() == true) goto L9;
        iXiX011((int) this.XOX0O0);
    L10:
        iOO1ii1();
        iXiiiO(this.I1, this.Ii1iii0, this.Ii0X0X, 0, this.X11I);
        XXO(this.I1, Bitmap.createBitmap(r0.width, r0.height, Bitmap.Config.ARGB_8888), this.Ii0i, this.IXI);
        return;
    L9:
        setRestoreState(false);
        iXiX011((int) this.XOX0O0);
        goto L10
    L5:
        r0.width = r2;
        r0.height = (int) (r2 * (r12 / r1));
        goto L6
    }

    public final void X11iII1O1() {
        this.X11iII1O1.pause();
        setPlayPauseViewIcon(false);
    }

    public final void X1IX() {
        this.XOX0O0 = this.X11iII1O1.getCurrentPosition();
        if (this.X11iII1O1.isPlaying() == false) goto L5;
        this.X11iII1O1.pause();
        XXX11i();
    L6:
        setPlayPauseViewIcon(this.X11iII1O1.isPlaying());
        return;
    L5:
        this.X11iII1O1.start();
        iIXi1iiXI();
        goto L6
    }

    public final void XXIIO1i11() {
        onCancel();
    }

    public final void XXO(Context context, Bitmap bitmap, int cropW, int cropH) {
        Log.d(iiIOiX, "showCropView -> " + bitmap.getWidth() + " " + bitmap.getHeight() + " " + cropW + " " + cropH);
        StringBuilder r0 = new StringBuilder();
        r0.append(PathUtils.getExternalAppCachePath());
        r0.append("/tmp.png");
        String r1 = r0.toString();
        ImageUtils.save(bitmap, r1, Bitmap.CompressFormat.PNG);
        StringBuilder r6 = new StringBuilder();
        r6.append(context.getPackageName());
        r6.append(".imagepicker.provider");
        Uri r5 = FileProvider.getUriForFile(context, r6.toString(), new File(r1));
        com.github.gzuliyujiang.imagepicker.OXO1 r7 = new com.github.gzuliyujiang.imagepicker.OXO1(r5);
        r7.XIi00iiXO.iO();
        r7.OII(false).X1ii(CropImageView.Guidelines.ON_TOUCH).I0iXXO(CropImageView.CropShape.RECTANGLE).II1Xi0(cropW, cropH).iO(cropW, cropH).XO0O10(false);
        CropImageOptions r8 = r7.XIi00iiXO;
        this.IO0II0i = r8;
        setCropImageOptions(r8);
        this.IXOIIIO = r5;
        setImageUriAsync(r5);
    }

    public final void XXX11i() {
        this.iXiX011.clearAnimation();
        ValueAnimator r0 = this.XXiIiX10;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isRunning() == false) goto L9;
        this.X00Xi1X.removeCallbacks(this.XOO0XOOii);
        this.XXiIiX10.cancel();
        return;
    }

    public final int i010I() {
        LinearLayoutManager r0 = (LinearLayoutManager) getLayoutManager();
        int r1 = r0.findFirstVisibleItemPosition();
        View r2 = r0.findViewByPosition(r1);
        return (r1 * r2.getWidth()) - r2.getLeft();
    }

    public final void iI() {
        if ((this.OO - this.OX110i) >= 1000) goto L6;
        Toast.makeText(this.I1, "The video is less than 1 second long", 0).show();
        return;
    L6:
        this.X11iII1O1.pause();
        String r5 = PathUtils.getExternalAppCachePath() + "/trim";
        FileUtils.deleteFilesInDir(r5);
        ag6.O00(this.I1, this.Ii1iii0, r5, this.IiiXiI0I, this.OX110i, this.OO, getCropRect(), this.X11iII1O1.getWidth(), this.X11iII1O1.getHeight(), this.Ii0i, this.IXI, this.iiiO);
    }

    public final void iIXi1iiXI() {
        XXX11i();
        X0i1O();
        this.X00Xi1X.post(this.XOO0XOOii);
    }

    public final void iOO1ii1() {
        if (this.X0i1O == null) goto L5;
        return;
    L5:
        this.OX110i = 0;
        int r0 = this.X11I;
        if (r0 > 10000) goto L8;
        this.Ii0X0X = 10;
        this.OO = r0;
    L9:
        addItemDecoration(new SpacesItemDecoration2(ag6.XOO0ii0, this.Ii0X0X));
        RangeSeekBarView r8 = new RangeSeekBarView(this.I1, this.OX110i, this.OO);
        this.X0i1O = r8;
        r8.setSelectedMinValue(this.OX110i);
        this.X0i1O.setSelectedMaxValue(this.OO);
        this.X0i1O.O10IXXX0X(this.OX110i, this.OO);
        this.X0i1O.setMinShootTime(1000);
        this.X0i1O.setNotifyWhileDragging(true);
        this.X0i1O.setOnRangeSeekBarChangeListener(this.XOIX);
        this.iIXi1iiXI.addView(this.X0i1O);
        int r1 = this.Ii0X0X;
        if ((r1 - 10) <= 0) goto L12;
        this.XXO = (((long) this.X11I) - 10000) / (r1 - 10);
    L13:
        this.iXiiiO = (this.IO * 1.0f) / (this.OO - this.OX110i);
        return;
    L12:
        this.XXO = 0.0f;
        goto L13
    L8:
        this.Ii0X0X = (int) (((r0 * 1.0f) / 10000.0f) * 10.0f);
        this.OO = 10000;
        goto L9
    }

    public final void iX(Context context) {
        this.I1 = context;
        LayoutInflater.from(context).inflate(R.layout.video_trimmer_view, this, true);
        this.iX1O1 = (RelativeLayout) findViewById(R.id.layout_surface_view);
        this.X11iII1O1 = (ZVideoView) findViewById(R.id.video_loader);
        this.XXX11i = (ImageView) findViewById(R.id.icon_video_play);
        this.iIXi1iiXI = (LinearLayout) findViewById(R.id.seekBarLayout);
        this.iXiX011 = (ImageView) findViewById(R.id.positionIcon);
        this.O001I = (TextView) findViewById(R.id.video_shoot_tip);
        RecyclerView r4 = (RecyclerView) findViewById(R.id.video_frames_recyclerView);
        this.X1IX = r4;
        r4.setLayoutManager(new LinearLayoutManager(this.I1, 0, false));
        VideoTrimmerAdapter r5 = new VideoTrimmerAdapter(this.I1);
        this.X100O = r5;
        setAdapter(r5);
        addOnScrollListener(this.XOXiX0);
        O001I();
        this.X1 = (CropImageView) findViewById(R.id.crop_image_content);
    }

    public void iX1O1() {
        if (this.X11iII1O1.isPlaying() == false) goto L6;
        iXiX011(this.OX110i);
        this.X11iII1O1.pause();
        setPlayPauseViewIcon(false);
        this.iXiX011.setVisibility(8);
        return;
    }

    public final void iXiX011(long msec) {
        this.X11iII1O1.seekTo((int) msec);
        Log.d(iiIOiX, "seekTo = " + msec);
    }

    public final void iXiiiO(final Context context, final Uri videoUri, int totalThumbsCount, long startPosition, long endPosition) {
        ag6.XO0O10(context, videoUri, totalThumbsCount, startPosition, endPosition, new eg6(this));
    }

    public final void iiiO() {
        iXiX011(this.OX110i);
        setPlayPauseViewIcon(false);
    }

    @Override // com.android.mltcode.paycertificationapi.j0
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
        this.IO = ag6.I0IIOi;
        this.X11I = 0;
        this.XX1Oi = false;
        this.XOX0O0 = 0;
        this.iOiXi11II = 0;
        this.X00Xi1X = new Handler();
        this.IiiXiI0I = 14;
        this.XOIX = new XIi00iiXO(this);
        this.XOXiX0 = new iO(this);
        this.XOO0XOOii = new lg6(this);
        iX(context);
    }
}
