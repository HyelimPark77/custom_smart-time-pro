package com.sma.smartv3.ui.trim.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.android.mltcode.paycertificationapi.OOXOXI;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.pro.R;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public class RangeSeekBarView extends View {
    public static final String IXI = "RangeSeekBarView";
    public static final int IiiXiI0I = 255;
    public static final int XOIX = 65280;
    public static final int XOO0XOOii = 0;
    public static final int XOXiX0 = 8;
    public static final int iiIOiX = 0;
    public long I1;
    public int IO;
    public OXO1 IO0II0i;
    public boolean IXOIIIO;
    public boolean Ii0X0X;
    public int Ii0i;
    public Paint Ii1iii0;
    public Bitmap O001I;
    public float OO;
    public int OX110i;
    public long X00XIX1;
    public boolean X00Xi1X;
    public double X0i1O;
    public double X1;
    public final Paint X100O;
    public final Paint X11I;
    public double X11iII1O1;
    public double X1IX;
    public float XO0X10iO;
    public final float XOX0O0;
    public final Paint XX1Oi;
    public Bitmap XXO;
    public double XXX11i;
    public Thumb XXiIiX10;
    public float i0X000X0O;
    public boolean i11I;
    public double iIXi1iiXI;
    public long iOiXi11II;
    public double iX1O1;
    public int iXiX011;
    public Bitmap iXiiiO;
    public Paint iiiO;

    public interface OXO1 {
        void OXO1(RangeSeekBarView bar, long minValue, long maxValue, int action, boolean isMin, Thumb pressedThumb);
    }

    public static final enum Thumb extends Enum<Thumb> {
        private static final /* synthetic */ Thumb[] $VALUES = null;
        public static final Thumb MAX = null;
        public static final Thumb MIN = null;

        private static /* synthetic */ Thumb[] $values() {
            return new Thumb[]{MIN, MAX};
        }

        static {
            MIN = new Thumb("MIN", 0);
            MAX = new Thumb("MAX", 1);
            $VALUES = $values();
        }

        private Thumb(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public static Thumb valueOf(String name) {
            return (Thumb) Enum.valueOf(Thumb.class, name);
        }

        public static Thumb[] values() {
            return (Thumb[]) $VALUES.clone();
        }
    }

    static {
        XOO0XOOii = SizeUtils.dp2px(7.0f);
        iiIOiX = SizeUtils.dp2px(10.0f);
    }

    public RangeSeekBarView(Context context) {
        super(context);
        this.IO = 255;
        this.I1 = 1000;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0;
        this.X00XIX1 = 0;
        this.i0X000X0O = 0.0f;
        this.X1 = 1.0d;
        this.IXOIIIO = false;
        this.Ii0i = getContext().getResources().getColor(R.color.white);
    }

    private int getValueLength() {
        return getWidth() - (this.OX110i * 2);
    }

    public boolean I0IIOi() {
        return this.IXOIIIO;
    }

    public void I0iXXO() {
        this.Ii0X0X = true;
    }

    public final double I1XOi1(long value) {
        double r0 = this.X11iII1O1;
        double r2 = this.iX1O1;
        if (0.0d != (r0 - r2)) goto L6;
        return 0.0d;
    L6:
        return (value - r2) / (r0 - r2);
    }

    public final long IO(double normalized) {
        double r0 = this.iX1O1;
        return (long) (r0 + (normalized * (this.X11iII1O1 - r0)));
    }

    public final boolean IiI10X(float touchX, double normalizedThumbValue, double scale) {
        if (Math.abs(touchX - OIi0(normalizedThumbValue)) > (((double) this.OO) * scale)) goto L6;
        return true;
    L6:
        return false;
    }

    public final void O00() {
        this.iXiX011 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        Bitmap r0 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_video_thumb_handle);
        this.O001I = r0;
        int r4 = r0.getWidth();
        int r5 = this.O001I.getHeight();
        int r1 = SizeUtils.dp2px(11.0f);
        float r2 = (SizeUtils.dp2px(55.0f) * 1.0f) / r5;
        Matrix r6 = new Matrix();
        r6.postScale((r1 * 1.0f) / r4, r2);
        Bitmap r3 = Bitmap.createBitmap(this.O001I, 0, 0, r4, r5, r6, true);
        this.O001I = r3;
        this.XXO = r3;
        this.iXiiiO = r3;
        this.OX110i = r1;
        this.OO = r1 / 2;
        int r7 = getContext().getResources().getColor(R.color.shadow_color);
        this.XX1Oi.setAntiAlias(true);
        this.XX1Oi.setColor(r7);
        this.Ii1iii0 = new Paint(1);
        Paint r8 = new Paint(1);
        this.iiiO = r8;
        r8.setStyle(Paint.Style.FILL);
        this.iiiO.setColor(this.Ii0i);
        this.X11I.setStrokeWidth(3.0f);
        this.X11I.setARGB(255, 51, 51, 51);
        this.X11I.setTextSize(28.0f);
        this.X11I.setAntiAlias(true);
        this.X11I.setColor(this.Ii0i);
        this.X11I.setTextAlign(Paint.Align.LEFT);
        this.X100O.setStrokeWidth(3.0f);
        this.X100O.setARGB(255, 51, 51, 51);
        this.X100O.setTextSize(28.0f);
        this.X100O.setAntiAlias(true);
        this.X100O.setColor(this.Ii0i);
        this.X100O.setTextAlign(Paint.Align.RIGHT);
    }

    public void O10IXXX0X(long start, long end) {
        this.iOiXi11II = start / 1000;
        this.X00XIX1 = end / 1000;
    }

    public final void OIX0iXi(MotionEvent ev) {
        int r0 = (ev.getAction() & 65280) >> 8;
        if (ev.getPointerId(r0) != this.IO) goto L9;
        if (r0 != 0) goto L6;
        int r1 = 1;
    L7:
        this.XO0X10iO = ev.getX(r1);
        this.IO = ev.getPointerId(r1);
        return;
    L6:
        r1 = 0;
        goto L7
    }

    public final float OIi0(double normalizedCoord) {
        return (float) (((double) getPaddingLeft()) + (normalizedCoord * ((double) ((getWidth() - getPaddingLeft()) - getPaddingRight()))));
    }

    public final void OXO1() {
        if (getParent() == null) goto L6;
        getParent().requestDisallowInterceptTouchEvent(true);
        return;
    }

    public final void X0O(MotionEvent event) {
        if (event.getPointerCount() > 1) goto L19;
        Log.e(IXI, "trackTouchEvent: " + event.getAction() + " x: " + event.getX());
        float r5 = event.getX(event.findPointerIndex(this.IO));     // Catch: Exception -> L15
        if (Thumb.MIN.equals(this.XXiIiX10) == false) goto L12;
        setNormalizedMinValue(X1ii(r5, 0));
        return;
    L12:
        if (Thumb.MAX.equals(this.XXiIiX10) == false) goto L18;
        setNormalizedMaxValue(X1ii(r5, 1));
        return;
    L18:
        return;
    L20:
        return;
    }

    public final double X1ii(float screenCoord, int position) {
        int r6 = getWidth();
        float r7 = r6;
        if (r7 > 0.0f) goto L5;
        return 0.0d;
    L5:
        this.X00Xi1X = false;
        double r11 = screenCoord;
        float r13 = OIi0(this.XXX11i);
        float r14 = OIi0(this.X1IX);
        double r2 = this.I1;
        double r4 = this.X11iII1O1;
        double r3 = (r2 / (r4 - this.iX1O1)) * ((double) (r6 - (this.OX110i * 2)));
        if (r4 <= 300000.0d) goto L8;
        this.X1 = Double.parseDouble(new DecimalFormat("0.0000").format(r3));
    L10:
        if (position != 0) goto L35;
        if (XOO0ii0(screenCoord, this.XXX11i, 0.5d) == false) goto L16;
        return this.XXX11i;
    L16:
        if ((getWidth() - r14) < 0.0f) goto L18;
        float r1 = getWidth() - r14;
    L19:
        double r5 = ((double) getValueLength()) - (((double) r1) + this.X1);
        double r8 = r13;
        if (r11 <= r8) goto L23;
        r11 = (r11 - r8) + r8;
    L26:
        if (r11 <= r5) goto L28;
        this.X00Xi1X = true;
    L29:
        int r9 = this.OX110i;
        if (r5 >= ((r9 * 2) / 3)) goto L32;
        r5 = 0.0d;
    L32:
        double r10 = r5 - 0.0d;
        this.X0i1O = Math.min(1.0d, Math.max(0.0d, r10 / ((double) (r6 - (r9 * 2)))));
        return Math.min(1.0d, Math.max(0.0d, r10 / ((double) (r7 - 0.0f))));
    L28:
        r5 = r11;
        goto L29
    L23:
        if (r11 > r8) goto L26;
        r11 = r8 - (r8 - r11);
        goto L26
    L18:
        r1 = 0.0f;
        goto L19
    L35:
        if (IiI10X(screenCoord, this.X1IX, 0.5d) == true) goto L37;
        double r12 = ((double) getValueLength()) - (((double) r13) + this.X1);
        double r15 = r14;
        if (r11 <= r15) goto L42;
        r11 = (r11 - r15) + r15;
    L44:
        double r16 = ((double) getWidth()) - r11;
        if (r16 <= r12) goto L47;
        this.X00Xi1X = true;
        r11 = ((double) getWidth()) - r12;
        double r17 = r12;
    L49:
        if (r17 >= ((this.OX110i * 2) / 3)) goto L51;
        r11 = getWidth();
        r17 = 0.0d;
    L51:
        this.iIXi1iiXI = Math.min(1.0d, Math.max(0.0d, 1.0d - ((r17 - 0.0d) / ((double) (r6 - (this.OX110i * 2))))));
        return Math.min(1.0d, Math.max(0.0d, (r11 - 0.0d) / ((double) (r7 - 0.0f))));
    L47:
        r17 = r16;
        goto L49
    L42:
        if (r11 > r15) goto L44;
        r11 = r15 - (r15 - r11);
        goto L44
    L37:
        return this.X1IX;
    L8:
        this.X1 = Math.round(r3 + 0.5d);
        goto L10
    }

    public final void XIi00iiXO(float screenCoord, boolean pressed, Canvas canvas, boolean isLeft) {
        if (pressed == false) goto L4;
        Bitmap r3 = this.iXiiiO;
    L7:
        if (isLeft == false) goto L9;
        int r5 = 0;
    L10:
        canvas.drawBitmap(r3, screenCoord - r5, iiIOiX, this.Ii1iii0);
        return;
    L9:
        r5 = this.OX110i;
        goto L10
    L4:
        if (isLeft == false) goto L6;
        r3 = this.O001I;
        goto L7
    L6:
        r3 = this.XXO;
        goto L7
    }

    public final Thumb XO0O10(float touchX) {
        boolean r7 = IiI10X(touchX, this.XXX11i, 2.0d);
        boolean r2 = IiI10X(touchX, this.X1IX, 2.0d);
        if (r7 == false) goto L11;
        if (r2 == false) goto L11;
        if ((touchX / getWidth()) <= 0.5f) goto L10;
        return Thumb.MIN;
    L10:
        return Thumb.MAX;
    L11:
        if (r7 == true) goto L13;
        if (r2 == true) goto L16;
        return null;
    L16:
        return Thumb.MAX;
    L13:
        return Thumb.MIN;
    }

    public final boolean XOO0ii0(float touchX, double normalizedThumbValue, double scale) {
        if (Math.abs((touchX - OIi0(normalizedThumbValue)) - this.OX110i) > (((double) this.OO) * scale)) goto L6;
        return true;
    L6:
        return false;
    }

    public void XXI() {
        this.Ii0X0X = false;
    }

    public long getSelectedMaxValue() {
        return IO(this.iIXi1iiXI);
    }

    public long getSelectedMinValue() {
        return IO(this.X0i1O);
    }

    public final void iO(Canvas canvas) {
        String r0 = OOXOXI.XIi00iiXO(this.iOiXi11II);
        String r1 = OOXOXI.XIi00iiXO(this.X00XIX1);
        float r2 = OIi0(this.XXX11i);
        int r3 = XOO0XOOii;
        canvas.drawText(r0, r2, r3, this.X11I);
        canvas.drawText(r1, OIi0(this.X1IX), r3, this.X100O);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float r0 = getWidth() - getPaddingRight();
        float r4 = OIi0(this.XXX11i);
        float r6 = OIi0(this.X1IX);
        Rect r1 = new Rect((int) 0.0f, getHeight(), (int) r4, 0);
        Rect r2 = new Rect((int) r6, getHeight(), (int) r0, 0);
        canvas.drawRect(r1, this.XX1Oi);
        canvas.drawRect(r2, this.XX1Oi);
        float r3 = this.i0X000X0O;
        int r5 = iiIOiX;
        canvas.drawRect(r4, r3 + r5, r6, (r3 + SizeUtils.dp2px(2.0f)) + r5, this.iiiO);
        canvas.drawRect(r4, getHeight() - SizeUtils.dp2px(2.0f), r6, getHeight(), this.iiiO);
        XIi00iiXO(OIi0(this.XXX11i), false, canvas, true);
        XIi00iiXO(OIi0(this.X1IX), false, canvas, false);
        iO(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 0) goto L5;
        int r2 = View.MeasureSpec.getSize(widthMeasureSpec);
    L7:
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 0) goto L9;
        int r3 = View.MeasureSpec.getSize(heightMeasureSpec);
    L10:
        setMeasuredDimension(r2, r3);
        return;
    L9:
        r3 = 120;
        goto L10
    L5:
        r2 = 300;
        goto L7
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcel) {
        Bundle r3 = (Bundle) parcel;
        super.onRestoreInstanceState(r3.getParcelable("SUPER"));
        this.XXX11i = r3.getDouble("MIN");
        this.X1IX = r3.getDouble("MAX");
        this.X0i1O = r3.getDouble("MIN_TIME");
        this.iIXi1iiXI = r3.getDouble("MAX_TIME");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle r0 = new Bundle();
        r0.putParcelable("SUPER", super.onSaveInstanceState());
        r0.putDouble("MIN", this.XXX11i);
        r0.putDouble("MAX", this.X1IX);
        r0.putDouble("MIN_TIME", this.X0i1O);
        r0.putDouble("MAX_TIME", this.iIXi1iiXI);
        return r0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.i11I == false) goto L7;
        return super.onTouchEvent(event);
    L7:
        if (event.getPointerCount() <= 1) goto L11;
        return super.onTouchEvent(event);
    L11:
        if (isEnabled() == true) goto L14;
        return false;
    L14:
        if (this.X11iII1O1 <= this.I1) goto L16;
        int r2 = event.getAction() & 255;
        if (r2 == 0) goto L56;
        if (r2 == 1) goto L49;
        if (r2 == 2) goto L36;
        if (r2 == 3) goto L32;
        if (r2 != 5) goto L27;
        int r3 = event.getPointerCount() - 1;
        this.XO0X10iO = event.getX(r3);
        this.IO = event.getPointerId(r3);
        invalidate();
    L63:
        return true;
    L27:
        if (r2 != 6) goto L63;
        OIX0iXi(event);
        invalidate();
        goto L63
    L32:
        if (this.Ii0X0X == false) goto L34;
        XXI();
        setPressed(false);
    L34:
        invalidate();
        goto L63
    L36:
        if (this.XXiIiX10 == null) goto L63;
        if (this.Ii0X0X == false) goto L41;
        X0O(event);
    L44:
        if (this.IXOIIIO == false) goto L63;
        OXO1 r0 = this.IO0II0i;
        if (r0 == null) goto L63;
        r0.OXO1(this, getSelectedMinValue(), getSelectedMaxValue(), 2, this.X00Xi1X, this.XXiIiX10);
        goto L63
    L41:
        if (Math.abs(event.getX(event.findPointerIndex(this.IO)) - this.XO0X10iO) <= this.iXiX011) goto L44;
        setPressed(true);
        Log.e(IXI, "没有拖住最大最小值");
        invalidate();
        I0iXXO();
        X0O(event);
        OXO1();
        goto L44
    L49:
        if (this.Ii0X0X == false) goto L51;
        X0O(event);
        XXI();
        setPressed(false);
    L52:
        invalidate();
        OXO1 r1 = this.IO0II0i;
        if (r1 == null) goto L55;
        r1.OXO1(this, getSelectedMinValue(), getSelectedMaxValue(), 1, this.X00Xi1X, this.XXiIiX10);
    L55:
        this.XXiIiX10 = null;
        goto L63
    L51:
        I0iXXO();
        X0O(event);
        XXI();
        goto L52
    L56:
        int r4 = event.getPointerId(event.getPointerCount() - 1);
        this.IO = r4;
        float r5 = event.getX(event.findPointerIndex(r4));
        this.XO0X10iO = r5;
        Thumb r6 = XO0O10(r5);
        this.XXiIiX10 = r6;
        if (r6 == null) goto L59;
        setPressed(true);
        I0iXXO();
        X0O(event);
        OXO1();
        OXO1 r7 = this.IO0II0i;
        if (r7 == null) goto L63;
        r7.OXO1(this, getSelectedMinValue(), getSelectedMaxValue(), 0, this.X00Xi1X, this.XXiIiX10);
        goto L63
    L59:
        return super.onTouchEvent(event);
    L16:
        return super.onTouchEvent(event);
    }

    public void setMinShootTime(long min_cut_time) {
        this.I1 = min_cut_time;
    }

    public void setNormalizedMaxValue(double value) {
        this.X1IX = Math.max(0.0d, Math.min(1.0d, Math.max(value, this.XXX11i)));
        invalidate();
    }

    public void setNormalizedMinValue(double value) {
        this.XXX11i = Math.max(0.0d, Math.min(1.0d, Math.min(value, this.X1IX)));
        invalidate();
    }

    public void setNotifyWhileDragging(boolean flag) {
        this.IXOIIIO = flag;
    }

    public void setOnRangeSeekBarChangeListener(OXO1 listener) {
        this.IO0II0i = listener;
    }

    public void setSelectedMaxValue(long value) {
        if (0.0d != (this.X11iII1O1 - this.iX1O1)) goto L6;
        setNormalizedMaxValue(1.0d);
        return;
    L6:
        setNormalizedMaxValue(I1XOi1(value));
    }

    public void setSelectedMinValue(long value) {
        if (0.0d != (this.X11iII1O1 - this.iX1O1)) goto L6;
        setNormalizedMinValue(0.0d);
        return;
    L6:
        setNormalizedMinValue(I1XOi1(value));
    }

    public void setTouchDown(boolean touchDown) {
        this.i11I = touchDown;
    }

    public RangeSeekBarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.IO = 255;
        this.I1 = 1000;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0;
        this.X00XIX1 = 0;
        this.i0X000X0O = 0.0f;
        this.X1 = 1.0d;
        this.IXOIIIO = false;
        this.Ii0i = getContext().getResources().getColor(R.color.white);
    }

    public RangeSeekBarView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.IO = 255;
        this.I1 = 1000;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0;
        this.X00XIX1 = 0;
        this.i0X000X0O = 0.0f;
        this.X1 = 1.0d;
        this.IXOIIIO = false;
        this.Ii0i = getContext().getResources().getColor(R.color.white);
    }

    public RangeSeekBarView(Context context, long absoluteMinValuePrim, long absoluteMaxValuePrim) {
        super(context);
        this.IO = 255;
        this.I1 = 1000;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0;
        this.X00XIX1 = 0;
        this.i0X000X0O = 0.0f;
        this.X1 = 1.0d;
        this.IXOIIIO = false;
        this.Ii0i = getContext().getResources().getColor(R.color.white);
        this.iX1O1 = absoluteMinValuePrim;
        this.X11iII1O1 = absoluteMaxValuePrim;
        setFocusable(true);
        setFocusableInTouchMode(true);
        O00();
    }
}
