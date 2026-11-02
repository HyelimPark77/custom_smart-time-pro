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

    @JvmOverloads
    public ScaleSeekBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@aa1 Canvas r13) {
        monitor-enter(this);
        Intrinsics.X0O(r13, "canvas");     // Catch: Throwable -> L11
        super.onDraw(r13);     // Catch: Throwable -> L11
        int r1 = 1;
        this.mScaleCount = getMax() - 1;     // Catch: Throwable -> L11
        if (getWidth() > 0) goto L6;
    L29:
        monitor-exit(this);
        return;
    L6:
        if (this.mScaleCount <= 0) goto L29;
        int r0 = (getWidth() - getPaddingLeft()) - getPaddingRight();     // Catch: Throwable -> L11
        int r2 = this.mScaleCount;     // Catch: Throwable -> L11
        int r3 = (r0 - (this.mScaleWidth * r2)) / (r2 + 1);     // Catch: Throwable -> L11
        int r4 = ((getHeight() / 2) - (getMinimumHeight() / 2)) + ((getMinimumHeight() * 2) / 5);     // Catch: Throwable -> L11
        int r5 = (getMinimumHeight() / 5) + r4;     // Catch: Throwable -> L11
        if (getThumb() == null) goto L13;
        Rect r6 = getThumb().getBounds();     // Catch: Throwable -> L11
    L14:
        int r7 = this.mScaleCount;     // Catch: Throwable -> L11
        if (1 > r7) goto L27;
    L16:
        int r8 = (r1 * r3) + getPaddingLeft();     // Catch: Throwable -> L11
        int r9 = this.mScaleWidth;     // Catch: Throwable -> L11
        int r10 = r8 + r9;     // Catch: Throwable -> L11
        int r11 = (r9 * 2) + r10;     // Catch: Throwable -> L11
        if (this.isShowTopOfThumb == true) goto L24;
        if (r6 == null) goto L24;
        if ((r10 - getPaddingLeft()) <= r6.left) goto L24;
        if ((r11 - getPaddingLeft()) >= r6.right) goto L24;
        Canvas r12 = r13;
    L25:
        if (r1 == r7) goto L27;
        r1 = r1 + 1;
        r13 = r12;
    L24:
        Paint r14 = this.mScalePaint;     // Catch: Throwable -> L11
        Intrinsics.XXI(r14);     // Catch: Throwable -> L11
        r12 = r13;
        r12.drawRect(r10, r4, r11, r5, r14);     // Catch: Throwable -> L11
    L27:
        monitor-exit(this);
        return;
    L13:
        r6 = null;
    L11:
        th = move-exception;
        throw th;
    }

    public final void setRulerColor(int r2) {
        this.mScaleColor = r2;
        Paint r0 = this.mScalePaint;
        if (r0 == null) goto L6;
        Intrinsics.XXI(r0);
        r0.setColor(r2);
        requestLayout();
        return;
    }

    public final void setRulerCount(int r1) {
        this.mScaleCount = r1;
        requestLayout();
    }

    public final void setRulerWidth(int r1) {
        this.mScaleWidth = r1;
        requestLayout();
    }

    public final void setShowTopOfThumb(boolean r1) {
        this.isShowTopOfThumb = r1;
        requestLayout();
    }

    @JvmOverloads
    public ScaleSeekBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public ScaleSeekBar(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.mScaleCount = 1;
        this.mScaleWidth = 1;
        this.mScaleColor = ViewCompat.MEASURED_STATE_MASK;
        Paint r5 = new Paint();
        this.mScalePaint = r5;
        Intrinsics.XXI(r5);
        r5.setColor(this.mScaleColor);
        Paint r6 = this.mScalePaint;
        Intrinsics.XXI(r6);
        r6.setAntiAlias(true);
        setSplitTrack(false);
    }

    public /* synthetic */ ScaleSeekBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
