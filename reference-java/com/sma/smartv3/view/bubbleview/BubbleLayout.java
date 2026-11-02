package com.sma.smartv3.view.bubbleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.mltcode.paycertificationapi.i11iO0O0;
import com.sma.smartv3.C15429R;

/* JADX INFO: loaded from: classes3.dex */
public class BubbleLayout extends FrameLayout {
    public static float O001I = -1.0f;

    /* JADX INFO: renamed from: I1 */
    public i11iO0O0 f55067I1;

    /* JADX INFO: renamed from: IO */
    public ArrowDirection f55068IO;
    public int X0i1O;
    public float X11iII1O1;
    public float X1IX;
    public float XXX11i;
    public float iIXi1iiXI;
    public float iX1O1;
    public int iXiX011;

    public static /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[ArrowDirection.values().length];
            OXO1 = iArr;
            try {
                iArr[ArrowDirection.LEFT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OXO1[ArrowDirection.RIGHT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OXO1[ArrowDirection.TOP_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OXO1[ArrowDirection.BOTTOM_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OXO1[ArrowDirection.TOP_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OXO1[ArrowDirection.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OXO1[ArrowDirection.LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OXO1[ArrowDirection.RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OXO1[ArrowDirection.TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OXO1[ArrowDirection.BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public BubbleLayout(Context context) {
        this(context, null, 0);
    }

    public static float OXO1(float dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().densityDpi / 160);
    }

    public BubbleLayout I0IIOi(float arrowWidth) {
        XO0O10();
        this.iX1O1 = arrowWidth;
        m38929iO();
        return this;
    }

    public BubbleLayout I0iXXO(float strokeWidth) {
        XO0O10();
        this.iIXi1iiXI = strokeWidth;
        m38929iO();
        return this;
    }

    /* JADX INFO: renamed from: IO */
    public BubbleLayout m38928IO(float cornersRadius) {
        this.X11iII1O1 = cornersRadius;
        requestLayout();
        return this;
    }

    public BubbleLayout IiI10X(float arrowHeight) {
        XO0O10();
        this.XXX11i = arrowHeight;
        m38929iO();
        return this;
    }

    public BubbleLayout O00(ArrowDirection arrowDirection) {
        XO0O10();
        this.f55068IO = arrowDirection;
        m38929iO();
        return this;
    }

    public BubbleLayout OIX0iXi(int strokeColor) {
        this.iXiX011 = strokeColor;
        requestLayout();
        return this;
    }

    public BubbleLayout OIi0(int bubbleColor) {
        this.X0i1O = bubbleColor;
        requestLayout();
        return this;
    }

    public final void XIi00iiXO(int left, int right, int top, int bottom) {
        float f;
        float f2;
        if (right < left || bottom < top) {
            return;
        }
        float f3 = right;
        RectF rectF = new RectF(left, top, f3, bottom);
        float f4 = this.X1IX;
        switch (OXO1.OXO1[this.f55068IO.ordinal()]) {
            case 1:
            case 2:
                f = (bottom - top) / 2.0f;
                f2 = this.XXX11i;
                f4 = f - (f2 / 2.0f);
                break;
            case 3:
            case 4:
                f = (right - left) / 2.0f;
                f2 = this.iX1O1;
                f4 = f - (f2 / 2.0f);
                break;
            case 5:
            case 6:
                f4 = (f3 - this.X1IX) - (this.iX1O1 / 2.0f);
                break;
        }
        this.f55067I1 = new i11iO0O0(rectF, this.iX1O1, this.X11iII1O1, this.XXX11i, f4, this.iIXi1iiXI, this.iXiX011, this.X0i1O, this.f55068IO);
    }

    public final void XO0O10() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        switch (OXO1.OXO1[this.f55068IO.ordinal()]) {
            case 1:
            case 7:
                paddingLeft = (int) (paddingLeft - this.iX1O1);
                break;
            case 2:
            case 8:
                paddingRight = (int) (paddingRight - this.iX1O1);
                break;
            case 3:
            case 5:
            case 9:
                paddingTop = (int) (paddingTop - this.XXX11i);
                break;
            case 4:
            case 6:
            case 10:
                paddingBottom = (int) (paddingBottom - this.XXX11i);
                break;
        }
        float f = this.iIXi1iiXI;
        if (f > 0.0f) {
            paddingLeft = (int) (paddingLeft - f);
            paddingRight = (int) (paddingRight - f);
            paddingTop = (int) (paddingTop - f);
            paddingBottom = (int) (paddingBottom - f);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public BubbleLayout XOO0ii0(float arrowPosition) {
        XO0O10();
        this.X1IX = arrowPosition;
        m38929iO();
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        i11iO0O0 i11io0o0 = this.f55067I1;
        if (i11io0o0 != null) {
            i11io0o0.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public ArrowDirection getArrowDirection() {
        return this.f55068IO;
    }

    public float getArrowHeight() {
        return this.XXX11i;
    }

    public float getArrowPosition() {
        return this.X1IX;
    }

    public float getArrowWidth() {
        return this.iX1O1;
    }

    public int getBubbleColor() {
        return this.X0i1O;
    }

    public float getCornersRadius() {
        return this.X11iII1O1;
    }

    public int getStrokeColor() {
        return this.iXiX011;
    }

    public float getStrokeWidth() {
        return this.iIXi1iiXI;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38929iO() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        switch (OXO1.OXO1[this.f55068IO.ordinal()]) {
            case 1:
            case 7:
                paddingLeft = (int) (paddingLeft + this.iX1O1);
                break;
            case 2:
            case 8:
                paddingRight = (int) (paddingRight + this.iX1O1);
                break;
            case 3:
            case 5:
            case 9:
                paddingTop = (int) (paddingTop + this.XXX11i);
                break;
            case 4:
            case 6:
            case 10:
                paddingBottom = (int) (paddingBottom + this.XXX11i);
                break;
        }
        float f = this.iIXi1iiXI;
        if (f > 0.0f) {
            paddingLeft = (int) (paddingLeft + f);
            paddingRight = (int) (paddingRight + f);
            paddingTop = (int) (paddingTop + f);
            paddingBottom = (int) (paddingBottom + f);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        XIi00iiXO(0, getWidth(), 0, getHeight());
    }

    public BubbleLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BubbleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C15429R.styleable.BubbleLayout);
        this.iX1O1 = typedArrayObtainStyledAttributes.getDimension(3, OXO1(8.0f, context));
        this.XXX11i = typedArrayObtainStyledAttributes.getDimension(1, OXO1(8.0f, context));
        this.X11iII1O1 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.X1IX = typedArrayObtainStyledAttributes.getDimension(2, OXO1(12.0f, context));
        this.X0i1O = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.iIXi1iiXI = typedArrayObtainStyledAttributes.getDimension(7, O001I);
        this.iXiX011 = typedArrayObtainStyledAttributes.getColor(6, -7829368);
        this.f55068IO = ArrowDirection.fromInt(typedArrayObtainStyledAttributes.getInt(0, ArrowDirection.LEFT.getValue()));
        typedArrayObtainStyledAttributes.recycle();
        m38929iO();
    }
}
