package com.sma.smartv3.view.bubbleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.mltcode.paycertificationapi.i11iO0O0;
import com.sma.smartv3.R;

/* JADX INFO: loaded from: classes3.dex */
public class BubbleLayout extends FrameLayout {
    public static float O001I = -1.0f;
    public i11iO0O0 I1;
    public ArrowDirection IO;
    public int X0i1O;
    public float X11iII1O1;
    public float X1IX;
    public float XXX11i;
    public float iIXi1iiXI;
    public float iX1O1;
    public int iXiX011;

    public static /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[ArrowDirection.values().length];
            OXO1 = r0;
            r0[ArrowDirection.LEFT_CENTER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L14
        L26:
            OXO1[ArrowDirection.RIGHT_CENTER.ordinal()] = 2;     // Catch: NoSuchFieldError -> L15
        L32:
            OXO1[ArrowDirection.TOP_CENTER.ordinal()] = 3;     // Catch: NoSuchFieldError -> L16
        L42:
            OXO1[ArrowDirection.BOTTOM_CENTER.ordinal()] = 4;     // Catch: NoSuchFieldError -> L17
        L28:
            OXO1[ArrowDirection.TOP_RIGHT.ordinal()] = 5;     // Catch: NoSuchFieldError -> L18
        L34:
            OXO1[ArrowDirection.BOTTOM_RIGHT.ordinal()] = 6;     // Catch: NoSuchFieldError -> L19
        L36:
            OXO1[ArrowDirection.LEFT.ordinal()] = 7;     // Catch: NoSuchFieldError -> L20
        L38:
            OXO1[ArrowDirection.RIGHT.ordinal()] = 8;     // Catch: NoSuchFieldError -> L21
        L24:
            OXO1[ArrowDirection.TOP.ordinal()] = 9;     // Catch: NoSuchFieldError -> L22
        L30:
            OXO1[ArrowDirection.BOTTOM.ordinal()] = 10;     // Catch: NoSuchFieldError -> L23
            return;
        }
    }

    static {
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
        iO();
        return this;
    }

    public BubbleLayout I0iXXO(float strokeWidth) {
        XO0O10();
        this.iIXi1iiXI = strokeWidth;
        iO();
        return this;
    }

    public BubbleLayout IO(float cornersRadius) {
        this.X11iII1O1 = cornersRadius;
        requestLayout();
        return this;
    }

    public BubbleLayout IiI10X(float arrowHeight) {
        XO0O10();
        this.XXX11i = arrowHeight;
        iO();
        return this;
    }

    public BubbleLayout O00(ArrowDirection arrowDirection) {
        XO0O10();
        this.IO = arrowDirection;
        iO();
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
        if (right < left) goto L14;
        if (bottom < top) goto L15;
        float r3 = right;
        RectF r1 = new RectF(left, top, r3, bottom);
        float r0 = this.X1IX;
        switch(OXO1.OXO1[this.IO.ordinal()]) {
            case 1: goto L11;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L8;
            default: goto L12;
        };
    L8:
        r0 = (r3 - this.X1IX) - (this.iX1O1 / 2.0f);
        goto L12
    L9:
        float r11 = (right - left) / 2.0f;
        float r12 = this.iX1O1;
    L10:
        r0 = r11 - (r12 / 2.0f);
        goto L12
    L11:
        r11 = (bottom - top) / 2.0f;
        r12 = this.XXX11i;
    L12:
        this.I1 = new i11iO0O0(r1, this.iX1O1, this.X11iII1O1, this.XXX11i, r0, this.iIXi1iiXI, this.iXiX011, this.X0i1O, this.IO);
        return;
    L15:
        return;
    }

    public final void XO0O10() {
        int r0 = getPaddingLeft();
        int r1 = getPaddingRight();
        int r2 = getPaddingTop();
        int r3 = getPaddingBottom();
        switch(OXO1.OXO1[this.IO.ordinal()]) {
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L5;
            case 5: goto L6;
            case 6: goto L5;
            case 7: goto L8;
            case 8: goto L7;
            case 9: goto L6;
            case 10: goto L5;
            default: goto L9;
        };
    L5:
        r3 = (int) (r3 - this.XXX11i);
        goto L9
    L6:
        r2 = (int) (r2 - this.XXX11i);
        goto L9
    L7:
        r1 = (int) (r1 - this.iX1O1);
        goto L9
    L8:
        r0 = (int) (r0 - this.iX1O1);
    L9:
        float r4 = this.iIXi1iiXI;
        if (r4 <= 0.0f) goto L12;
        r0 = (int) (r0 - r4);
        r1 = (int) (r1 - r4);
        r2 = (int) (r2 - r4);
        r3 = (int) (r3 - r4);
    L12:
        setPadding(r0, r2, r1, r3);
    }

    public BubbleLayout XOO0ii0(float arrowPosition) {
        XO0O10();
        this.X1IX = arrowPosition;
        iO();
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        i11iO0O0 r0 = this.I1;
        if (r0 == null) goto L5;
        r0.draw(canvas);
    L5:
        super.dispatchDraw(canvas);
    }

    public ArrowDirection getArrowDirection() {
        return this.IO;
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

    public final void iO() {
        int r0 = getPaddingLeft();
        int r1 = getPaddingRight();
        int r2 = getPaddingTop();
        int r3 = getPaddingBottom();
        switch(OXO1.OXO1[this.IO.ordinal()]) {
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L5;
            case 5: goto L6;
            case 6: goto L5;
            case 7: goto L8;
            case 8: goto L7;
            case 9: goto L6;
            case 10: goto L5;
            default: goto L9;
        };
    L5:
        r3 = (int) (r3 + this.XXX11i);
        goto L9
    L6:
        r2 = (int) (r2 + this.XXX11i);
        goto L9
    L7:
        r1 = (int) (r1 + this.iX1O1);
        goto L9
    L8:
        r0 = (int) (r0 + this.iX1O1);
    L9:
        float r4 = this.iIXi1iiXI;
        if (r4 <= 0.0f) goto L12;
        r0 = (int) (r0 + r4);
        r1 = (int) (r1 + r4);
        r2 = (int) (r2 + r4);
        r3 = (int) (r3 + r4);
    L12:
        setPadding(r0, r2, r1, r3);
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
        TypedArray r4 = getContext().obtainStyledAttributes(attrs, R.styleable.BubbleLayout);
        this.iX1O1 = r4.getDimension(3, OXO1(8.0f, context));
        this.XXX11i = r4.getDimension(1, OXO1(8.0f, context));
        this.X11iII1O1 = r4.getDimension(5, 0.0f);
        this.X1IX = r4.getDimension(2, OXO1(12.0f, context));
        this.X0i1O = r4.getColor(4, -1);
        this.iIXi1iiXI = r4.getDimension(7, O001I);
        this.iXiX011 = r4.getColor(6, -7829368);
        this.IO = ArrowDirection.fromInt(r4.getInt(0, ArrowDirection.LEFT.getValue()));
        r4.recycle();
        iO();
    }
}
