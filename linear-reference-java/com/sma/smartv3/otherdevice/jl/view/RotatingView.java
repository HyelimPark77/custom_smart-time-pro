package com.sma.smartv3.otherdevice.jl.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.sma.smartv3.R;

/* JADX INFO: loaded from: classes19.dex */
public class RotatingView extends View {
    public int I1;
    public int IO;
    public boolean IO0II0i;
    public float IXOIIIO;
    public int Ii0X0X;
    public boolean Ii0i;
    public Bitmap Ii1iii0;
    public int O001I;
    public int OO;
    public OXO1 OX110i;
    public float X00XIX1;
    public SweepGradient X00Xi1X;
    public Paint X0i1O;
    public int X1;
    public PaintFlagsDrawFilter X100O;
    public Bitmap X11I;
    public Paint X11iII1O1;
    public Paint X1IX;
    public int XO0X10iO;
    public int XOX0O0;
    public XIi00iiXO XX1Oi;
    public int XXO;
    public Paint XXX11i;
    public int XXiIiX10;
    public float i0X000X0O;
    public int i11I;
    public int iIXi1iiXI;
    public int iOiXi11II;
    public int iX1O1;
    public int iXiX011;
    public Bitmap iXiiiO;
    public Bitmap iiiO;

    public interface OXO1 {
        void OXO1(int temp);
    }

    public interface XIi00iiXO {
        void OXO1(RotatingView view, int value, boolean end);
    }

    public RotatingView(Context context) {
        this(context, null);
    }

    public static Bitmap XXI(Bitmap bm, int newWidth, int newHeight) {
        int r3 = bm.getWidth();
        int r4 = bm.getHeight();
        Matrix r5 = new Matrix();
        r5.postScale(newWidth / r3, newHeight / r4);
        return Bitmap.createBitmap(bm, 0, 0, r3, r4, r5, true);
    }

    private int getMaxRotateAngle() {
        return 360 - ((this.X1 - 90) * 2);
    }

    public final void I0IIOi(Canvas canvas) {
        String r0 = this.O001I + "";
        Rect r2 = new Rect();
        this.X11iII1O1.getTextBounds(r0, 0, r0.length(), r2);
        canvas.drawText(this.O001I + "", getWidth() / 2, (getHeight() / 2) + (r2.height() / 2), this.X11iII1O1);
    }

    public final int I0iXXO(float sp) {
        return (int) TypedValue.applyDimension(2, sp, getResources().getDisplayMetrics());
    }

    public final int IO(int widthMeasureSpec) {
        View.MeasureSpec.getMode(widthMeasureSpec);
        return View.MeasureSpec.getSize(widthMeasureSpec);
    }

    public final void IiI10X(Canvas canvas) {
        canvas.save();
        canvas.rotate((this.X00XIX1 + this.X1) - 180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        Bitmap r0 = this.Ii1iii0;
        float r1 = ((this.IO / 2.0f) - this.iX1O1) - (r0.getWidth() / 2.0f);
        float r3 = (getHeight() / 2.0f) - (r0.getHeight() / 2.0f);
        canvas.setDrawFilter(this.X100O);
        canvas.drawBitmap(r0, r1, r3, this.X1IX);
        canvas.restore();
    }

    public final void O00(Canvas canvas) {
        int r0 = (int) (((double) this.X0i1O.getStrokeWidth()) * 1.2d);
        Bitmap r1 = this.iXiiiO;
        int r2 = this.iX1O1;
        Bitmap r3 = XXI(r1, (r2 * 2) - r0, (r2 * 2) - r0);
        int r4 = r3.getWidth();
        int r5 = r3.getHeight();
        Matrix r6 = new Matrix();
        r6.setTranslate((this.IO - r4) / 2.0f, (this.I1 - r5) / 2.0f);
        canvas.setDrawFilter(this.X100O);
        canvas.drawBitmap(r3, r6, this.X1IX);
    }

    public void OIX0iXi(int min, int max, int value) {
        if (min == this.iIXi1iiXI) goto L5;
    L9:
        this.iIXi1iiXI = min;
        this.iXiX011 = max;
        int r5 = Math.max(min, value);
        this.O001I = r5;
        float r0 = getMaxRotateAngle() / (max - min);
        int r4 = this.XXO;
        float r1 = r0 / r4;
        this.IXOIIIO = r1;
        this.X00XIX1 = ((r5 - min) * r4) * r1;
        invalidate();
        return;
    L5:
        if (this.iXiX011 != max) goto L9;
        if (this.O001I != value) goto L9;
    }

    public final void OIi0(AttributeSet attrs) {
        TypedArray r8 = getContext().obtainStyledAttributes(attrs, R.styleable.RotatingView);
        if (r8 == null) goto L7;
        this.OO = r8.getColor(3, this.OO);
        this.XOX0O0 = r8.getColor(1, this.XOX0O0);
        this.iOiXi11II = r8.getColor(4, this.iOiXi11II);
        this.i11I = r8.getDimensionPixelSize(2, this.i11I);
        this.XO0X10iO = r8.getDimensionPixelSize(0, this.XO0X10iO);
        this.Ii0X0X = r8.getDimensionPixelSize(6, this.Ii0X0X);
        this.XXiIiX10 = r8.getDimensionPixelSize(7, this.XXiIiX10);
        int r9 = r8.getResourceId(5, -1);
        if (r9 == (-1)) goto L7;
        this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), r9);
    L7:
        Paint r10 = new Paint();
        this.X11iII1O1 = r10;
        r10.setAntiAlias(true);
        this.X11iII1O1.setTextSize(this.XXiIiX10);
        this.X11iII1O1.setColor(this.iOiXi11II);
        this.X11iII1O1.setTextAlign(Paint.Align.CENTER);
        Paint r11 = new Paint();
        this.XXX11i = r11;
        r11.setAntiAlias(true);
        this.XXX11i.setColor(Color.parseColor("#3CB7EA"));
        this.XXX11i.setStrokeWidth(this.XO0X10iO);
        Paint r12 = this.XXX11i;
        Paint.Style r4 = Paint.Style.STROKE;
        r12.setStyle(r4);
        Paint r13 = this.XXX11i;
        Paint.Cap r5 = Paint.Cap.ROUND;
        r13.setStrokeCap(r5);
        this.XXX11i.setColor(-1973791);
        this.X1IX = new Paint();
        this.X100O = new PaintFlagsDrawFilter(0, 3);
        Paint r14 = new Paint();
        this.X0i1O = r14;
        r14.setAntiAlias(true);
        this.X0i1O.setStrokeWidth(this.i11I);
        this.X0i1O.setStyle(r4);
        this.X0i1O.setStrokeCap(r5);
        int r15 = this.OO;
        SweepGradient r2 = new SweepGradient(0.0f, 0.0f, new int[]{r15, r15, this.XOX0O0, r15}, new float[]{0.0f, 0.05f, 0.8f, 0.99f});
        this.X00Xi1X = r2;
        this.X0i1O.setShader(r2);
    }

    public final void OXO1(float angle) {
        float r0 = this.X00XIX1 + angle;
        this.X00XIX1 = r0;
        if (r0 >= 0.0f) goto L5;
        this.X00XIX1 = 0.0f;
    L8:
        this.O001I = ((int) (((double) ((this.X00XIX1 / this.IXOIIIO) / this.XXO)) + 0.5d)) + this.iIXi1iiXI;
        return;
    L5:
        int r5 = this.X1;
        if (r0 <= (360 - ((r5 - 90) * 2))) goto L8;
        this.X00XIX1 = 360 - ((r5 - 90) * 2);
        goto L8
    }

    public final float XIi00iiXO(float targetX, float targetY) {
        float r5 = targetX - (this.IO / 2.0f);
        float r6 = targetY - (this.I1 / 2.0f);
        if (r5 == 0.0f) goto L15;
        float r7 = Math.abs(r6 / r5);
        if (r5 <= 0.0f) goto L11;
        if (r6 < 0.0f) goto L9;
        double r8 = Math.atan(r7);
    L19:
        return (float) ((r8 * 180.0d) / 3.141592653589793d);
    L9:
        r8 = 6.283185307179586d - Math.atan(r7);
        goto L19
    L11:
        if (r6 < 0.0f) goto L13;
        r8 = 3.141592653589793d - Math.atan(r7);
        goto L19
    L13:
        r8 = Math.atan(r7) + 3.141592653589793d;
        goto L19
    L15:
        if (r6 <= 0.0f) goto L17;
        r8 = 1.5707963267948966d;
        goto L19
    L17:
        r8 = -1.5707963267948966d;
        goto L19
    }

    public final void XO0O10(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.rotate(this.X1);
        int r0 = this.iX1O1;
        RectF r2 = new RectF(-r0, -r0, r0, r0);
        canvas.drawArc(r2, 0.0f, getMaxRotateAngle(), false, this.XXX11i);
        canvas.drawArc(r2, 0.0f, this.X00XIX1, false, this.X0i1O);
        canvas.restore();
    }

    public final void XOO0ii0(Canvas canvas) {
        float r0 = (float) (((double) this.iX1O1) * Math.sin(Math.toRadians(this.X1 - 90)));
        float r1 = ((getWidth() / 2.0f) - r0) - (this.iiiO.getWidth() / 2.0f);
        float r3 = getHeight() - this.X11I.getWidth();
        canvas.drawBitmap(this.iiiO, r1, r3, null);
        canvas.drawBitmap(this.X11I, ((getWidth() / 2.0f) + r0) - (this.iiiO.getWidth() / 2.0f), r3, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (getParent() == null) goto L6;
        getParent().requestDisallowInterceptTouchEvent(true);
    L6:
        return super.dispatchTouchEvent(event);
    }

    public int getValue() {
        return this.O001I;
    }

    public int iO(float dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        XO0O10(canvas);
        O00(canvas);
        IiI10X(canvas);
        XOO0ii0(canvas);
        I0IIOi(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(IO(widthMeasureSpec), IO(heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int r1 = Math.min(h, w);
        this.I1 = r1;
        this.IO = r1;
        this.iX1O1 = (r1 / 2) - (this.Ii0X0X * 2);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (isClickable() == true) goto L5;
        return true;
    L5:
        int r0 = this.O001I;
        int r2 = event.getAction();
        if (r2 != 0) goto L8;
        this.IO0II0i = true;
        this.i0X000X0O = XIi00iiXO(event.getX(), event.getY());
        setPressed(true);
    L41:
        return true;
    L8:
        if (r2 != 1) goto L10;
    L28:
        setPressed(false);
        if (this.IO0II0i == false) goto L41;
        if (this.Ii0i == false) goto L36;
        int r7 = this.O001I;
        this.X00XIX1 = ((r7 - this.iIXi1iiXI) * this.XXO) * this.IXOIIIO;
        XIi00iiXO r1 = this.XX1Oi;
        if (r1 == null) goto L35;
        r1.OXO1(this, r7, true);
    L35:
        invalidate();
        this.Ii0i = false;
    L39:
        this.IO0II0i = false;
        goto L41
    L36:
        OXO1 r8 = this.OX110i;
        if (r8 == null) goto L39;
        r8.OXO1(this.O001I);
        goto L39
    L10:
        if (r2 != 2) goto L12;
        this.Ii0i = true;
        float r9 = XIi00iiXO(event.getX(), event.getY());
        float r3 = r9 - this.i0X000X0O;
        if (r3 >= (-getMaxRotateAngle())) goto L18;
        r3 = r3 + 360.0f;
    L20:
        OXO1(r3);
        this.i0X000X0O = r9;
        XIi00iiXO r10 = this.XX1Oi;
        if (r10 != null) goto L23;
    L27:
        invalidate();
        goto L41
    L23:
        if (this.IO0II0i == false) goto L27;
        int r4 = this.O001I;
        if (r4 == r0) goto L27;
        r10.OXO1(this, r4, false);
        goto L27
    L18:
        if (r3 <= getMaxRotateAngle()) goto L20;
        r3 = r3 - 360.0f;
        goto L20
    L12:
        if (r2 == 3) goto L28;
        goto L28
    }

    public void setContentEndColor(int colorResId) {
        int r4 = getResources().getColor(colorResId, null);
        this.XOX0O0 = r4;
        int r0 = this.OO;
        SweepGradient r2 = new SweepGradient(0.0f, 0.0f, new int[]{r0, r0, r4, r0}, new float[]{0.0f, 0.05f, 0.8f, 0.99f});
        this.X00Xi1X = r2;
        this.X0i1O.setShader(r2);
    }

    public void setContentStartColor(int colorResId) {
        int r4 = getResources().getColor(colorResId, null);
        this.OO = r4;
        SweepGradient r2 = new SweepGradient(0.0f, 0.0f, new int[]{r4, r4, this.XOX0O0, r4}, new float[]{0.0f, 0.05f, 0.8f, 0.99f});
        this.X00Xi1X = r2;
        this.X0i1O.setShader(r2);
    }

    public void setContentTextColor(int colorResId) {
        int r3 = getResources().getColor(colorResId, null);
        this.iOiXi11II = r3;
        this.X11iII1O1.setColor(r3);
    }

    public void setIndicatorImage(int imageResId) {
        this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), imageResId);
    }

    public void setOnClickListener(OXO1 onClickListener) {
        this.OX110i = onClickListener;
    }

    public void setOnValueChangeListener(XIi00iiXO onValueChangeListener) {
        this.XX1Oi = onValueChangeListener;
    }

    public void setValue(int value) {
        OIX0iXi(this.iIXi1iiXI, this.iXiX011, value);
    }

    public RotatingView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RotatingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.iIXi1iiXI = -12;
        this.iXiX011 = 12;
        this.O001I = -12;
        this.XXO = 1;
        this.iXiiiO = BitmapFactory.decodeResource(getResources(), com.sma.smartv3.pro.R.drawable.ic_rotatview_thumb);
        this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), com.sma.smartv3.pro.R.drawable.ic_rotatview_indicator_sup);
        this.iiiO = BitmapFactory.decodeResource(getResources(), com.sma.smartv3.pro.R.drawable.ic_rotatview_reduce);
        this.X11I = BitmapFactory.decodeResource(getResources(), com.sma.smartv3.pro.R.drawable.ic_rotatview_plus);
        this.OO = -8365077;
        this.XOX0O0 = 2136883691;
        this.iOiXi11II = -11053225;
        this.i11I = iO(5.0f);
        this.XO0X10iO = iO(3.0f);
        this.Ii0X0X = iO(3.0f);
        this.XXiIiX10 = I0iXXO(16.0f);
        this.X1 = 130;
        this.IXOIIIO = ((getMaxRotateAngle() * 1.0f) / (this.iXiX011 - this.iIXi1iiXI)) / this.XXO;
        OIi0(attrs);
    }
}
