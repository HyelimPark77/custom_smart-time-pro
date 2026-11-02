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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoSeekBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() > 0 && !this.mScaleCount.isEmpty()) {
            Iterator<T> it = this.mScaleCount.iterator();
            while (it.hasNext()) {
                float width = (getWidth() * ((Number) it.next()).intValue()) / getMax();
                float height = getHeight() / 2.0f;
                float minimumHeight = getMinimumHeight() / 2.0f;
                Paint paint = this.mScalePaint;
                Intrinsics.XXI(paint);
                canvas.drawCircle(width, height, minimumHeight, paint);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(@tb1 MotionEvent motionEvent) {
        return true;
    }

    public final void setRulerCount(@aa1 List<Integer> mRulerCount) {
        Intrinsics.X0O(mRulerCount, "mRulerCount");
        this.mScaleCount = CollectionsKt___CollectionsKt.OO0Oi10(mRulerCount);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoSeekBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoSeekBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.mScaleCount = new ArrayList();
        this.mScaleColor = -1;
        Paint paint = new Paint();
        this.mScalePaint = paint;
        Intrinsics.XXI(paint);
        paint.setColor(this.mScaleColor);
        Paint paint2 = this.mScalePaint;
        Intrinsics.XXI(paint2);
        paint2.setAntiAlias(true);
    }

    public /* synthetic */ VideoSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
