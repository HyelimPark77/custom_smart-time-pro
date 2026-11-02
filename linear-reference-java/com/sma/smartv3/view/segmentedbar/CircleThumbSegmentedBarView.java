package com.sma.smartv3.view.segmentedbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
public class CircleThumbSegmentedBarView extends SegmentedBarView {
    public CircleThumbSegmentedBarView(Context context) {
        super(context);
    }

    @Override // com.sma.smartv3.view.segmentedbar.SegmentedBarView
    public void i010I(Canvas canvas, int thumbW, int thumbH, float centerX, float centerY, int color, Paint paint) {
        setLayerType(1, null);
        paint.setColor(-1);
        int r4 = Math.max(thumbH, thumbW) / 2;
        paint.setShadowLayer(10.0f, 0.0f, 0.0f, Color.argb(80, 0, 0, 0));
        canvas.drawCircle(centerX, centerY, r4 - 10, paint);
        paint.clearShadowLayer();
        paint.setColor(color);
        canvas.drawCircle(centerX, centerY, r4 - 18, paint);
    }

    public CircleThumbSegmentedBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
