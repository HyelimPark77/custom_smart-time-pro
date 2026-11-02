package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public class MLImageView extends AppCompatImageView {
    private int mBorderColor;
    private int mBorderWidth;
    private int mHeight;
    private int mPressAlpha;
    private int mPressColor;
    private Paint mPressPaint;
    private int mRadius;
    private int mShapeType;
    private int mWidth;

    public MLImageView(Context context) {
        super(context);
        init(context, null);
    }

    private void drawBorder(Canvas canvas) {
        if (this.mBorderWidth <= 0) goto L10;
        Paint r0 = new Paint();
        r0.setStrokeWidth(this.mBorderWidth);
        r0.setStyle(Paint.Style.STROKE);
        r0.setColor(this.mBorderColor);
        r0.setAntiAlias(true);
        if (this.mShapeType != 0) goto L8;
        int r1 = this.mWidth;
        canvas.drawCircle(r1 / 2, this.mHeight / 2, (r1 / 2) - this.mBorderWidth, r0);
        return;
    L8:
        RectF r2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        int r3 = this.mRadius;
        canvas.drawRoundRect(r2, r3, r3, r0);
        return;
    }

    private void drawDrawable(Canvas canvas, Bitmap bitmap) {
        Paint r0 = new Paint();
        r0.setColor(-1);
        r0.setAntiAlias(true);
        PorterDuffXfermode r1 = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        canvas.saveLayer(0.0f, 0.0f, this.mWidth, this.mHeight, null);
        if (this.mShapeType != 0) goto L5;
        int r12 = this.mWidth;
        canvas.drawCircle(r12 / 2, this.mHeight / 2, (r12 / 2) - this.mBorderWidth, r0);
    L6:
        r0.setXfermode(r1);
        float r13 = (getWidth() - this.mBorderWidth) / bitmap.getWidth();
        float r2 = (getHeight() - this.mBorderWidth) / bitmap.getHeight();
        Matrix r9 = new Matrix();
        r9.postScale(r13, r2);
        canvas.drawBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), r9, true), 0.0f, 0.0f, r0);
        canvas.restore();
        return;
    L5:
        RectF r14 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        int r4 = this.mRadius;
        canvas.drawRoundRect(r14, r4, r4, r0);
        goto L6
    }

    private void drawPress(Canvas canvas) {
        int r0 = this.mShapeType;
        if (r0 != 0) goto L7;
        int r1 = this.mWidth;
        canvas.drawCircle(r1 / 2, this.mHeight / 2, r1 / 2, this.mPressPaint);
        return;
    L7:
        if (r0 != 1) goto L10;
        RectF r2 = new RectF(0.0f, 0.0f, this.mWidth, this.mHeight);
        int r3 = this.mRadius;
        canvas.drawRoundRect(r2, r3, r3, this.mPressPaint);
        return;
    }

    private void init(Context context, AttributeSet attrs) {
        this.mPressAlpha = 64;
        this.mPressColor = getResources().getColor(R.color.launcher_title_bar);
        this.mRadius = 16;
        this.mShapeType = 1;
        this.mBorderWidth = 0;
        this.mBorderColor = getResources().getColor(R.color.colorAccent_secondary);
        if (attrs == null) goto L5;
        LogUtils.d(new Object[]{"test attrs"});
        TypedArray r5 = context.obtainStyledAttributes(attrs, com.sma.smartv3.R.styleable.MLImageView);
        this.mPressColor = r5.getColor(3, this.mPressColor);
        this.mPressAlpha = r5.getInteger(2, this.mPressAlpha);
        this.mRadius = r5.getDimensionPixelSize(4, this.mRadius);
        this.mShapeType = r5.getInteger(5, this.mShapeType);
        this.mBorderWidth = r5.getDimensionPixelOffset(1, this.mBorderWidth);
        this.mBorderColor = r5.getColor(0, this.mBorderColor);
        r5.recycle();
    L5:
        Paint r6 = new Paint();
        this.mPressPaint = r6;
        r6.setAntiAlias(true);
        this.mPressPaint.setStyle(Paint.Style.FILL);
        this.mPressPaint.setColor(this.mPressColor);
        this.mPressPaint.setAlpha(0);
        this.mPressPaint.setFlags(1);
        setClickable(true);
        setDrawingCacheEnabled(true);
        setWillNotDraw(false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable r0 = getDrawable();
        if (r0 != null) goto L6;
        return;
    L6:
        if (getWidth() != 0) goto L8;
        return;
    L8:
        if (getHeight() == 0) goto L14;
        drawDrawable(canvas, ((BitmapDrawable) r0).getBitmap());
        drawPress(canvas);
        drawBorder(canvas);
        return;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        LogUtils.d(new Object[]{"test onSizeChanged 1 " + w});
        this.mWidth = w;
        this.mHeight = h;
        LogUtils.d(new Object[]{"test onSizeChanged 2 " + this.mWidth});
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int r0 = event.getAction();
        if (r0 != 0) goto L5;
        this.mPressPaint.setAlpha(this.mPressAlpha);
        invalidate();
    L10:
        return super.onTouchEvent(event);
    L5:
        if (r0 == 1) goto L7;
        invalidate();
        goto L10
    L7:
        this.mPressPaint.setAlpha(0);
        invalidate();
        goto L10
    }

    public MLImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public MLImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }
}
