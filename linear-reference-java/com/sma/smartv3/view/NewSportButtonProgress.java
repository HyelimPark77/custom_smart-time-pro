package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.v71;
import com.android.mltcode.paycertificationapi.w71;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNewSportButtonProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSportButtonProgress.kt\ncom/sma/smartv3/view/NewSportButtonProgress\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
public final class NewSportButtonProgress extends View {
    public float I1;
    public int IO;
    public final long Ii0X0X;
    public boolean Ii1iii0;
    public float O001I;
    public long OO;
    public float OX110i;

    @tb1
    public iO X00XIX1;

    @tb1
    public Runnable X00Xi1X;

    @aa1
    public final RectF X0i1O;
    public int X100O;

    @aa1
    public final Rect X11I;
    public float X11iII1O1;

    @aa1
    public final Paint X1IX;
    public boolean XO0X10iO;
    public final float XOX0O0;

    @aa1
    public ValueAnimator XX1Oi;
    public int XXO;

    @aa1
    public final Paint XXX11i;
    public boolean XXiIiX10;

    @tb1
    public OXO1 i0X000X0O;

    @tb1
    public XIi00iiXO i11I;
    public final float iIXi1iiXI;
    public float iOiXi11II;
    public float iX1O1;
    public final float iXiX011;
    public int iXiiiO;

    @tb1
    public Bitmap iiiO;

    public interface OXO1 {
        void end();
    }

    public interface XIi00iiXO {
        void start();
    }

    public interface iO {
        void start(boolean r1);
    }

    @JvmOverloads
    public NewSportButtonProgress(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final void I0iXXO(NewSportButtonProgress r1, ValueAnimator r2) {
        Intrinsics.X0O(r2, "animation");
        Object r3 = r2.getAnimatedValue();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type kotlin.Float");
        float r4 = ((Float) r3).floatValue();
        r1.OX110i = r4;
        r1.iOiXi11II = r4 * r1.XOX0O0;
        r1.invalidate();
        if (r1.iOiXi11II == r1.XOX0O0) goto L5;
        return;
    L5:
        if (r1.XO0X10iO == false) goto L11;
        OXO1 r5 = r1.i0X000X0O;
        if (r5 == null) goto L12;
        r5.end();
        return;
    L12:
        return;
    }

    public static /* synthetic */ void IO(NewSportButtonProgress r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        r0.I0IIOi(r1, r2);
    }

    public static /* synthetic */ void O10IXXX0X(NewSportButtonProgress r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        r0.X1ii(r1);
    }

    public static /* synthetic */ void OIX0iXi(NewSportButtonProgress r0, Bitmap r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        r0.OIi0(r1, r2);
    }

    public static /* synthetic */ void OXO1(NewSportButtonProgress r0) {
        XOO0ii0(r0);
    }

    public static /* synthetic */ void XIi00iiXO(NewSportButtonProgress r0, ValueAnimator r1) {
        I0iXXO(r0, r1);
    }

    public static final void XOO0ii0(NewSportButtonProgress r3) {
        if (r3.XXiIiX10 == true) goto L8;
        r3.XXiIiX10 = true;
        r3.XO0X10iO = true;
        r3.OO = 1200;
        r3.setProgress(5.0f);
        iO r4 = r3.X00XIX1;
        if (r4 == null) goto L9;
        r4.start(true);
        return;
    L9:
        return;
    }

    private final void setProgress(float r4) {
        float r0 = this.XOX0O0;
        if (r4 <= r0) goto L5;
        r4 = r0;
    L5:
        ValueAnimator r5 = ValueAnimator.ofFloat(new float[]{this.OX110i, r4 / r0});
        Intrinsics.O10IXXX0X(r5, "ofFloat(...)");
        this.XX1Oi = r5;
        r5.setDuration(this.OO);
        this.XX1Oi.addUpdateListener(new w71(this));
        this.XX1Oi.start();
    }

    public final void I0IIOi(int r3, int r4) {
        this.iiiO = BitmapFactory.decodeResource(getResources(), r3);     // Catch: Exception -> L4
        this.X100O = r4;     // Catch: Exception -> L4
        X1ii(r4);     // Catch: Exception -> L4
        invalidate();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        LogUtils.e(new Object[]{"Failed to load center image with resource id: " + r3, e});
    }

    public final void IiI10X(@aa1 XIi00iiXO r2) {
        Intrinsics.X0O(r2, "callback");
        this.i11I = r2;
    }

    public final void O00(Context r2, AttributeSet r3) {
        TypedArray r4 = r2.obtainStyledAttributes(r3, R.styleable.SportEndProgress);
        Intrinsics.O10IXXX0X(r4, "obtainStyledAttributes(...)");
        this.Ii1iii0 = r4.getBoolean(0, true);
        this.XXO = r4.getColor(4, -1);
        this.iXiiiO = r4.getColor(3, -1);
        r4.recycle();
    }

    public final void OIi0(@tb1 Bitmap r1, int r2) {
        this.iiiO = r1;
        this.X100O = r2;
        X1ii(r2);
        invalidate();
    }

    public final void X1ii(int r6) {
        Bitmap r0 = this.iiiO;
        if (r0 == null) goto L10;
        float r1 = r0.getWidth() / r0.getHeight();
        float r2 = this.X11iII1O1;
        float r3 = 2;
        float r4 = r2 * r3;
        float r5 = r2 * r3;
        if (r1 <= 1.0f) goto L7;
        r4 = r5 * r1;
    L8:
        float r7 = r4 / r3;
        float r8 = (this.I1 - r7) + iO(r6);
        float r9 = this.I1;
        float r10 = r5 / r3;
        this.X11I.set((int) r8, (int) (r9 - r10), (int) ((r9 + r7) + iO(r6)), (int) (this.I1 + r10));
        return;
    L7:
        r5 = r4 / r1;
        goto L8
    }

    public final void XO0O10(@aa1 OXO1 r2) {
        Intrinsics.X0O(r2, "callback");
        this.i0X000X0O = r2;
    }

    public final void XXI(@aa1 iO r2) {
        Intrinsics.X0O(r2, "callback");
        this.X00XIX1 = r2;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent r3) {
        Intrinsics.X0O(r3, NotificationCompat.CATEGORY_EVENT);
        ViewParent r0 = getParent();
        if (r0 == null) goto L6;
        r0.requestDisallowInterceptTouchEvent(true);
    L6:
        return super.dispatchTouchEvent(r3);
    }

    public final float iO(int r1) {
        return SizeUtils.dp2px(r1);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r9) {
        Intrinsics.X0O(r9, "canvas");
        super.onDraw(r9);
        r9.save();
        if (this.XXiIiX10 == false) goto L5;
        float r5 = (this.iOiXi11II / this.XOX0O0) * 360.0f;
        this.O001I = r5;
        Canvas r2 = r9;
        r2.drawArc(this.X0i1O, 270.0f, r5, false, this.X1IX);
    L6:
        Bitmap r10 = this.iiiO;
        if (r10 == null) goto L10;
        r2.drawBitmap(r10, null, this.X11I, this.XXX11i);
        return;
    L10:
        return;
    L5:
        r2 = r9;
        goto L6
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r3 = Math.min(View.MeasureSpec.getSize(r1), View.MeasureSpec.getSize(r2));
        this.IO = r3;
        setMeasuredDimension(r3, r3);
    }

    @Override // android.view.View
    public void onSizeChanged(int r3, int r4, int r5, int r6) {
        super.onSizeChanged(r3, r4, r5, r6);
        int r7 = this.IO;
        float r8 = r7 / 2.0f;
        this.I1 = r8;
        float r9 = r8 - this.iXiX011;
        float r10 = this.iIXi1iiXI;
        this.iX1O1 = r9 - r10;
        this.X11iII1O1 = (r7 / 8.0f) * 3;
        float r11 = r8 - (r10 / 2);
        this.X0i1O.set(r8 - r11, r8 - r11, r8 + r11, r8 + r11);
        X1ii(this.X100O);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent r5) {
        Intrinsics.X0O(r5, NotificationCompat.CATEGORY_EVENT);
        int r6 = r5.getAction();
        if (r6 == 0) goto L22;
        if (r6 != 1) goto L6;
    L8:
        Runnable r7 = this.X00Xi1X;
        if (r7 == null) goto L11;
        removeCallbacks(r7);
    L11:
        ViewParent r8 = getParent();
        if (r8 == null) goto L15;
        r8.requestDisallowInterceptTouchEvent(false);
    L15:
        if (this.XXiIiX10 == false) goto L19;
        this.XO0X10iO = false;
        this.XX1Oi.cancel();
        this.OO = 1;
        setProgress(0.0f);
        iO r9 = this.X00XIX1;
        if (r9 == null) goto L29;
        r9.start(false);
    L29:
        return true;
    L19:
        XIi00iiXO r10 = this.i11I;
        if (r10 == null) goto L29;
        r10.start();
        goto L29
    L6:
        if (r6 == 3) goto L8;
    L22:
        this.XXiIiX10 = false;
        Runnable r11 = this.X00Xi1X;
        if (r11 == null) goto L26;
        removeCallbacks(r11);
    L26:
        if (this.X00Xi1X != null) goto L28;
        this.X00Xi1X = new v71(this);
    L28:
        postDelayed(this.X00Xi1X, this.Ii0X0X);
        goto L29
    }

    public final void setCenterBitmap(int r4) {
        this.iiiO = BitmapFactory.decodeResource(getResources(), r4);     // Catch: Exception -> L4
        this.X100O = 2;     // Catch: Exception -> L4
        X1ii(2);     // Catch: Exception -> L4
        invalidate();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        LogUtils.e(new Object[]{"Failed to load center image with resource id: " + r4, e});
    }

    @JvmOverloads
    public NewSportButtonProgress(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public NewSportButtonProgress(@aa1 Context r6, @tb1 AttributeSet r7, int r8) {
        Intrinsics.X0O(r6, "context");
        super(r6, r7, r8);
        this.iX1O1 = iO(60);
        this.X11iII1O1 = iO(60);
        Paint r9 = new Paint();
        this.XXX11i = r9;
        Paint r0 = new Paint();
        this.X1IX = r0;
        this.X0i1O = new RectF();
        float r1 = iO(4);
        this.iIXi1iiXI = r1;
        this.iXiX011 = iO(8);
        this.Ii1iii0 = true;
        this.X11I = new Rect();
        this.XX1Oi = new ValueAnimator();
        this.OO = 1200;
        this.XOX0O0 = 5.0f;
        this.Ii0X0X = 100;
        O00(r6, r7);
        r9.setAntiAlias(this.Ii1iii0);
        r9.setFilterBitmap(true);
        r9.setColor(this.XXO);
        r0.setAntiAlias(this.Ii1iii0);
        r0.setColor(this.iXiiiO);
        r0.setStyle(Paint.Style.STROKE);
        r0.setStrokeWidth(r1);
        setFocusableInTouchMode(false);
        setLongClickable(false);
        this.iiiO = BitmapFactory.decodeResource(getResources(), com.sma.smartv3.pro.R.drawable.icon_run_pause);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        LogUtils.e(new Object[]{"Failed to load center image", e});
    }

    public /* synthetic */ NewSportButtonProgress(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
