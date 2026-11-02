package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWaveformView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaveformView.kt\ncom/sma/smartv3/view/WaveformView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1878#2,3:90\n*S KotlinDebug\n*F\n+ 1 WaveformView.kt\ncom/sma/smartv3/view/WaveformView\n*L\n66#1:90,3\n*E\n"})
public final class WaveformView extends View {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final List<Float> f55060I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Paint f55061IO;
    public final int iX1O1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WaveformView(@aa1 Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.X0O(context, "context");
    }

    public final void OXO1(float f) {
        this.f55060I1.add(Float.valueOf(f));
        if (this.f55060I1.size() > this.iX1O1) {
            this.f55060I1.remove(0);
        }
        i1O0OXO1O.OXO1.OXO1("WaveformView amplitudes: " + this.f55060I1.size() + " " + this.f55060I1.get(0));
        invalidate();
    }

    public final float XIi00iiXO(int i) {
        return SizeUtils.dp2px(i);
    }

    public final float XO0O10(int i) {
        return SizeUtils.sp2px(i);
    }

    /* JADX INFO: renamed from: iO */
    public final void m38917iO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.WaveformView);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f55061IO.setColor(typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#FF8C33")));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f55060I1.isEmpty()) {
            return;
        }
        Path path = new Path();
        float width = getWidth() / this.iX1O1;
        int i = 0;
        for (Object obj : this.f55060I1) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            float f = i * width;
            float fFloatValue = (((Number) obj).floatValue() % getHeight()) / 2;
            path.moveTo(f, ((getHeight() / 2) - XIi00iiXO(4)) - fFloatValue);
            path.lineTo(f, (getHeight() / 2) + XIi00iiXO(4) + fFloatValue);
            i = i2;
        }
        i1O0OXO1O.OXO1.OXO1("WaveformView amplitudes: " + this.f55060I1.size() + " width " + getWidth() + " height " + getHeight());
        canvas.drawPath(path, this.f55061IO);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WaveformView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FF8C33"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(XIi00iiXO(2));
        paint.setAntiAlias(true);
        this.f55061IO = paint;
        this.f55060I1 = new ArrayList();
        this.iX1O1 = 25;
        m38917iO(context, attributeSet);
        for (int i = 0; i < 25; i++) {
            this.f55060I1.add(Float.valueOf(0.0f));
        }
    }

    public /* synthetic */ WaveformView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
