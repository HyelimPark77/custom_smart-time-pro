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
import com.sma.smartv3.R;
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

    @JvmOverloads
    public ImageViewRound(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final float dp2px(int r1) {
        return SizeUtils.dp2px(r1);
    }

    private final void initAttrs(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.ImageViewRound);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.antiAlias = r5.getBoolean(0, true);
        this.radius = r5.getDimensionPixelSize(4, this.radius);
        this.borderWidth = r5.getDimensionPixelSize(2, this.borderWidth);
        this.borderColor = r5.getColor(1, this.borderColor);
        this.type = r5.getInteger(5, this.type);
        this.isCustomizeDraw = r5.getBoolean(3, this.isCustomizeDraw);
        r5.recycle();
    }

    private final float sp2px(int r1) {
        return SizeUtils.sp2px(r1);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@aa1 Canvas r15) {
        Intrinsics.X0O(r15, "canvas");
        if (this.isCustomizeDraw == false) goto L33;
        r15.save();
        this.drawablePaint.reset();
        this.drawablePaint.setColor(-1);
        this.drawablePaint.setAntiAlias(true);
        if (getDrawable() != null) goto L8;
        return;
    L8:
        if (this.viewWidth != 0.0f) goto L11;
        return;
    L11:
        if (this.viewHeight != 0.0f) goto L13;
        return;
    L13:
        Drawable r1 = getDrawable();
        Intrinsics.O10IXXX0X(r1, "getDrawable(...)");
        Bitmap r7 = DrawableKt.toBitmap$default(r1, 0, 0, null, 7, null);
        r15.saveLayer(0.0f, 0.0f, this.viewWidth, this.viewHeight, null);
        if (this.type != 0) goto L16;
        float r16 = this.viewWidth;
        float r3 = 2;
        r15.drawCircle(r16 / r3, this.viewHeight / r3, (r16 / r3) - (this.borderWidth / 2.0f), this.drawablePaint);
    L17:
        this.drawablePaint.setXfermode(this.xfermode);
        float r17 = (this.viewWidth - this.borderWidth) / r7.getWidth();
        float r4 = (this.viewHeight - this.borderWidth) / r7.getHeight();
        this.bitmapMatrix.reset();
        this.bitmapMatrix.postScale(r17, r4);
        Bitmap r18 = Bitmap.createBitmap(r7, 0, 0, r7.getWidth(), r7.getHeight(), this.bitmapMatrix, false);
        Intrinsics.O10IXXX0X(r18, "createBitmap(...)");
        int r5 = this.borderWidth;
        r15.drawBitmap(r18, r5 / 2.0f, r5 / 2.0f, this.drawablePaint);
        r15.restore();
        int r19 = this.borderWidth;
        if (r19 <= 0) goto L35;
        Paint r6 = null;
        if (this.type != 0) goto L27;
        float r8 = this.viewWidth;
        float r2 = 2;
        float r9 = r8 / r2;
        float r10 = this.viewHeight / r2;
        float r11 = (r8 / r2) - (r19 / 2.0f);
        Paint r110 = this.borderPaint;
        if (r110 != null) goto L24;
        Intrinsics.XXO("borderPaint");
    L25:
        r15.drawCircle(r9, r10, r11, r6);
        return;
    L24:
        r6 = r110;
        goto L25
    L27:
        int r12 = this.borderWidth;
        RectF r111 = new RectF(r12 / 2.0f, r12 / 2.0f, this.viewWidth - (r12 / 2.0f), this.viewHeight - (r12 / 2.0f));
        int r13 = this.radius;
        float r14 = r13;
        float r20 = r13;
        Paint r21 = this.borderPaint;
        if (r21 != null) goto L30;
        Intrinsics.XXO("borderPaint");
    L31:
        r15.drawRoundRect(r111, r14, r20, r6);
        return;
    L30:
        r6 = r21;
        goto L31
    L35:
        return;
    L16:
        int r22 = this.borderWidth;
        RectF r112 = new RectF(r22 / 2.0f, r22 / 2.0f, this.viewWidth - (r22 / 2.0f), this.viewHeight - (r22 / 2.0f));
        int r23 = this.radius;
        r15.drawRoundRect(r112, r23, r23, this.drawablePaint);
        goto L17
    L33:
        super.onDraw(r15);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.viewWidth = r1;
        this.viewHeight = r2;
        this.rectF = new RectF(0.0f, 0.0f, this.viewWidth, this.viewHeight);
    }

    public final void setRadius(int r1) {
        this.radius = r1;
        invalidate();
    }

    public final void setType(int r1) {
        this.type = r1;
        invalidate();
    }

    public final void showSelected(boolean r1) {
        if (r1 == false) goto L6;
        int r2 = this.mTempBorderWidth;
        if (r2 <= 0) goto L9;
        this.borderWidth = r2;
    L9:
        postInvalidate();
        return;
    L6:
        int r3 = this.borderWidth;
        if (r3 <= 0) goto L9;
        this.mTempBorderWidth = r3;
        this.borderWidth = 0;
        goto L9
    }

    @JvmOverloads
    public ImageViewRound(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public ImageViewRound(@aa1 Context r3, @tb1 AttributeSet r4, int r5) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4, r5);
        this.drawablePaint = new Paint();
        this.bitmapMatrix = new Matrix();
        this.xfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.antiAlias = true;
        this.radius = (int) dp2px(10);
        this.borderColor = getResources().getColor(com.sma.smartv3.pro.R.color.line_color);
        initAttrs(r3, r4);
        if (this.borderWidth <= 0) goto L15;
        Paint r6 = new Paint();
        this.borderPaint = r6;
        r6.setAntiAlias(this.antiAlias);
        Paint r7 = this.borderPaint;
        Paint r8 = null;
        if (r7 != null) goto L7;
        Intrinsics.XXO("borderPaint");
        r7 = null;
    L7:
        r7.setStrokeWidth(this.borderWidth);
        Paint r9 = this.borderPaint;
        if (r9 != null) goto L10;
        Intrinsics.XXO("borderPaint");
        r9 = null;
    L10:
        r9.setStyle(Paint.Style.STROKE);
        Paint r10 = this.borderPaint;
        if (r10 != null) goto L13;
        Intrinsics.XXO("borderPaint");
    L14:
        r8.setColor(this.borderColor);
        goto L15
    L13:
        r8 = r10;
    L15:
        setClickable(true);
    }

    public /* synthetic */ ImageViewRound(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
