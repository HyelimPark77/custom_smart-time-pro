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
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.DrawableKt;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageViewRound extends AppCompatImageView {
    private boolean antiAlias;

    @aa1
    private Matrix bitmapMatrix;
    private int borderColor;
    private Paint borderPaint;
    private int borderWidth;

    @aa1
    private Paint drawablePaint;
    private boolean isCustomizeDraw;
    private int mTempBorderWidth;
    private int radius;
    private RectF rectF;
    private int type;
    private float viewHeight;
    private float viewWidth;

    @aa1
    private final PorterDuffXfermode xfermode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageViewRound(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final float dp2px(int i) {
        return SizeUtils.dp2px(i);
    }

    private final void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.ImageViewRound);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.antiAlias = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.radius);
        this.borderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.borderWidth);
        this.borderColor = typedArrayObtainStyledAttributes.getColor(1, this.borderColor);
        this.type = typedArrayObtainStyledAttributes.getInteger(5, this.type);
        this.isCustomizeDraw = typedArrayObtainStyledAttributes.getBoolean(3, this.isCustomizeDraw);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float sp2px(int i) {
        return SizeUtils.sp2px(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        if (!this.isCustomizeDraw) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        this.drawablePaint.reset();
        this.drawablePaint.setColor(-1);
        this.drawablePaint.setAntiAlias(true);
        if (getDrawable() == null || this.viewWidth == 0.0f || this.viewHeight == 0.0f) {
            return;
        }
        Drawable drawable = getDrawable();
        Intrinsics.O10IXXX0X(drawable, "getDrawable(...)");
        Bitmap bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
        canvas.saveLayer(0.0f, 0.0f, this.viewWidth, this.viewHeight, null);
        if (this.type == 0) {
            float f = this.viewWidth;
            float f2 = 2;
            canvas.drawCircle(f / f2, this.viewHeight / f2, (f / f2) - (this.borderWidth / 2.0f), this.drawablePaint);
        } else {
            int i = this.borderWidth;
            RectF rectF = new RectF(i / 2.0f, i / 2.0f, this.viewWidth - (i / 2.0f), this.viewHeight - (i / 2.0f));
            int i2 = this.radius;
            canvas.drawRoundRect(rectF, i2, i2, this.drawablePaint);
        }
        this.drawablePaint.setXfermode(this.xfermode);
        float width = (this.viewWidth - this.borderWidth) / bitmap$default.getWidth();
        float height = (this.viewHeight - this.borderWidth) / bitmap$default.getHeight();
        this.bitmapMatrix.reset();
        this.bitmapMatrix.postScale(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap$default, 0, 0, bitmap$default.getWidth(), bitmap$default.getHeight(), this.bitmapMatrix, false);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        int i3 = this.borderWidth;
        canvas.drawBitmap(bitmapCreateBitmap, i3 / 2.0f, i3 / 2.0f, this.drawablePaint);
        canvas.restore();
        int i4 = this.borderWidth;
        if (i4 > 0) {
            Paint paint = null;
            if (this.type == 0) {
                float f3 = this.viewWidth;
                float f4 = 2;
                float f5 = f3 / f4;
                float f6 = this.viewHeight / f4;
                float f7 = (f3 / f4) - (i4 / 2.0f);
                Paint paint2 = this.borderPaint;
                if (paint2 == null) {
                    Intrinsics.XXO("borderPaint");
                } else {
                    paint = paint2;
                }
                canvas.drawCircle(f5, f6, f7, paint);
                return;
            }
            int i5 = this.borderWidth;
            RectF rectF2 = new RectF(i5 / 2.0f, i5 / 2.0f, this.viewWidth - (i5 / 2.0f), this.viewHeight - (i5 / 2.0f));
            int i6 = this.radius;
            float f8 = i6;
            float f9 = i6;
            Paint paint3 = this.borderPaint;
            if (paint3 == null) {
                Intrinsics.XXO("borderPaint");
            } else {
                paint = paint3;
            }
            canvas.drawRoundRect(rectF2, f8, f9, paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewWidth = i;
        this.viewHeight = i2;
        this.rectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
    }

    public final void setRadius(int i) {
        this.radius = i;
        invalidate();
    }

    public final void setType(int i) {
        this.type = i;
        invalidate();
    }

    public final void showSelected(boolean z) {
        if (z) {
            int i = this.mTempBorderWidth;
            if (i > 0) {
                this.borderWidth = i;
            }
        } else {
            int i2 = this.borderWidth;
            if (i2 > 0) {
                this.mTempBorderWidth = i2;
                this.borderWidth = 0;
            }
        }
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageViewRound(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageViewRound(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.drawablePaint = new Paint();
        this.bitmapMatrix = new Matrix();
        this.xfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.antiAlias = true;
        this.radius = (int) dp2px(10);
        this.borderColor = getResources().getColor(R.color.line_color);
        initAttrs(context, attributeSet);
        if (this.borderWidth > 0) {
            Paint paint = new Paint();
            this.borderPaint = paint;
            paint.setAntiAlias(this.antiAlias);
            Paint paint2 = this.borderPaint;
            Paint paint3 = null;
            if (paint2 == null) {
                Intrinsics.XXO("borderPaint");
                paint2 = null;
            }
            paint2.setStrokeWidth(this.borderWidth);
            Paint paint4 = this.borderPaint;
            if (paint4 == null) {
                Intrinsics.XXO("borderPaint");
                paint4 = null;
            }
            paint4.setStyle(Paint.Style.STROKE);
            Paint paint5 = this.borderPaint;
            if (paint5 == null) {
                Intrinsics.XXO("borderPaint");
            } else {
                paint3 = paint5;
            }
            paint3.setColor(this.borderColor);
        }
        setClickable(true);
    }

    public /* synthetic */ ImageViewRound(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
