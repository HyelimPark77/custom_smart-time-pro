package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ScaleSeekBar extends AppCompatSeekBar {
    private boolean isShowTopOfThumb;
    private int mScaleColor;
    private int mScaleCount;

    @tb1
    private Paint mScalePaint;
    private int mScaleWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScaleSeekBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@aa1 Canvas canvas) {
        Canvas canvas2;
        try {
            Intrinsics.X0O(canvas, "canvas");
            super.onDraw(canvas);
            int i = 1;
            this.mScaleCount = getMax() - 1;
            if (getWidth() > 0 && this.mScaleCount > 0) {
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int i2 = this.mScaleCount;
                int i3 = (width - (this.mScaleWidth * i2)) / (i2 + 1);
                int height = ((getHeight() / 2) - (getMinimumHeight() / 2)) + ((getMinimumHeight() * 2) / 5);
                int minimumHeight = (getMinimumHeight() / 5) + height;
                Rect bounds = getThumb() != null ? getThumb().getBounds() : null;
                int i4 = this.mScaleCount;
                if (1 <= i4) {
                    while (true) {
                        int paddingLeft = (i * i3) + getPaddingLeft();
                        int i5 = this.mScaleWidth;
                        int i6 = paddingLeft + i5;
                        int i7 = (i5 * 2) + i6;
                        if (this.isShowTopOfThumb || bounds == null || i6 - getPaddingLeft() <= bounds.left || i7 - getPaddingLeft() >= bounds.right) {
                            Paint paint = this.mScalePaint;
                            Intrinsics.XXI(paint);
                            canvas2 = canvas;
                            canvas2.drawRect(i6, height, i7, minimumHeight, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        if (i == i4) {
                            break;
                        }
                        i++;
                        canvas = canvas2;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setRulerColor(int i) {
        this.mScaleColor = i;
        Paint paint = this.mScalePaint;
        if (paint != null) {
            Intrinsics.XXI(paint);
            paint.setColor(i);
            requestLayout();
        }
    }

    public final void setRulerCount(int i) {
        this.mScaleCount = i;
        requestLayout();
    }

    public final void setRulerWidth(int i) {
        this.mScaleWidth = i;
        requestLayout();
    }

    public final void setShowTopOfThumb(boolean z) {
        this.isShowTopOfThumb = z;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScaleSeekBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScaleSeekBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.mScaleCount = 1;
        this.mScaleWidth = 1;
        this.mScaleColor = ViewCompat.MEASURED_STATE_MASK;
        Paint paint = new Paint();
        this.mScalePaint = paint;
        Intrinsics.XXI(paint);
        paint.setColor(this.mScaleColor);
        Paint paint2 = this.mScalePaint;
        Intrinsics.XXI(paint2);
        paint2.setAntiAlias(true);
        setSplitTrack(false);
    }

    public /* synthetic */ ScaleSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
