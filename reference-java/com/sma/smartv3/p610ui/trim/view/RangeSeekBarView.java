package com.sma.smartv3.p610ui.trim.view;

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
    public static final int XOXiX0 = 8;

    /* JADX INFO: renamed from: I1 */
    public long f54881I1;

    /* JADX INFO: renamed from: IO */
    public int f54882IO;
    public OXO1 IO0II0i;
    public boolean IXOIIIO;
    public boolean Ii0X0X;
    public int Ii0i;
    public Paint Ii1iii0;
    public Bitmap O001I;

    /* JADX INFO: renamed from: OO */
    public float f54883OO;
    public int OX110i;
    public long X00XIX1;
    public boolean X00Xi1X;
    public double X0i1O;

    /* JADX INFO: renamed from: X1 */
    public double f54884X1;
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
    public static final int XOO0XOOii = SizeUtils.dp2px(7.0f);
    public static final int iiIOiX = SizeUtils.dp2px(10.0f);

    public interface OXO1 {
        void OXO1(RangeSeekBarView bar, long minValue, long maxValue, int action, boolean isMin, Thumb pressedThumb);
    }

    public enum Thumb {
        MIN,
        MAX
    }

    public RangeSeekBarView(Context context) {
        super(context);
        this.f54882IO = 255;
        this.f54881I1 = 1000L;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0L;
        this.X00XIX1 = 0L;
        this.i0X000X0O = 0.0f;
        this.f54884X1 = 1.0d;
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
        double d = this.X11iII1O1;
        double d2 = this.iX1O1;
        if (0.0d == d - d2) {
            return 0.0d;
        }
        return (value - d2) / (d - d2);
    }

    /* JADX INFO: renamed from: IO */
    public final long m38794IO(double normalized) {
        double d = this.iX1O1;
        return (long) (d + (normalized * (this.X11iII1O1 - d)));
    }

    public final boolean IiI10X(float touchX, double normalizedThumbValue, double scale) {
        return ((double) Math.abs(touchX - OIi0(normalizedThumbValue))) <= ((double) this.f54883OO) * scale;
    }

    public final void O00() {
        this.iXiX011 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_video_thumb_handle);
        this.O001I = bitmapDecodeResource;
        int width = bitmapDecodeResource.getWidth();
        int height = this.O001I.getHeight();
        int iDp2px = SizeUtils.dp2px(11.0f);
        float fDp2px = (SizeUtils.dp2px(55.0f) * 1.0f) / height;
        Matrix matrix = new Matrix();
        matrix.postScale((iDp2px * 1.0f) / width, fDp2px);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.O001I, 0, 0, width, height, matrix, true);
        this.O001I = bitmapCreateBitmap;
        this.XXO = bitmapCreateBitmap;
        this.iXiiiO = bitmapCreateBitmap;
        this.OX110i = iDp2px;
        this.f54883OO = iDp2px / 2;
        int color = getContext().getResources().getColor(R.color.shadow_color);
        this.XX1Oi.setAntiAlias(true);
        this.XX1Oi.setColor(color);
        this.Ii1iii0 = new Paint(1);
        Paint paint = new Paint(1);
        this.iiiO = paint;
        paint.setStyle(Paint.Style.FILL);
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
        int action = (ev.getAction() & 65280) >> 8;
        if (ev.getPointerId(action) == this.f54882IO) {
            int i = action == 0 ? 1 : 0;
            this.XO0X10iO = ev.getX(i);
            this.f54882IO = ev.getPointerId(i);
        }
    }

    public final float OIi0(double normalizedCoord) {
        return (float) (((double) getPaddingLeft()) + (normalizedCoord * ((double) ((getWidth() - getPaddingLeft()) - getPaddingRight()))));
    }

    public final void OXO1() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void X0O(MotionEvent event) {
        if (event.getPointerCount() > 1) {
            return;
        }
        Log.e(IXI, "trackTouchEvent: " + event.getAction() + " x: " + event.getX());
        try {
            float x = event.getX(event.findPointerIndex(this.f54882IO));
            if (Thumb.MIN.equals(this.XXiIiX10)) {
                setNormalizedMinValue(X1ii(x, 0));
            } else if (Thumb.MAX.equals(this.XXiIiX10)) {
                setNormalizedMaxValue(X1ii(x, 1));
            }
        } catch (Exception unused) {
        }
    }

    public final double X1ii(float screenCoord, int position) {
        double d;
        int width = getWidth();
        float f = width;
        if (f <= 0.0f) {
            return 0.0d;
        }
        this.X00Xi1X = false;
        double width2 = screenCoord;
        float fOIi0 = OIi0(this.XXX11i);
        float fOIi1 = OIi0(this.X1IX);
        double d2 = this.f54881I1;
        double d3 = this.X11iII1O1;
        double d4 = (d2 / (d3 - this.iX1O1)) * ((double) (width - (this.OX110i * 2)));
        if (d3 > 300000.0d) {
            this.f54884X1 = Double.parseDouble(new DecimalFormat("0.0000").format(d4));
        } else {
            this.f54884X1 = Math.round(d4 + 0.5d);
        }
        if (position == 0) {
            if (XOO0ii0(screenCoord, this.XXX11i, 0.5d)) {
                return this.XXX11i;
            }
            double valueLength = ((double) getValueLength()) - (((double) (((float) getWidth()) - fOIi1 >= 0.0f ? getWidth() - fOIi1 : 0.0f)) + this.f54884X1);
            double d5 = fOIi0;
            if (width2 > d5) {
                width2 = (width2 - d5) + d5;
            } else if (width2 <= d5) {
                width2 = d5 - (d5 - width2);
            }
            if (width2 > valueLength) {
                this.X00Xi1X = true;
            } else {
                valueLength = width2;
            }
            int i = this.OX110i;
            if (valueLength < (i * 2) / 3) {
                valueLength = 0.0d;
            }
            double d6 = valueLength - 0.0d;
            this.X0i1O = Math.min(1.0d, Math.max(0.0d, d6 / ((double) (width - (i * 2)))));
            return Math.min(1.0d, Math.max(0.0d, d6 / ((double) (f - 0.0f))));
        }
        if (IiI10X(screenCoord, this.X1IX, 0.5d)) {
            return this.X1IX;
        }
        double valueLength2 = ((double) getValueLength()) - (((double) fOIi0) + this.f54884X1);
        double d7 = fOIi1;
        if (width2 > d7) {
            width2 = (width2 - d7) + d7;
        } else if (width2 <= d7) {
            width2 = d7 - (d7 - width2);
        }
        double width3 = ((double) getWidth()) - width2;
        if (width3 > valueLength2) {
            this.X00Xi1X = true;
            width2 = ((double) getWidth()) - valueLength2;
            d = valueLength2;
        } else {
            d = width3;
        }
        if (d < (this.OX110i * 2) / 3) {
            width2 = getWidth();
            d = 0.0d;
        }
        this.iIXi1iiXI = Math.min(1.0d, Math.max(0.0d, 1.0d - ((d - 0.0d) / ((double) (width - (this.OX110i * 2))))));
        return Math.min(1.0d, Math.max(0.0d, (width2 - 0.0d) / ((double) (f - 0.0f))));
    }

    public final void XIi00iiXO(float screenCoord, boolean pressed, Canvas canvas, boolean isLeft) {
        Bitmap bitmap;
        if (pressed) {
            bitmap = this.iXiiiO;
        } else {
            bitmap = isLeft ? this.O001I : this.XXO;
        }
        canvas.drawBitmap(bitmap, screenCoord - (isLeft ? 0 : this.OX110i), iiIOiX, this.Ii1iii0);
    }

    public final Thumb XO0O10(float touchX) {
        boolean zIiI10X = IiI10X(touchX, this.XXX11i, 2.0d);
        boolean zIiI10X2 = IiI10X(touchX, this.X1IX, 2.0d);
        if (zIiI10X && zIiI10X2) {
            return touchX / ((float) getWidth()) > 0.5f ? Thumb.MIN : Thumb.MAX;
        }
        if (zIiI10X) {
            return Thumb.MIN;
        }
        if (zIiI10X2) {
            return Thumb.MAX;
        }
        return null;
    }

    public final boolean XOO0ii0(float touchX, double normalizedThumbValue, double scale) {
        return ((double) Math.abs((touchX - OIi0(normalizedThumbValue)) - ((float) this.OX110i))) <= ((double) this.f54883OO) * scale;
    }

    public void XXI() {
        this.Ii0X0X = false;
    }

    public long getSelectedMaxValue() {
        return m38794IO(this.iIXi1iiXI);
    }

    public long getSelectedMinValue() {
        return m38794IO(this.X0i1O);
    }

    /* JADX INFO: renamed from: iO */
    public final void m38795iO(Canvas canvas) {
        String strXIi00iiXO = OOXOXI.XIi00iiXO(this.iOiXi11II);
        String strXIi00iiXO2 = OOXOXI.XIi00iiXO(this.X00XIX1);
        float fOIi0 = OIi0(this.XXX11i);
        int i = XOO0XOOii;
        canvas.drawText(strXIi00iiXO, fOIi0, i, this.X11I);
        canvas.drawText(strXIi00iiXO2, OIi0(this.X1IX), i, this.X100O);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() - getPaddingRight();
        float fOIi0 = OIi0(this.XXX11i);
        float fOIi1 = OIi0(this.X1IX);
        Rect rect = new Rect((int) 0.0f, getHeight(), (int) fOIi0, 0);
        Rect rect2 = new Rect((int) fOIi1, getHeight(), (int) width, 0);
        canvas.drawRect(rect, this.XX1Oi);
        canvas.drawRect(rect2, this.XX1Oi);
        float f = this.i0X000X0O;
        int i = iiIOiX;
        canvas.drawRect(fOIi0, f + i, fOIi1, f + SizeUtils.dp2px(2.0f) + i, this.iiiO);
        canvas.drawRect(fOIi0, getHeight() - SizeUtils.dp2px(2.0f), fOIi1, getHeight(), this.iiiO);
        XIi00iiXO(OIi0(this.XXX11i), false, canvas, true);
        XIi00iiXO(OIi0(this.X1IX), false, canvas, false);
        m38795iO(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getMode(widthMeasureSpec) != 0 ? View.MeasureSpec.getSize(widthMeasureSpec) : 300, View.MeasureSpec.getMode(heightMeasureSpec) != 0 ? View.MeasureSpec.getSize(heightMeasureSpec) : 120);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcel) {
        Bundle bundle = (Bundle) parcel;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER"));
        this.XXX11i = bundle.getDouble("MIN");
        this.X1IX = bundle.getDouble("MAX");
        this.X0i1O = bundle.getDouble("MIN_TIME");
        this.iIXi1iiXI = bundle.getDouble("MAX_TIME");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", this.XXX11i);
        bundle.putDouble("MAX", this.X1IX);
        bundle.putDouble("MIN_TIME", this.X0i1O);
        bundle.putDouble("MAX_TIME", this.iIXi1iiXI);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        OXO1 oxo1;
        if (!this.i11I && event.getPointerCount() <= 1) {
            if (!isEnabled()) {
                return false;
            }
            if (this.X11iII1O1 <= this.f54881I1) {
                return super.onTouchEvent(event);
            }
            int action = event.getAction() & 255;
            if (action == 0) {
                int pointerId = event.getPointerId(event.getPointerCount() - 1);
                this.f54882IO = pointerId;
                float x = event.getX(event.findPointerIndex(pointerId));
                this.XO0X10iO = x;
                Thumb thumbXO0O10 = XO0O10(x);
                this.XXiIiX10 = thumbXO0O10;
                if (thumbXO0O10 == null) {
                    return super.onTouchEvent(event);
                }
                setPressed(true);
                I0iXXO();
                X0O(event);
                OXO1();
                OXO1 oxo2 = this.IO0II0i;
                if (oxo2 != null) {
                    oxo2.OXO1(this, getSelectedMinValue(), getSelectedMaxValue(), 0, this.X00Xi1X, this.XXiIiX10);
                }
            } else if (action == 1) {
                if (this.Ii0X0X) {
                    X0O(event);
                    XXI();
                    setPressed(false);
                } else {
                    I0iXXO();
                    X0O(event);
                    XXI();
                }
                invalidate();
                OXO1 oxo3 = this.IO0II0i;
                if (oxo3 != null) {
                    oxo3.OXO1(this, getSelectedMinValue(), getSelectedMaxValue(), 1, this.X00Xi1X, this.XXiIiX10);
                }
                this.XXiIiX10 = null;
            } else if (action != 2) {
                if (action == 3) {
                    if (this.Ii0X0X) {
                        XXI();
                        setPressed(false);
                    }
                    invalidate();
                } else if (action == 5) {
                    int pointerCount = event.getPointerCount() - 1;
                    this.XO0X10iO = event.getX(pointerCount);
                    this.f54882IO = event.getPointerId(pointerCount);
                    invalidate();
                } else if (action == 6) {
                    OIX0iXi(event);
                    invalidate();
                }
            } else if (this.XXiIiX10 != null) {
                if (this.Ii0X0X) {
                    X0O(event);
                } else if (Math.abs(event.getX(event.findPointerIndex(this.f54882IO)) - this.XO0X10iO) > this.iXiX011) {
                    setPressed(true);
                    Log.e(IXI, "没有拖住最大最小值");
                    invalidate();
                    I0iXXO();
                    X0O(event);
                    OXO1();
                }
                if (this.IXOIIIO && (oxo1 = this.IO0II0i) != null) {
                    oxo1.OXO1(this, getSelectedMinValue(), getSelectedMaxValue(), 2, this.X00Xi1X, this.XXiIiX10);
                }
            }
            return true;
        }
        return super.onTouchEvent(event);
    }

    public void setMinShootTime(long min_cut_time) {
        this.f54881I1 = min_cut_time;
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
        if (0.0d == this.X11iII1O1 - this.iX1O1) {
            setNormalizedMaxValue(1.0d);
        } else {
            setNormalizedMaxValue(I1XOi1(value));
        }
    }

    public void setSelectedMinValue(long value) {
        if (0.0d == this.X11iII1O1 - this.iX1O1) {
            setNormalizedMinValue(0.0d);
        } else {
            setNormalizedMinValue(I1XOi1(value));
        }
    }

    public void setTouchDown(boolean touchDown) {
        this.i11I = touchDown;
    }

    public RangeSeekBarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f54882IO = 255;
        this.f54881I1 = 1000L;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0L;
        this.X00XIX1 = 0L;
        this.i0X000X0O = 0.0f;
        this.f54884X1 = 1.0d;
        this.IXOIIIO = false;
        this.Ii0i = getContext().getResources().getColor(R.color.white);
    }

    public RangeSeekBarView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f54882IO = 255;
        this.f54881I1 = 1000L;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0L;
        this.X00XIX1 = 0L;
        this.i0X000X0O = 0.0f;
        this.f54884X1 = 1.0d;
        this.IXOIIIO = false;
        this.Ii0i = getContext().getResources().getColor(R.color.white);
    }

    public RangeSeekBarView(Context context, long absoluteMinValuePrim, long absoluteMaxValuePrim) {
        super(context);
        this.f54882IO = 255;
        this.f54881I1 = 1000L;
        this.XXX11i = 0.0d;
        this.X1IX = 1.0d;
        this.X0i1O = 0.0d;
        this.iIXi1iiXI = 1.0d;
        this.X11I = new Paint();
        this.X100O = new Paint();
        this.XX1Oi = new Paint();
        this.XOX0O0 = 0.0f;
        this.iOiXi11II = 0L;
        this.X00XIX1 = 0L;
        this.i0X000X0O = 0.0f;
        this.f54884X1 = 1.0d;
        this.IXOIIIO = false;
        this.Ii0i = getContext().getResources().getColor(R.color.white);
        this.iX1O1 = absoluteMinValuePrim;
        this.X11iII1O1 = absoluteMaxValuePrim;
        setFocusable(true);
        setFocusableInTouchMode(true);
        O00();
    }
}
