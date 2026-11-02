package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.appcompat.widget.AppCompatImageView;
import com.sma.smartv3.R;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public class GifImageView extends AppCompatImageView {
    private static final int DEFAULT_DURATION = 1000;
    private int counts;
    private boolean endLastFrame;
    private volatile boolean hasStart;
    private long mMoviePauseTime;
    private long mMovieStart;
    private OXO1 mOnPlayListener;
    private volatile boolean mPaused;
    private float mScale;
    private float mScaleH;
    private float mScaleW;
    private boolean mVisible;
    private Movie movie;
    private int movieDuration;
    private long offsetTime;

    @FloatRange(from = 0.0d, to = 1.0d)
    float percent;
    private volatile boolean reverse;

    public interface OXO1 {
        default void O00(@FloatRange(from = 0.0d, to = 1.0d) float percent) {
        }

        default void OXO1() {
        }

        default void XIi00iiXO() {
        }

        default void XO0O10() {
        }

        default void iO(boolean pauseSuccess) {
        }
    }

    public GifImageView(Context context) {
        this(context, null);
    }

    private void drawMovieFrame(Canvas canvas) {
        canvas.save();
        canvas.scale(1.0f / this.mScaleW, 1.0f / this.mScaleH);
        this.movie.draw(canvas, 0.0f, 0.0f);
        canvas.restore();
    }

    private int getCurrentFrameTime() {
        if (this.movieDuration != 0) goto L5;
        return 0;
    L5:
        long r2 = SystemClock.uptimeMillis() - this.offsetTime;
        long r4 = this.mMovieStart;
        int r0 = this.movieDuration;
        int r6 = (int) ((r2 - r4) / ((long) r0));
        int r7 = this.counts;
        if (r7 == (-1)) goto L16;
        if (r6 < r7) goto L16;
        this.hasStart = false;
        OXO1 r1 = this.mOnPlayListener;
        if (r1 == null) goto L12;
        r1.OXO1();
    L12:
        if (this.endLastFrame == true) goto L14;
        return 0;
    L14:
        return this.movieDuration;
    L16:
        float r3 = (r2 - r4) % ((long) r0);
        this.percent = r3 / r0;
        if (this.mOnPlayListener == null) goto L25;
        if (this.hasStart == false) goto L25;
        double r5 = new BigDecimal(this.percent).setScale(2, 4).doubleValue();
        if (r5 != 0.99d) goto L23;
        r5 = 1.0d;
    L23:
        this.mOnPlayListener.O00((float) r5);
    L25:
        return (int) r3;
    }

    private void invalidateView() {
        if (this.mVisible == false) goto L6;
        postInvalidateOnAnimation();
        return;
    }

    private void reset() {
        this.reverse = false;
        this.mMovieStart = SystemClock.uptimeMillis();
        this.mPaused = false;
        this.hasStart = true;
        this.mMoviePauseTime = 0;
        this.offsetTime = 0;
    }

    private void setViewAttributes(Context context, AttributeSet attrs, int defStyle) {
        TypedArray r5 = context.obtainStyledAttributes(attrs, R.styleable.GifImageView, defStyle, 0);
        int r6 = r5.getResourceId(2, 0);
        boolean r0 = r5.getBoolean(0, true);
        this.counts = r5.getInt(3, -1);
        this.endLastFrame = r5.getBoolean(1, false);
        if (r6 <= 0) goto L7;
        setGifResource(r6, null);
        if (r0 == false) goto L7;
        play(this.counts);
    L7:
        r5.recycle();
        setLayerType(1, null);
    }

    public int getDuration() {
        Movie r0 = this.movie;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.duration();
    }

    public boolean isPaused() {
        return this.mPaused;
    }

    public boolean isPlaying() {
        if (this.mPaused == false) goto L5;
        return false;
    L5:
        if (this.hasStart == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.movie == null) goto L17;
        if (this.mPaused == false) goto L7;
    L14:
        drawMovieFrame(canvas);
        return;
    L7:
        if (this.hasStart == false) goto L14;
        if (this.reverse == false) goto L11;
        this.movie.setTime(this.movieDuration - getCurrentFrameTime());
    L12:
        drawMovieFrame(canvas);
        invalidateView();
        return;
    L11:
        this.movie.setTime(getCurrentFrameTime());
        goto L12
    L17:
        if (this.mOnPlayListener != null) goto L19;
        return;
    L19:
        if (this.hasStart == false) goto L23;
        this.hasStart = false;
        this.mOnPlayListener.OXO1();
        return;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int r0 = View.MeasureSpec.getMode(widthMeasureSpec);
        int r1 = View.MeasureSpec.getMode(heightMeasureSpec);
        int r2 = View.MeasureSpec.getSize(widthMeasureSpec);
        int r3 = View.MeasureSpec.getSize(heightMeasureSpec);
        Movie r4 = this.movie;
        if (r4 == null) goto L18;
        int r8 = r4.width();
        int r9 = this.movie.height();
        if (r0 != 1073741824) goto L7;
        this.mScaleW = r8 / r2;
    L7:
        if (r1 != 1073741824) goto L9;
        this.mScaleH = r9 / r3;
    L9:
        this.mScale = Math.max(this.mScaleW, this.mScaleH);
        if (r0 == 1073741824) goto L13;
        r2 = r8;
    L13:
        if (r1 == 1073741824) goto L16;
        r3 = r9;
    L16:
        setMeasuredDimension(r2, r3);
        return;
    L18:
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int screenState) {
        super.onScreenStateChanged(screenState);
        boolean r0 = true;
        if (screenState == 1) goto L6;
        r0 = false;
    L6:
        this.mVisible = r0;
        invalidateView();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (visibility != 0) goto L5;
        boolean r1 = true;
    L6:
        this.mVisible = r1;
        invalidateView();
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility != 0) goto L5;
        boolean r1 = true;
    L6:
        this.mVisible = r1;
        invalidateView();
        return;
    L5:
        r1 = false;
        goto L6
    }

    public void pause() {
        if (this.movie != null) goto L5;
    L12:
        OXO1 r0 = this.mOnPlayListener;
        if (r0 == null) goto L17;
        r0.iO(false);
        return;
    L17:
        return;
    L5:
        if (this.mPaused == true) goto L12;
        if (this.hasStart == false) goto L12;
        this.mPaused = true;
        invalidate();
        this.mMoviePauseTime = SystemClock.uptimeMillis();
        OXO1 r1 = this.mOnPlayListener;
        if (r1 == null) goto L16;
        r1.iO(true);
        return;
    }

    public void play(int counts) {
        this.counts = counts;
        reset();
        OXO1 r1 = this.mOnPlayListener;
        if (r1 == null) goto L5;
        r1.XO0O10();
    L5:
        invalidate();
    }

    public void playOver() {
        if (this.movie == null) goto L6;
        play(-1);
        return;
    }

    public void playReverse() {
        if (this.movie == null) goto L9;
        reset();
        this.reverse = true;
        OXO1 r0 = this.mOnPlayListener;
        if (r0 == null) goto L7;
        r0.XO0O10();
    L7:
        invalidate();
        return;
    }

    public void setGifResource(int movieResourceId, OXO1 onPlayListener) {
        if (onPlayListener == null) goto L4;
        this.mOnPlayListener = onPlayListener;
    L4:
        reset();
        Movie r2 = Movie.decodeStream(getResources().openRawResource(movieResourceId));
        this.movie = r2;
        if (r2 != null) goto L11;
        Bitmap r1 = BitmapFactory.decodeResource(getResources(), movieResourceId);
        if (r1 == null) goto L11;
        setImageBitmap(r1);
        return;
    L11:
        if (this.movie.duration() != 0) goto L13;
        int r3 = 1000;
    L14:
        this.movieDuration = r3;
        requestLayout();
        return;
    L13:
        r3 = this.movie.duration();
        goto L14
    }

    public void setOnPlayListener(OXO1 onPlayListener) {
        this.mOnPlayListener = onPlayListener;
    }

    public void setPercent(float percent) {
        Movie r0 = this.movie;
        if (r0 == null) goto L10;
        int r1 = this.movieDuration;
        if (r1 <= 0) goto L11;
        this.percent = percent;
        r0.setTime((int) (r1 * percent));
        invalidateView();
        OXO1 r2 = this.mOnPlayListener;
        if (r2 == null) goto L12;
        r2.O00(percent);
        return;
    L12:
        return;
    L11:
        return;
    }

    public GifImageView(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public GifImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mScaleW = 1.0f;
        this.mScaleH = 1.0f;
        this.mScale = 1.0f;
        this.counts = -1;
        this.reverse = false;
        this.mVisible = true;
        this.endLastFrame = false;
        setViewAttributes(context, attrs, defStyle);
    }

    public void play() {
        if (this.movie != null) goto L6;
        return;
    L6:
        if (this.hasStart == true) goto L8;
        play(-1);
        return;
    L8:
        if (this.mPaused == true) goto L10;
        return;
    L10:
        if (this.mMoviePauseTime <= 0) goto L18;
        this.mPaused = false;
        this.offsetTime = (this.offsetTime + SystemClock.uptimeMillis()) - this.mMoviePauseTime;
        invalidate();
        OXO1 r0 = this.mOnPlayListener;
        if (r0 == null) goto L19;
        r0.XIi00iiXO();
        return;
    L19:
        return;
    }

    public void setGifResource(int movieResourceId) {
        setGifResource(movieResourceId, null);
    }

    public void setGifResource(final String path, OXO1 onPlayListener) {
        this.movie = Movie.decodeFile(path);
        this.mOnPlayListener = onPlayListener;
        reset();
        if (this.movie != null) goto L9;
        Bitmap r2 = BitmapFactory.decodeFile(path);
        if (r2 == null) goto L9;
        setImageBitmap(r2);
        return;
    L9:
        if (this.movie.duration() != 0) goto L11;
        int r3 = 1000;
    L12:
        this.movieDuration = r3;
        requestLayout();
        OXO1 r4 = this.mOnPlayListener;
        if (r4 == null) goto L16;
        r4.XO0O10();
        return;
    L16:
        return;
    L11:
        r3 = this.movie.duration();
        goto L12
    }
}
