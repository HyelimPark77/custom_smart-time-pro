package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPillTabView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillTabView.kt\ncom/sma/smartv3/view/PillTabView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
public final class PillTabView extends View {

    @aa1
    public final Paint I1;

    @aa1
    public final Paint IO;

    @tb1
    public String X11iII1O1;

    @tb1
    public Function1<? super Boolean, Unit> X1IX;

    @tb1
    public String XXX11i;
    public boolean iX1O1;

    public PillTabView(@aa1 Context r4, @tb1 AttributeSet r5) {
        Intrinsics.X0O(r4, "context");
        super(r4, r5);
        Paint r0 = new Paint(1);
        Paint.Style r2 = Paint.Style.FILL;
        r0.setStyle(r2);
        this.IO = r0;
        Paint r1 = new Paint(1);
        r1.setStyle(r2);
        this.I1 = r1;
        this.iX1O1 = true;
        this.X11iII1O1 = "";
        this.XXX11i = "";
        TypedArray r6 = r4.obtainStyledAttributes(r5, R.styleable.PillTabView);
        Intrinsics.O10IXXX0X(r6, "obtainStyledAttributes(...)");
        this.X11iII1O1 = OXO1(r6, 0);     // Catch: Throwable -> L6
        this.XXX11i = OXO1(r6, 1);     // Catch: Throwable -> L6
        r6.recycle();
        return;
    L6:
        th = move-exception;
        r6.recycle();
        throw th;
    }

    public final String OXO1(TypedArray r3, int r4) {
        int r1 = r3.getResourceId(r4, -1);
        if (r1 == (-1)) goto L7;
        return getContext().getString(r1);
    L7:
        return r3.getString(r4);
    }

    public final void XIi00iiXO() {
        if (this.iX1O1 == true) goto L8;
        this.iX1O1 = true;
        invalidate();
        Function1<? super Boolean, Unit> r0 = this.X1IX;
        if (r0 == null) goto L9;
        r0.invoke(Boolean.valueOf(this.iX1O1));
        return;
    L9:
        return;
    }

    public final void XO0O10(boolean r1) {
        this.iX1O1 = r1;
        invalidate();
    }

    @tb1
    public final Function1<Boolean, Unit> getOnTabSelected() {
        return this.X1IX;
    }

    public final void iO() {
        if (this.iX1O1 == false) goto L8;
        this.iX1O1 = false;
        invalidate();
        Function1<? super Boolean, Unit> r0 = this.X1IX;
        if (r0 == null) goto L9;
        r0.invoke(Boolean.valueOf(this.iX1O1));
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r29) {
        Intrinsics.X0O(r29, "canvas");
        super.onDraw(r29);
        float r12 = getWidth();
        float r13 = getHeight();
        float r9 = 2;
        float r20 = r13 / r9;
        float r16 = (7 * r12) / 10;
        Path r14 = new Path();
        if (this.iX1O1 == false) goto L5;
        float r8 = 90.0f;
        float r11 = 180.0f;
        r14.addRoundRect(0.0f, 0.0f, r16, r13, new float[]{r20, r20, r20, r20, r20, r20, r20, r20}, Path.Direction.CW);
        Path r15 = r14;
        float r17 = r16;
        float r18 = r13;
    L6:
        Paint r6 = this.IO;
        if (this.iX1O1 == false) goto L9;
        int r7 = Color.parseColor("#FF7400");
    L10:
        r6.setColor(r7);
        r29.drawPath(r15, this.IO);
        float r10 = 18.0f + r17;
        Path r19 = new Path();
        if (this.iX1O1 == false) goto L13;
        float r110 = r10 - r20;
        r19.moveTo(r110, 0.0f);
        r19.lineTo(r12 - r20, 0.0f);
        float r111 = r9 * r20;
        r19.arcTo(new RectF(r12 - r111, 0.0f, r12, r18), 270.0f, r11, false);
        r19.lineTo(r110, r18);
        r19.arcTo(new RectF(r10 - r111, 0.0f, r10, r18), r8, -180.0f, false);
        r19.close();
    L14:
        Paint r2 = this.I1;
        if (this.iX1O1 == false) goto L17;
        int r3 = Color.parseColor("#C9C9C9");
    L18:
        r2.setColor(r3);
        r29.drawPath(r19, this.I1);
        Paint r4 = new Paint(1);
        r4.setTextSize(40.0f);
        Paint.Align r5 = Paint.Align.CENTER;
        r4.setTextAlign(r5);
        boolean r21 = this.iX1O1;
        int r22 = ViewCompat.MEASURED_STATE_MASK;
        if (r21 == false) goto L21;
        int r23 = -1;
    L22:
        r4.setColor(r23);
        Typeface r24 = Typeface.DEFAULT;
        r4.setTypeface(Typeface.create(r24, this.iX1O1 ? 1 : 0));
        Paint r25 = new Paint(1);
        r25.setTextSize(40.0f);
        r25.setTextAlign(r5);
        if (this.iX1O1 == true) goto L25;
        r22 = -1;
    L25:
        r25.setColor(r22);
        r25.setTypeface(Typeface.create(r24, !this.iX1O1 ? 1 : 0));
        Paint.FontMetrics r26 = r4.getFontMetrics();
        float r27 = r26.bottom;
        float r28 = (r20 + ((r27 - r26.top) / r9)) - r27;
        float r30 = r17 / r9;
        float r31 = r17 + ((r12 - r17) / r9);
        String r32 = this.X11iII1O1;
        String r33 = "";
        if (r32 != null) goto L28;
        r32 = "";
    L28:
        r29.drawText(r32, r30, r28, r4);
        String r34 = this.XXX11i;
        if (r34 == null) goto L32;
        r33 = r34;
    L32:
        r29.drawText(r33, r31, r28, r25);
        return;
    L21:
        r23 = -16777216;
        goto L22
    L17:
        r3 = Color.parseColor("#FF7400");
        goto L18
    L13:
        r19.addRoundRect(r10 - (r9 * r20), 0.0f, r12, r18, new float[]{r20, r20, r20, r20, r20, r20, r20, r20}, Path.Direction.CW);
        goto L14
    L9:
        r7 = Color.parseColor("#C9C9C9");
        goto L10
    L5:
        r11 = 180.0f;
        r8 = 90.0f;
        r17 = r16;
        r15 = r14;
        r18 = r13;
        r15.moveTo(0.0f, 0.0f);
        r15.lineTo(r17 - r20, 0.0f);
        float r35 = r9 * r20;
        r15.arcTo(new RectF(r17 - r35, 0.0f, r17, r18), 270.0f, -180.0f, false);
        r15.lineTo(0.0f, r18);
        r15.arcTo(new RectF(0.0f, 0.0f, r35, r18), 90.0f, 180.0f, false);
        r15.close();
        goto L6
    }

    @Override // android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent r4) {
        Intrinsics.X0O(r4, NotificationCompat.CATEGORY_EVENT);
        int r0 = r4.getAction();
        boolean r1 = true;
        if (r0 == 0) goto L16;
        if (r0 != 1) goto L15;
        if (r4.getX() < ((getWidth() * 7) / 10)) goto L10;
        r1 = false;
    L10:
        if (r1 == false) goto L12;
        XIi00iiXO();
    L13:
        this.iX1O1 = r1;
        goto L15
    L12:
        iO();
    L15:
        return super.onTouchEvent(r4);
    L16:
        return true;
    }

    public final void setOnTabSelected(@tb1 Function1<? super Boolean, Unit> r1) {
        this.X1IX = r1;
    }
}
