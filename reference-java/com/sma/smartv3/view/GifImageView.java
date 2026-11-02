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
import com.sma.smartv3.C15429R;
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

    @FloatRange(from = 0.0d, m2to = 1.0d)
    float percent;
    private volatile boolean reverse;

    public interface OXO1 {
        default void O00(@FloatRange(from = 0.0d, m2to = 1.0d) float percent) {
        }

        default void OXO1() {
        }

        default void XIi00iiXO() {
        }

        default void XO0O10() {
        }

        /* JADX INFO: renamed from: iO */
        default void m38883iO(boolean pauseSuccess) {
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
        if (this.movieDuration == 0) {
            return 0;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.offsetTime;
        long j = this.mMovieStart;
        int i = this.movieDuration;
        int i2 = (int) ((jUptimeMillis - j) / ((long) i));
        int i3 = this.counts;
        if (i3 != -1 && i2 >= i3) {
            this.hasStart = false;
            OXO1 oxo1 = this.mOnPlayListener;
            if (oxo1 != null) {
                oxo1.OXO1();
            }
            if (this.endLastFrame) {
                return this.movieDuration;
            }
            return 0;
        }
        float f = (jUptimeMillis - j) % ((long) i);
        this.percent = f / i;
        if (this.mOnPlayListener != null && this.hasStart) {
            double dDoubleValue = new BigDecimal(this.percent).setScale(2, 4).doubleValue();
            if (dDoubleValue == 0.99d) {
                dDoubleValue = 1.0d;
            }
            this.mOnPlayListener.O00((float) dDoubleValue);
        }
        return (int) f;
    }

    private void invalidateView() {
        if (this.mVisible) {
            postInvalidateOnAnimation();
        }
    }

    private void reset() {
        this.reverse = false;
        this.mMovieStart = SystemClock.uptimeMillis();
        this.mPaused = false;
        this.hasStart = true;
        this.mMoviePauseTime = 0L;
        this.offsetTime = 0L;
    }

    private void setViewAttributes(Context context, AttributeSet attrs, int defStyle) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C15429R.styleable.GifImageView, defStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.counts = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.endLastFrame = typedArrayObtainStyledAttributes.getBoolean(1, false);
        if (resourceId > 0) {
            setGifResource(resourceId, (OXO1) null);
            if (z) {
                play(this.counts);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    public int getDuration() {
        Movie movie = this.movie;
        if (movie != null) {
            return movie.duration();
        }
        return 0;
    }

    public boolean isPaused() {
        return this.mPaused;
    }

    public boolean isPlaying() {
        return !this.mPaused && this.hasStart;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.movie == null) {
            if (this.mOnPlayListener == null || !this.hasStart) {
                return;
            }
            this.hasStart = false;
            this.mOnPlayListener.OXO1();
            return;
        }
        if (this.mPaused || !this.hasStart) {
            drawMovieFrame(canvas);
            return;
        }
        if (this.reverse) {
            this.movie.setTime(this.movieDuration - getCurrentFrameTime());
        } else {
            this.movie.setTime(getCurrentFrameTime());
        }
        drawMovieFrame(canvas);
        invalidateView();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Movie movie = this.movie;
        if (movie == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.movie.height();
        if (mode == 1073741824) {
            this.mScaleW = iWidth / size;
        }
        if (mode2 == 1073741824) {
            this.mScaleH = iHeight / size2;
        }
        this.mScale = Math.max(this.mScaleW, this.mScaleH);
        if (mode != 1073741824) {
            size = iWidth;
        }
        if (mode2 != 1073741824) {
            size2 = iHeight;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int screenState) {
        super.onScreenStateChanged(screenState);
        this.mVisible = screenState == 1;
        invalidateView();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        this.mVisible = visibility == 0;
        invalidateView();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.mVisible = visibility == 0;
        invalidateView();
    }

    public void pause() {
        if (this.movie == null || this.mPaused || !this.hasStart) {
            OXO1 oxo1 = this.mOnPlayListener;
            if (oxo1 != null) {
                oxo1.m38883iO(false);
                return;
            }
            return;
        }
        this.mPaused = true;
        invalidate();
        this.mMoviePauseTime = SystemClock.uptimeMillis();
        OXO1 oxo2 = this.mOnPlayListener;
        if (oxo2 != null) {
            oxo2.m38883iO(true);
        }
    }

    public void play(int counts) {
        this.counts = counts;
        reset();
        OXO1 oxo1 = this.mOnPlayListener;
        if (oxo1 != null) {
            oxo1.XO0O10();
        }
        invalidate();
    }

    public void playOver() {
        if (this.movie != null) {
            play(-1);
        }
    }

    public void playReverse() {
        if (this.movie != null) {
            reset();
            this.reverse = true;
            OXO1 oxo1 = this.mOnPlayListener;
            if (oxo1 != null) {
                oxo1.XO0O10();
            }
            invalidate();
        }
    }

    public void setGifResource(int movieResourceId, OXO1 onPlayListener) {
        Bitmap bitmapDecodeResource;
        if (onPlayListener != null) {
            this.mOnPlayListener = onPlayListener;
        }
        reset();
        Movie movieDecodeStream = Movie.decodeStream(getResources().openRawResource(movieResourceId));
        this.movie = movieDecodeStream;
        if (movieDecodeStream == null && (bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), movieResourceId)) != null) {
            setImageBitmap(bitmapDecodeResource);
        } else {
            this.movieDuration = this.movie.duration() == 0 ? 1000 : this.movie.duration();
            requestLayout();
        }
    }

    public void setOnPlayListener(OXO1 onPlayListener) {
        this.mOnPlayListener = onPlayListener;
    }

    public void setPercent(float percent) {
        int i;
        Movie movie = this.movie;
        if (movie == null || (i = this.movieDuration) <= 0) {
            return;
        }
        this.percent = percent;
        movie.setTime((int) (i * percent));
        invalidateView();
        OXO1 oxo1 = this.mOnPlayListener;
        if (oxo1 != null) {
            oxo1.O00(percent);
        }
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
        if (this.movie == null) {
            return;
        }
        if (this.hasStart) {
            if (!this.mPaused || this.mMoviePauseTime <= 0) {
                return;
            }
            this.mPaused = false;
            this.offsetTime = (this.offsetTime + SystemClock.uptimeMillis()) - this.mMoviePauseTime;
            invalidate();
            OXO1 oxo1 = this.mOnPlayListener;
            if (oxo1 != null) {
                oxo1.XIi00iiXO();
                return;
            }
            return;
        }
        play(-1);
    }

    public void setGifResource(int movieResourceId) {
        setGifResource(movieResourceId, (OXO1) null);
    }

    public void setGifResource(final String path, OXO1 onPlayListener) {
        Bitmap bitmapDecodeFile;
        this.movie = Movie.decodeFile(path);
        this.mOnPlayListener = onPlayListener;
        reset();
        if (this.movie == null && (bitmapDecodeFile = BitmapFactory.decodeFile(path)) != null) {
            setImageBitmap(bitmapDecodeFile);
            return;
        }
        this.movieDuration = this.movie.duration() == 0 ? 1000 : this.movie.duration();
        requestLayout();
        OXO1 oxo1 = this.mOnPlayListener;
        if (oxo1 != null) {
            oxo1.XO0O10();
        }
    }
}
