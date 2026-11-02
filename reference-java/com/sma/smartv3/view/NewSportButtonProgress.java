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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.NewSportButtonProgress;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNewSportButtonProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewSportButtonProgress.kt\ncom/sma/smartv3/view/NewSportButtonProgress\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
public final class NewSportButtonProgress extends View {

    /* JADX INFO: renamed from: I1 */
    public float f55012I1;

    /* JADX INFO: renamed from: IO */
    public int f55013IO;
    public final long Ii0X0X;
    public boolean Ii1iii0;
    public float O001I;

    /* JADX INFO: renamed from: OO */
    public long f55014OO;
    public float OX110i;

    @tb1
    public InterfaceC19066iO X00XIX1;

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

    /* JADX INFO: renamed from: com.sma.smartv3.view.NewSportButtonProgress$iO */
    public interface InterfaceC19066iO {
        void start(boolean z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewSportButtonProgress(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static final void I0iXXO(NewSportButtonProgress newSportButtonProgress, ValueAnimator animation) {
        OXO1 oxo1;
        Intrinsics.X0O(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        newSportButtonProgress.OX110i = fFloatValue;
        newSportButtonProgress.iOiXi11II = fFloatValue * newSportButtonProgress.XOX0O0;
        newSportButtonProgress.invalidate();
        if (newSportButtonProgress.iOiXi11II == newSportButtonProgress.XOX0O0 && newSportButtonProgress.XO0X10iO && (oxo1 = newSportButtonProgress.i0X000X0O) != null) {
            oxo1.end();
        }
    }

    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38898IO(NewSportButtonProgress newSportButtonProgress, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        newSportButtonProgress.I0IIOi(i, i2);
    }

    public static /* synthetic */ void O10IXXX0X(NewSportButtonProgress newSportButtonProgress, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        newSportButtonProgress.X1ii(i);
    }

    public static /* synthetic */ void OIX0iXi(NewSportButtonProgress newSportButtonProgress, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        newSportButtonProgress.OIi0(bitmap, i);
    }

    public static final void XOO0ii0(NewSportButtonProgress newSportButtonProgress) {
        if (newSportButtonProgress.XXiIiX10) {
            return;
        }
        newSportButtonProgress.XXiIiX10 = true;
        newSportButtonProgress.XO0X10iO = true;
        newSportButtonProgress.f55014OO = 1200L;
        newSportButtonProgress.setProgress(5.0f);
        InterfaceC19066iO interfaceC19066iO = newSportButtonProgress.X00XIX1;
        if (interfaceC19066iO != null) {
            interfaceC19066iO.start(true);
        }
    }

    private final void setProgress(float f) {
        float f2 = this.XOX0O0;
        if (f > f2) {
            f = f2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.OX110i, f / f2);
        Intrinsics.O10IXXX0X(valueAnimatorOfFloat, "ofFloat(...)");
        this.XX1Oi = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f55014OO);
        this.XX1Oi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.w71
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewSportButtonProgress.I0iXXO(this.f11898IO, valueAnimator);
            }
        });
        this.XX1Oi.start();
    }

    public final void I0IIOi(int i, int i2) {
        try {
            this.iiiO = BitmapFactory.decodeResource(getResources(), i);
            this.X100O = i2;
            X1ii(i2);
            invalidate();
        } catch (Exception e) {
            LogUtils.m11129e("Failed to load center image with resource id: " + i, e);
        }
    }

    public final void IiI10X(@aa1 XIi00iiXO callback) {
        Intrinsics.X0O(callback, "callback");
        this.i11I = callback;
    }

    public final void O00(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.SportEndProgress);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.XXO = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.iXiiiO = typedArrayObtainStyledAttributes.getColor(3, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OIi0(@tb1 Bitmap bitmap, int i) {
        this.iiiO = bitmap;
        this.X100O = i;
        X1ii(i);
        invalidate();
    }

    public final void X1ii(int i) {
        Bitmap bitmap = this.iiiO;
        if (bitmap != null) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            float f = this.X11iII1O1;
            float f2 = 2;
            float f3 = f * f2;
            float f4 = f * f2;
            if (width > 1.0f) {
                f3 = f4 * width;
            } else {
                f4 = f3 / width;
            }
            float f5 = f3 / f2;
            float fM38899iO = (this.f55012I1 - f5) + m38899iO(i);
            float f6 = this.f55012I1;
            float f7 = f4 / f2;
            this.X11I.set((int) fM38899iO, (int) (f6 - f7), (int) (f6 + f5 + m38899iO(i)), (int) (this.f55012I1 + f7));
        }
    }

    public final void XO0O10(@aa1 OXO1 callback) {
        Intrinsics.X0O(callback, "callback");
        this.i0X000X0O = callback;
    }

    public final void XXI(@aa1 InterfaceC19066iO callback) {
        Intrinsics.X0O(callback, "callback");
        this.X00XIX1 = callback;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(event);
    }

    /* JADX INFO: renamed from: iO */
    public final float m38899iO(int i) {
        return SizeUtils.dp2px(i);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Canvas canvas2;
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        if (this.XXiIiX10) {
            float f = (this.iOiXi11II / this.XOX0O0) * 360.0f;
            this.O001I = f;
            canvas2 = canvas;
            canvas2.drawArc(this.X0i1O, 270.0f, f, false, this.X1IX);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.iiiO;
        if (bitmap != null) {
            canvas2.drawBitmap(bitmap, (Rect) null, this.X11I, this.XXX11i);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.f55013IO = iMin;
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.f55013IO;
        float f = i5 / 2.0f;
        this.f55012I1 = f;
        float f2 = f - this.iXiX011;
        float f3 = this.iIXi1iiXI;
        this.iX1O1 = f2 - f3;
        this.X11iII1O1 = (i5 / 8.0f) * 3;
        float f4 = f - (f3 / 2);
        this.X0i1O.set(f - f4, f - f4, f + f4, f + f4);
        X1ii(this.X100O);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.XXiIiX10 = false;
            Runnable runnable = this.X00Xi1X;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            if (this.X00Xi1X == null) {
                this.X00Xi1X = new Runnable() { // from class: com.android.mltcode.paycertificationapi.v71
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewSportButtonProgress.XOO0ii0(this.f11667IO);
                    }
                };
            }
            postDelayed(this.X00Xi1X, this.Ii0X0X);
        } else if (action == 1 || action == 3) {
            Runnable runnable2 = this.X00Xi1X;
            if (runnable2 != null) {
                removeCallbacks(runnable2);
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (this.XXiIiX10) {
                this.XO0X10iO = false;
                this.XX1Oi.cancel();
                this.f55014OO = 1L;
                setProgress(0.0f);
                InterfaceC19066iO interfaceC19066iO = this.X00XIX1;
                if (interfaceC19066iO != null) {
                    interfaceC19066iO.start(false);
                }
            } else {
                XIi00iiXO xIi00iiXO = this.i11I;
                if (xIi00iiXO != null) {
                    xIi00iiXO.start();
                }
            }
        }
        return true;
    }

    public final void setCenterBitmap(int i) {
        try {
            this.iiiO = BitmapFactory.decodeResource(getResources(), i);
            this.X100O = 2;
            X1ii(2);
            invalidate();
        } catch (Exception e) {
            LogUtils.m11129e("Failed to load center image with resource id: " + i, e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewSportButtonProgress(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewSportButtonProgress(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.iX1O1 = m38899iO(60);
        this.X11iII1O1 = m38899iO(60);
        Paint paint = new Paint();
        this.XXX11i = paint;
        Paint paint2 = new Paint();
        this.X1IX = paint2;
        this.X0i1O = new RectF();
        float fM38899iO = m38899iO(4);
        this.iIXi1iiXI = fM38899iO;
        this.iXiX011 = m38899iO(8);
        this.Ii1iii0 = true;
        this.X11I = new Rect();
        this.XX1Oi = new ValueAnimator();
        this.f55014OO = 1200L;
        this.XOX0O0 = 5.0f;
        this.Ii0X0X = 100L;
        O00(context, attributeSet);
        paint.setAntiAlias(this.Ii1iii0);
        paint.setFilterBitmap(true);
        paint.setColor(this.XXO);
        paint2.setAntiAlias(this.Ii1iii0);
        paint2.setColor(this.iXiiiO);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fM38899iO);
        setFocusableInTouchMode(false);
        setLongClickable(false);
        try {
            this.iiiO = BitmapFactory.decodeResource(getResources(), R.drawable.icon_run_pause);
        } catch (Exception e) {
            LogUtils.m11129e("Failed to load center image", e);
        }
    }

    public /* synthetic */ NewSportButtonProgress(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
