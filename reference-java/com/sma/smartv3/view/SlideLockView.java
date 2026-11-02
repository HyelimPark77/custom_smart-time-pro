package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SlideLockView extends ViewGroup {

    /* JADX INFO: renamed from: I1 */
    public final int f55038I1;

    /* JADX INFO: renamed from: IO */
    public final int f55039IO;

    @aa1
    public CustomizeTextView IO0II0i;

    @tb1
    public InterfaceC19067iO IXOIIIO;
    public int Ii0X0X;

    @tb1
    public String Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    public float f55040OO;
    public int OX110i;
    public boolean X00XIX1;

    @aa1
    public final RectF X00Xi1X;

    @aa1
    public Paint X0i1O;

    /* JADX INFO: renamed from: X1 */
    public int f55041X1;
    public int X100O;
    public float X11I;
    public int X11iII1O1;

    @tb1
    public XIi00iiXO X1IX;
    public int XO0X10iO;
    public float XOX0O0;

    @tb1
    public String XX1Oi;
    public int XXO;
    public int XXX11i;

    @aa1
    public final RectF XXiIiX10;
    public int i0X000X0O;
    public int i11I;

    @aa1
    public Paint iIXi1iiXI;
    public boolean iOiXi11II;

    @aa1
    public SlideIcon iX1O1;

    @aa1
    public Paint iXiX011;

    @tb1
    public String iXiiiO;
    public int iiiO;

    public final class CustomizeTextView extends AppCompatTextView {

        @tb1
        private LinearGradient mLinearGradient;

        @tb1
        private Matrix mMatrix;

        @tb1
        private Paint mPaint;
        private int mTranslate;
        private int mViewWith;
        final /* synthetic */ SlideLockView this$0;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public CustomizeTextView(@aa1 SlideLockView slideLockView, Context context) {
            this(slideLockView, context, null, 0, 6, null);
            Intrinsics.X0O(context, "context");
        }

        @Override // android.widget.TextView, android.view.View
        public void onDraw(@aa1 Canvas canvas) {
            Intrinsics.X0O(canvas, "canvas");
            super.onDraw(canvas);
            Matrix matrix = this.mMatrix;
            if (matrix != null) {
                int i = this.mTranslate;
                int i2 = this.mViewWith;
                int i3 = i + (i2 / 14);
                this.mTranslate = i3;
                if (i3 > i2 * 2) {
                    this.mTranslate = -i2;
                }
                Intrinsics.XXI(matrix);
                matrix.setTranslate(this.mTranslate, 0.0f);
                LinearGradient linearGradient = this.mLinearGradient;
                Intrinsics.XXI(linearGradient);
                linearGradient.setLocalMatrix(this.mMatrix);
                postInvalidateDelayed(250L);
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.mViewWith == 0) {
                int measuredWidth = getMeasuredWidth();
                this.mViewWith = measuredWidth;
                if (measuredWidth > 0) {
                    this.mPaint = getPaint();
                    this.mLinearGradient = new LinearGradient(0.0f, 0.0f, this.mViewWith, 0.0f, new int[]{this.this$0.i11I, this.this$0.XO0X10iO, this.this$0.Ii0X0X}, (float[]) null, Shader.TileMode.MIRROR);
                    Paint paint = this.mPaint;
                    Intrinsics.XXI(paint);
                    paint.setShader(this.mLinearGradient);
                    this.mMatrix = new Matrix();
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public CustomizeTextView(@aa1 SlideLockView slideLockView, @tb1 Context context, AttributeSet attributeSet) {
            this(slideLockView, context, attributeSet, 0, 4, null);
            Intrinsics.X0O(context, "context");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public CustomizeTextView(@aa1 SlideLockView slideLockView, @tb1 Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Intrinsics.X0O(context, "context");
            this.this$0 = slideLockView;
        }

        public /* synthetic */ CustomizeTextView(SlideLockView slideLockView, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(slideLockView, context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public static final class OXO1 implements XIi00iiXO {
        public OXO1() {
        }

        @Override // com.sma.smartv3.view.SlideLockView.XIi00iiXO
        public void OXO1(int i) {
            SlideLockView.this.X11iII1O1 = i;
            SlideLockView.this.XXX11i = 0;
            if (SlideLockView.this.X11iII1O1 + SlideLockView.this.iX1O1.getMeasuredWidth() < SlideLockView.this.getMeasuredWidth()) {
                if (SlideLockView.this.iOiXi11II) {
                    SlideLockView.this.X11iII1O1 = 0;
                    SlideLockView.this.iX1O1.OXO1();
                    SlideLockView.this.requestLayout();
                    SlideLockView.this.invalidate();
                    return;
                }
                return;
            }
            if (!SlideLockView.this.X00XIX1) {
                SlideLockView.this.iX1O1.setEnable(false);
            }
            if (SlideLockView.this.IXOIIIO != null) {
                InterfaceC19067iO interfaceC19067iO = SlideLockView.this.IXOIIIO;
                Intrinsics.XXI(interfaceC19067iO);
                interfaceC19067iO.OXO1();
            }
        }

        @Override // com.sma.smartv3.view.SlideLockView.XIi00iiXO
        public void XIi00iiXO(int i) {
            SlideLockView.this.XXX11i = i;
            SlideLockView.this.requestLayout();
            SlideLockView.this.invalidate();
        }
    }

    public final class SlideIcon extends View {

        /* JADX INFO: renamed from: I1 */
        @aa1
        public Paint f55042I1;

        /* JADX INFO: renamed from: IO */
        public boolean f55043IO;
        public float X0i1O;

        @tb1
        public XIi00iiXO X11iII1O1;
        public float X1IX;
        public float XXX11i;
        public final /* synthetic */ SlideLockView iIXi1iiXI;

        @aa1
        public Paint.FontMetrics iX1O1;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public SlideIcon(@aa1 SlideLockView slideLockView, Context context) {
            this(slideLockView, context, null, 0, 6, null);
            Intrinsics.X0O(context, "context");
        }

        public final void OXO1() {
            this.XXX11i = 0.0f;
            this.X0i1O = 0.0f;
            this.X1IX = 0.0f;
            this.f55043IO = true;
        }

        public final boolean getEnable() {
            return this.f55043IO;
        }

        @Override // android.view.View
        public void onDraw(@aa1 Canvas canvas) {
            Intrinsics.X0O(canvas, "canvas");
            super.onDraw(canvas);
            float measuredHeight = getMeasuredHeight();
            Paint.FontMetrics fontMetrics = this.iX1O1;
            canvas.drawText(String.valueOf(this.iIXi1iiXI.XX1Oi), getMeasuredWidth() / 2.0f, ((measuredHeight - fontMetrics.top) - fontMetrics.bottom) / 2, this.f55042I1);
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE) {
                if (this.iIXi1iiXI.XOX0O0 == 0.0f) {
                    SlideLockView slideLockView = this.iIXi1iiXI;
                    slideLockView.XOX0O0 = slideLockView.O001I / size;
                }
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (size * this.iIXi1iiXI.XOX0O0), mode), View.MeasureSpec.makeMeasureSpec(this.iIXi1iiXI.O001I, mode2));
                return;
            }
            if (this.iIXi1iiXI.XOX0O0 == 0.0f) {
                this.iIXi1iiXI.XOX0O0 = size2 / size;
            }
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (size * this.iIXi1iiXI.XOX0O0), mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }

        @Override // android.view.View
        public boolean onTouchEvent(@aa1 MotionEvent event) {
            Intrinsics.X0O(event, "event");
            if (this.f55043IO) {
                int action = event.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            return false;
                        }
                        this.X0i1O = event.getRawX() - this.XXX11i;
                        XIi00iiXO xIi00iiXO = this.X11iII1O1;
                        if (xIi00iiXO != null) {
                            Intrinsics.XXI(xIi00iiXO);
                            xIi00iiXO.XIi00iiXO((int) this.X0i1O);
                        }
                        return true;
                    }
                    this.XXX11i = 0.0f;
                    this.X1IX += this.X0i1O;
                    this.X0i1O = 0.0f;
                    XIi00iiXO xIi00iiXO2 = this.X11iII1O1;
                    if (xIi00iiXO2 != null) {
                        Intrinsics.XXI(xIi00iiXO2);
                        xIi00iiXO2.OXO1((int) this.X1IX);
                    }
                    return true;
                }
                this.XXX11i = event.getRawX();
            }
            return true;
        }

        public final void setEnable(boolean z) {
            this.f55043IO = z;
        }

        public final void setListener(@tb1 XIi00iiXO xIi00iiXO) {
            this.X11iII1O1 = xIi00iiXO;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public SlideIcon(@aa1 SlideLockView slideLockView, @tb1 Context context, AttributeSet attributeSet) {
            this(slideLockView, context, attributeSet, 0, 4, null);
            Intrinsics.X0O(context, "context");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public SlideIcon(@aa1 SlideLockView slideLockView, @tb1 Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Intrinsics.X0O(context, "context");
            this.iIXi1iiXI = slideLockView;
            Paint paint = new Paint();
            this.f55042I1 = paint;
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            Intrinsics.O10IXXX0X(fontMetrics, "getFontMetrics(...)");
            this.iX1O1 = fontMetrics;
            this.f55042I1.setTextAlign(Paint.Align.CENTER);
            this.f55042I1.setColor(slideLockView.OX110i);
            this.f55042I1.setTextSize(slideLockView.f55040OO);
            this.f55043IO = true;
        }

        public /* synthetic */ SlideIcon(SlideLockView slideLockView, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(slideLockView, context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public interface XIi00iiXO {
        void OXO1(int i);

        void XIi00iiXO(int i);
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.SlideLockView$iO */
    public interface InterfaceC19067iO {
        void OXO1();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideLockView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final void I1XOi1(@tb1 InterfaceC19067iO interfaceC19067iO) {
        this.IXOIIIO = interfaceC19067iO;
    }

    public final float IIX1OXO(int i) {
        return SizeUtils.dp2px(i);
    }

    public final void OII(boolean z) {
        this.iOiXi11II = z;
    }

    public final boolean OiIIX101O() {
        return this.iOiXi11II;
    }

    public final boolean XX0() {
        return this.X00XIX1;
    }

    public final void XiOIO(boolean z) {
        this.X00XIX1 = z;
    }

    public final void XiOIii1() {
        this.X11iII1O1 = 0;
        this.XXX11i = 0;
        this.iX1O1.OXO1();
        requestLayout();
        invalidate();
    }

    public final void iIiiO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C15429R.styleable.SlideLockView, 0, 0);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iOiXi11II = typedArrayObtainStyledAttributes.getBoolean(16, true);
        this.X00XIX1 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        this.XXO = typedArrayObtainStyledAttributes.getResourceId(1, R.drawable.shape_slide_lock_bg);
        this.X100O = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.icon_screen_lock);
        this.O001I = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 240);
        this.XX1Oi = typedArrayObtainStyledAttributes.getString(12);
        this.OX110i = typedArrayObtainStyledAttributes.getColor(13, -1);
        this.f55040OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 44);
        this.XOX0O0 = typedArrayObtainStyledAttributes.getFloat(11, 0.0f);
        this.iXiiiO = typedArrayObtainStyledAttributes.getString(2);
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getString(4);
        this.iiiO = typedArrayObtainStyledAttributes.getColor(3, ViewCompat.MEASURED_STATE_MASK);
        this.X11I = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 44);
        this.i0X000X0O = typedArrayObtainStyledAttributes.getColor(17, 0);
        this.i11I = typedArrayObtainStyledAttributes.getColor(7, -1);
        this.XO0X10iO = typedArrayObtainStyledAttributes.getColor(8, -1);
        this.Ii0X0X = typedArrayObtainStyledAttributes.getColor(9, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        int i = this.X11iII1O1 + this.XXX11i;
        this.f55041X1 = i;
        if (i > 0) {
            if (i < this.iX1O1.getMeasuredWidth() / 2) {
                this.X00Xi1X.set(this.f55039IO, this.f55038I1, this.iX1O1.getMeasuredWidth(), getMeasuredHeight() - this.f55038I1);
            } else if (this.f55041X1 < getMeasuredWidth() - this.iX1O1.getMeasuredWidth()) {
                RectF rectF = this.X00Xi1X;
                int i2 = this.f55039IO;
                rectF.set(i2, this.f55038I1, this.f55041X1 + i2 + this.iX1O1.getMeasuredWidth(), getMeasuredHeight() - this.f55038I1);
            } else {
                this.X00Xi1X.set(this.f55039IO, this.f55038I1, getMeasuredWidth(), getMeasuredHeight() - this.f55038I1);
            }
            canvas.drawRoundRect(this.X00Xi1X, getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.iXiX011);
        }
        if (this.X11iII1O1 + this.XXX11i + this.iX1O1.getMeasuredWidth() >= getMeasuredWidth()) {
            this.IO0II0i.setText(this.Ii1iii0);
        } else {
            this.IO0II0i.setText(this.iXiiiO);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.X11iII1O1;
        int i6 = this.XXX11i;
        if (i5 + i6 <= 0) {
            SlideIcon slideIcon = this.iX1O1;
            int i7 = this.f55039IO;
            slideIcon.layout(i7, this.f55038I1, slideIcon.getMeasuredWidth() + i7, this.iX1O1.getMeasuredHeight() - this.f55038I1);
        } else if (i5 + i6 + this.iX1O1.getMeasuredWidth() >= getMeasuredWidth()) {
            this.iX1O1.layout((getMeasuredWidth() - this.iX1O1.getMeasuredWidth()) - this.f55039IO, this.f55038I1, getMeasuredWidth() - this.f55039IO, this.iX1O1.getMeasuredHeight() - this.f55038I1);
        } else {
            SlideIcon slideIcon2 = this.iX1O1;
            int i8 = this.X11iII1O1;
            int i9 = this.XXX11i;
            slideIcon2.layout(i8 + i9 + this.f55039IO, this.f55038I1, i8 + i9 + slideIcon2.getMeasuredWidth() + this.f55039IO, this.iX1O1.getMeasuredHeight() - this.f55038I1);
        }
        this.IO0II0i.layout((getMeasuredWidth() / 2) - (this.IO0II0i.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) - (this.IO0II0i.getMeasuredHeight() / 2), (getMeasuredWidth() / 2) + (this.IO0II0i.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) + (this.IO0II0i.getMeasuredHeight() / 2));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        View childAt = getChildAt(0);
        Intrinsics.X1ii(childAt, "null cannot be cast to non-null type com.sma.smartv3.view.SlideLockView.CustomizeTextView");
        this.IO0II0i = (CustomizeTextView) childAt;
        View childAt2 = getChildAt(1);
        Intrinsics.X1ii(childAt2, "null cannot be cast to non-null type com.sma.smartv3.view.SlideLockView.SlideIcon");
        SlideIcon slideIcon = (SlideIcon) childAt2;
        this.iX1O1 = slideIcon;
        setMeasuredDimension(i, slideIcon.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.XXiIiX10.set(this.f55039IO, this.f55038I1, getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideLockView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideLockView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        int i2 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i3 = 0;
        this.iX1O1 = new SlideIcon(this, context, attributeSet2, i3, i2, defaultConstructorMarker);
        this.X0i1O = new Paint();
        this.iIXi1iiXI = new Paint();
        this.iXiX011 = new Paint();
        this.iXiiiO = "";
        this.Ii1iii0 = "";
        this.XX1Oi = "";
        this.XXiIiX10 = new RectF();
        this.X00Xi1X = new RectF();
        this.IO0II0i = new CustomizeTextView(this, context, attributeSet2, i3, i2, defaultConstructorMarker);
        iIiiO(context, attributeSet);
        this.iXiX011.setColor(this.i0X000X0O);
        setBackgroundResource(this.XXO);
        setWillNotDraw(false);
        this.IO0II0i.setText(this.iXiiiO);
        this.IO0II0i.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.IO0II0i.setGravity(17);
        this.IO0II0i.setTextColor(-1);
        this.IO0II0i.setTextSize(this.X11I);
        addView(this.IO0II0i);
        this.iX1O1.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.iX1O1.setBackgroundResource(this.X100O);
        this.iX1O1.setListener(new OXO1());
        addView(this.iX1O1);
    }

    public /* synthetic */ SlideLockView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
