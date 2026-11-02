package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nVideoSeekBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoSeekBar.kt\ncom/sma/smartv3/view/VideoSeekBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1869#2,2:72\n*S KotlinDebug\n*F\n+ 1 VideoSeekBar.kt\ncom/sma/smartv3/view/VideoSeekBar\n*L\n56#1:72,2\n*E\n"})
public final class VideoSeekBar extends AppCompatSeekBar {
    private int mScaleColor;

    @aa1
    private List<Integer> mScaleCount;

    @tb1
    private Paint mScalePaint;

    @JvmOverloads
    public VideoSeekBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@aa1 Canvas r6) {
        monitor-enter(this);
        Intrinsics.X0O(r6, "canvas");     // Catch: Throwable -> L13
        super.onDraw(r6);     // Catch: Throwable -> L13
        if (getWidth() > 0) goto L6;
    L17:
        monitor-exit(this);
        return;
    L6:
        if (this.mScaleCount.isEmpty() == true) goto L17;
        Iterator<T> r0 = this.mScaleCount.iterator();     // Catch: Throwable -> L13
    L10:
        if (r0.hasNext() == false) goto L15;
        float r1 = (getWidth() * ((Number) r0.next()).intValue()) / getMax();     // Catch: Throwable -> L13
        float r2 = getHeight() / 2.0f;     // Catch: Throwable -> L13
        float r4 = getMinimumHeight() / 2.0f;     // Catch: Throwable -> L13
        Paint r3 = this.mScalePaint;     // Catch: Throwable -> L13
        Intrinsics.XXI(r3);     // Catch: Throwable -> L13
        r6.drawCircle(r1, r2, r4, r3);     // Catch: Throwable -> L13
        goto L10
    L15:
        monitor-exit(this);
        return;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(@tb1 MotionEvent r1) {
        return true;
    }

    public final void setRulerCount(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "mRulerCount");
        this.mScaleCount = CollectionsKt___CollectionsKt.OO0Oi10(r2);
        requestLayout();
    }

    @JvmOverloads
    public VideoSeekBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public VideoSeekBar(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.mScaleCount = new ArrayList();
        this.mScaleColor = -1;
        Paint r5 = new Paint();
        this.mScalePaint = r5;
        Intrinsics.XXI(r5);
        r5.setColor(this.mScaleColor);
        Paint r6 = this.mScalePaint;
        Intrinsics.XXI(r6);
        r6.setAntiAlias(true);
    }

    public /* synthetic */ VideoSeekBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
