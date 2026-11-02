package com.sma.smartv3.otherdevice.p609jl.view;

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
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public class RotatingView extends View {

    /* JADX INFO: renamed from: I1 */
    public int f51355I1;

    /* JADX INFO: renamed from: IO */
    public int f51356IO;
    public boolean IO0II0i;
    public float IXOIIIO;
    public int Ii0X0X;
    public boolean Ii0i;
    public Bitmap Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    public int f51357OO;
    public OXO1 OX110i;
    public float X00XIX1;
    public SweepGradient X00Xi1X;
    public Paint X0i1O;

    /* JADX INFO: renamed from: X1 */
    public int f51358X1;
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
        int width = bm.getWidth();
        int height = bm.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(newWidth / width, newHeight / height);
        return Bitmap.createBitmap(bm, 0, 0, width, height, matrix, true);
    }

    private int getMaxRotateAngle() {
        return 360 - ((this.f51358X1 - 90) * 2);
    }

    public final void I0IIOi(Canvas canvas) {
        String str = this.O001I + "";
        Rect rect = new Rect();
        this.X11iII1O1.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(this.O001I + "", getWidth() / 2, (getHeight() / 2) + (rect.height() / 2), this.X11iII1O1);
    }

    public final int I0iXXO(float sp) {
        return (int) TypedValue.applyDimension(2, sp, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: IO */
    public final int m38286IO(int widthMeasureSpec) {
        View.MeasureSpec.getMode(widthMeasureSpec);
        return View.MeasureSpec.getSize(widthMeasureSpec);
    }

    public final void IiI10X(Canvas canvas) {
        canvas.save();
        canvas.rotate((this.X00XIX1 + this.f51358X1) - 180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        Bitmap bitmap = this.Ii1iii0;
        float width = ((this.f51356IO / 2.0f) - this.iX1O1) - (bitmap.getWidth() / 2.0f);
        float height = (getHeight() / 2.0f) - (bitmap.getHeight() / 2.0f);
        canvas.setDrawFilter(this.X100O);
        canvas.drawBitmap(bitmap, width, height, this.X1IX);
        canvas.restore();
    }

    public final void O00(Canvas canvas) {
        int strokeWidth = (int) (((double) this.X0i1O.getStrokeWidth()) * 1.2d);
        Bitmap bitmap = this.iXiiiO;
        int i = this.iX1O1;
        Bitmap bitmapXXI = XXI(bitmap, (i * 2) - strokeWidth, (i * 2) - strokeWidth);
        int width = bitmapXXI.getWidth();
        int height = bitmapXXI.getHeight();
        Matrix matrix = new Matrix();
        matrix.setTranslate((this.f51356IO - width) / 2.0f, (this.f51355I1 - height) / 2.0f);
        canvas.setDrawFilter(this.X100O);
        canvas.drawBitmap(bitmapXXI, matrix, this.X1IX);
    }

    public void OIX0iXi(int min, int max, int value) {
        if (min == this.iIXi1iiXI && this.iXiX011 == max && this.O001I == value) {
            return;
        }
        this.iIXi1iiXI = min;
        this.iXiX011 = max;
        int iMax = Math.max(min, value);
        this.O001I = iMax;
        float maxRotateAngle = getMaxRotateAngle() / (max - min);
        int i = this.XXO;
        float f = maxRotateAngle / i;
        this.IXOIIIO = f;
        this.X00XIX1 = (iMax - min) * i * f;
        invalidate();
    }

    public final void OIi0(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C15429R.styleable.RotatingView);
        if (typedArrayObtainStyledAttributes != null) {
            this.f51357OO = typedArrayObtainStyledAttributes.getColor(3, this.f51357OO);
            this.XOX0O0 = typedArrayObtainStyledAttributes.getColor(1, this.XOX0O0);
            this.iOiXi11II = typedArrayObtainStyledAttributes.getColor(4, this.iOiXi11II);
            this.i11I = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.i11I);
            this.XO0X10iO = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.XO0X10iO);
            this.Ii0X0X = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, this.Ii0X0X);
            this.XXiIiX10 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, this.XXiIiX10);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            if (resourceId != -1) {
                this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), resourceId);
            }
        }
        Paint paint = new Paint();
        this.X11iII1O1 = paint;
        paint.setAntiAlias(true);
        this.X11iII1O1.setTextSize(this.XXiIiX10);
        this.X11iII1O1.setColor(this.iOiXi11II);
        this.X11iII1O1.setTextAlign(Paint.Align.CENTER);
        Paint paint2 = new Paint();
        this.XXX11i = paint2;
        paint2.setAntiAlias(true);
        this.XXX11i.setColor(Color.parseColor("#3CB7EA"));
        this.XXX11i.setStrokeWidth(this.XO0X10iO);
        Paint paint3 = this.XXX11i;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = this.XXX11i;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        this.XXX11i.setColor(-1973791);
        this.X1IX = new Paint();
        this.X100O = new PaintFlagsDrawFilter(0, 3);
        Paint paint5 = new Paint();
        this.X0i1O = paint5;
        paint5.setAntiAlias(true);
        this.X0i1O.setStrokeWidth(this.i11I);
        this.X0i1O.setStyle(style);
        this.X0i1O.setStrokeCap(cap);
        int i = this.f51357OO;
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{i, i, this.XOX0O0, i}, new float[]{0.0f, 0.05f, 0.8f, 0.99f});
        this.X00Xi1X = sweepGradient;
        this.X0i1O.setShader(sweepGradient);
    }

    public final void OXO1(float angle) {
        float f = this.X00XIX1 + angle;
        this.X00XIX1 = f;
        if (f < 0.0f) {
            this.X00XIX1 = 0.0f;
        } else {
            int i = this.f51358X1;
            if (f > 360 - ((i - 90) * 2)) {
                this.X00XIX1 = 360 - ((i - 90) * 2);
            }
        }
        this.O001I = ((int) (((double) ((this.X00XIX1 / this.IXOIIIO) / this.XXO)) + 0.5d)) + this.iIXi1iiXI;
    }

    public final float XIi00iiXO(float targetX, float targetY) {
        double dAtan;
        float f = targetX - (this.f51356IO / 2.0f);
        float f2 = targetY - (this.f51355I1 / 2.0f);
        if (f != 0.0f) {
            float fAbs = Math.abs(f2 / f);
            if (f > 0.0f) {
                dAtan = f2 >= 0.0f ? Math.atan(fAbs) : 6.283185307179586d - Math.atan(fAbs);
            } else {
                dAtan = f2 >= 0.0f ? 3.141592653589793d - Math.atan(fAbs) : Math.atan(fAbs) + 3.141592653589793d;
            }
        } else {
            dAtan = f2 > 0.0f ? 1.5707963267948966d : -1.5707963267948966d;
        }
        return (float) ((dAtan * 180.0d) / 3.141592653589793d);
    }

    public final void XO0O10(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.rotate(this.f51358X1);
        int i = this.iX1O1;
        RectF rectF = new RectF(-i, -i, i, i);
        canvas.drawArc(rectF, 0.0f, getMaxRotateAngle(), false, this.XXX11i);
        canvas.drawArc(rectF, 0.0f, this.X00XIX1, false, this.X0i1O);
        canvas.restore();
    }

    public final void XOO0ii0(Canvas canvas) {
        float fSin = (float) (((double) this.iX1O1) * Math.sin(Math.toRadians(this.f51358X1 - 90)));
        float width = ((getWidth() / 2.0f) - fSin) - (this.iiiO.getWidth() / 2.0f);
        float height = getHeight() - this.X11I.getWidth();
        canvas.drawBitmap(this.iiiO, width, height, (Paint) null);
        canvas.drawBitmap(this.X11I, ((getWidth() / 2.0f) + fSin) - (this.iiiO.getWidth() / 2.0f), height, (Paint) null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(event);
    }

    public int getValue() {
        return this.O001I;
    }

    /* JADX INFO: renamed from: iO */
    public int m38287iO(float dp) {
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
        setMeasuredDimension(m38286IO(widthMeasureSpec), m38286IO(heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int iMin = Math.min(h, w);
        this.f51355I1 = iMin;
        this.f51356IO = iMin;
        this.iX1O1 = (iMin / 2) - (this.Ii0X0X * 2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        OXO1 oxo1;
        int i;
        XIi00iiXO xIi00iiXO;
        int i2;
        if (!isClickable()) {
            return true;
        }
        int i3 = this.O001I;
        int action = event.getAction();
        if (action == 0) {
            this.IO0II0i = true;
            this.i0X000X0O = XIi00iiXO(event.getX(), event.getY());
            setPressed(true);
        } else if (action == 1) {
            setPressed(false);
            if (this.IO0II0i) {
                if (this.Ii0i) {
                    i = this.O001I;
                    this.X00XIX1 = (i - this.iIXi1iiXI) * this.XXO * this.IXOIIIO;
                    xIi00iiXO = this.XX1Oi;
                    if (xIi00iiXO != null) {
                        xIi00iiXO.OXO1(this, i, true);
                    }
                    invalidate();
                    this.Ii0i = false;
                } else {
                    oxo1 = this.OX110i;
                    if (oxo1 != null) {
                        oxo1.OXO1(this.O001I);
                    }
                }
                this.IO0II0i = false;
            }
        } else if (action == 2) {
            this.Ii0i = true;
            float fXIi00iiXO = XIi00iiXO(event.getX(), event.getY());
            float f = fXIi00iiXO - this.i0X000X0O;
            if (f < (-getMaxRotateAngle())) {
                f += 360.0f;
            } else if (f > getMaxRotateAngle()) {
                f -= 360.0f;
            }
            OXO1(f);
            this.i0X000X0O = fXIi00iiXO;
            XIi00iiXO xIi00iiXO2 = this.XX1Oi;
            if (xIi00iiXO2 != null && this.IO0II0i && (i2 = this.O001I) != i3) {
                xIi00iiXO2.OXO1(this, i2, false);
            }
            invalidate();
        } else if (action == 3) {
            setPressed(false);
            if (this.IO0II0i) {
                if (this.Ii0i) {
                    i = this.O001I;
                    this.X00XIX1 = (i - this.iIXi1iiXI) * this.XXO * this.IXOIIIO;
                    xIi00iiXO = this.XX1Oi;
                    if (xIi00iiXO != null) {
                        xIi00iiXO.OXO1(this, i, true);
                    }
                    invalidate();
                    this.Ii0i = false;
                } else {
                    oxo1 = this.OX110i;
                    if (oxo1 != null) {
                        oxo1.OXO1(this.O001I);
                    }
                }
                this.IO0II0i = false;
            }
        }
        return true;
    }

    public void setContentEndColor(int colorResId) {
        int color = getResources().getColor(colorResId, null);
        this.XOX0O0 = color;
        int i = this.f51357OO;
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{i, i, color, i}, new float[]{0.0f, 0.05f, 0.8f, 0.99f});
        this.X00Xi1X = sweepGradient;
        this.X0i1O.setShader(sweepGradient);
    }

    public void setContentStartColor(int colorResId) {
        int color = getResources().getColor(colorResId, null);
        this.f51357OO = color;
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{color, color, this.XOX0O0, color}, new float[]{0.0f, 0.05f, 0.8f, 0.99f});
        this.X00Xi1X = sweepGradient;
        this.X0i1O.setShader(sweepGradient);
    }

    public void setContentTextColor(int colorResId) {
        int color = getResources().getColor(colorResId, null);
        this.iOiXi11II = color;
        this.X11iII1O1.setColor(color);
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
        this.iXiiiO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rotatview_thumb);
        this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rotatview_indicator_sup);
        this.iiiO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rotatview_reduce);
        this.X11I = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rotatview_plus);
        this.f51357OO = -8365077;
        this.XOX0O0 = 2136883691;
        this.iOiXi11II = -11053225;
        this.i11I = m38287iO(5.0f);
        this.XO0X10iO = m38287iO(3.0f);
        this.Ii0X0X = m38287iO(3.0f);
        this.XXiIiX10 = I0iXXO(16.0f);
        this.f51358X1 = 130;
        this.IXOIIIO = ((getMaxRotateAngle() * 1.0f) / (this.iXiX011 - this.iIXi1iiXI)) / this.XXO;
        OIi0(attrs);
    }
}
