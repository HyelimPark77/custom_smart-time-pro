package com.sma.smartv3.otherdevice.p609jl.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public class VerticalSeekBarView extends View {

    /* JADX INFO: renamed from: I1 */
    public TextPaint f51368I1;

    /* JADX INFO: renamed from: IO */
    public TextPaint f51369IO;
    public Bitmap Ii1iii0;
    public boolean O001I;
    public PointF X0i1O;
    public int X100O;
    public int X11I;
    public Paint X11iII1O1;
    public int X1IX;
    public int XX1Oi;
    public Bitmap XXO;
    public String XXX11i;
    public XIi00iiXO iIXi1iiXI;
    public Paint iX1O1;
    public OXO1 iXiX011;
    public Bitmap iXiiiO;
    public boolean iiiO;

    public interface OXO1 {
        void OXO1(boolean hover);
    }

    public interface XIi00iiXO {
        void OXO1(int value, boolean end);
    }

    public VerticalSeekBarView(Context context) {
        super(context);
        this.XXX11i = "125";
        this.X1IX = 0;
        this.X0i1O = new PointF();
        this.O001I = false;
        this.XXO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_btn_slider_nor);
        this.iXiiiO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_btn_slider_sel);
        this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_sb_labal_bg);
        this.X11I = 0;
        this.X100O = -8;
        this.XX1Oi = 8;
        XO0O10(null, 0);
    }

    private float getProgressEndY() {
        return getProgressStartY() + getProgressHeight();
    }

    private float getProgressHeight() {
        return (getHeight() - (this.XXO.getHeight() / 1.1f)) - getProgressStartY();
    }

    private float getProgressStartY() {
        return this.XXO.getHeight() * 1.15f;
    }

    public final int I0IIOi(float sp) {
        return (int) TypedValue.applyDimension(2, sp, getResources().getDisplayMetrics());
    }

    public boolean IiI10X() {
        return this.O001I;
    }

    public final boolean O00() {
        return this.iiiO;
    }

    public final int OXO1(float y) {
        return (int) (this.XX1Oi - (((y - getProgressStartY()) / getProgressHeight()) * (this.XX1Oi - this.X100O)));
    }

    public final int XIi00iiXO(float dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    public final void XO0O10(AttributeSet attrs, int defStyle) {
        TextPaint textPaint = new TextPaint();
        this.f51369IO = textPaint;
        textPaint.setFlags(1);
        TextPaint textPaint2 = this.f51369IO;
        Paint.Align align = Paint.Align.CENTER;
        textPaint2.setTextAlign(align);
        this.f51369IO.setTextSize(I0IIOi(12.0f));
        this.f51369IO.setColor(getContext().getResources().getColor(R.color.gray_8B8B8B));
        TextPaint textPaint3 = new TextPaint();
        this.f51368I1 = textPaint3;
        textPaint3.setFlags(1);
        this.f51368I1.setTextAlign(align);
        this.f51368I1.setTextSize(I0IIOi(14.0f));
        this.f51368I1.setColor(-1);
        Paint paint = new Paint();
        this.iX1O1 = paint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.iX1O1.setStrokeWidth(XIi00iiXO(3.0f));
        setEnable(true);
        Paint paint2 = new Paint();
        this.X11iII1O1 = paint2;
        paint2.setStrokeCap(cap);
        this.X11iII1O1.setStrokeWidth(XIi00iiXO(3.0f));
        this.X11iII1O1.setColor(getContext().getResources().getColor(R.color.gray_E5E5E5));
    }

    public final boolean XOO0ii0(float x, float y) {
        float f = this.X0i1O.y;
        float height = this.XXO.getHeight() / 2.0f;
        return y < f + height && y > f - height;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == 0) {
            this.iiiO = XOO0ii0(event.getX(), event.getY());
        }
        if (O00()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.dispatchTouchEvent(event);
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    /* JADX INFO: renamed from: iO */
    public final float m38290iO(float y) {
        if (y < getProgressStartY()) {
            return getProgressStartY();
        }
        return y > getProgressEndY() ? getProgressEndY() : y;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.X0i1O.y;
        float width = getWidth() / 2.0f;
        Bitmap bitmap = O00() ? this.iXiiiO : this.XXO;
        canvas.drawLine(width, getProgressStartY(), width, getProgressEndY(), this.X11iII1O1);
        if (f != getProgressEndY()) {
            canvas.drawLine(width, f, width, getProgressEndY(), this.iX1O1);
        }
        float height = f - (bitmap.getHeight() / 2.0f);
        canvas.drawBitmap(bitmap, (getWidth() - bitmap.getWidth()) / 2.0f, height, (Paint) null);
        canvas.drawText(this.XXX11i, width, getHeight() - I0IIOi(2.0f), this.f51369IO);
        if (O00()) {
            float width2 = (getWidth() - this.Ii1iii0.getWidth()) / 2.0f;
            float height2 = (height - this.Ii1iii0.getHeight()) + (bitmap.getHeight() / 4.0f);
            canvas.drawBitmap(this.Ii1iii0, width2, height2, (Paint) null);
            canvas.drawText(this.X1IX + "", getWidth() / 2.0f, height2 + (this.Ii1iii0.getHeight() / 1.65f), this.f51368I1);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float progressHeight = getProgressHeight();
        int i = this.XX1Oi;
        int i2 = this.X100O;
        float f = progressHeight / (i - i2);
        float progressHeight2 = (((i - this.X1IX) / (i - (i2 * 1.0f))) * getProgressHeight()) + getProgressStartY();
        if (Math.abs(this.X0i1O.y - progressHeight2) > f) {
            this.X0i1O.set(0.0f, m38290iO(progressHeight2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        OXO1 oxo1;
        boolean z = false;
        if (!this.O001I) {
            this.iiiO = false;
            return super.onTouchEvent(event);
        }
        float fM38290iO = m38290iO(event.getY());
        int action = event.getAction();
        if (action == 0) {
            OXO1 oxo2 = this.iXiX011;
            if (oxo2 != null) {
                oxo2.OXO1(true);
            }
        } else if (action == 1) {
            oxo1 = this.iXiX011;
            if (oxo1 != null) {
                oxo1.OXO1(false);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            this.iiiO = false;
            z = true;
        } else if (action == 3) {
            fM38290iO = this.X0i1O.y;
            oxo1 = this.iXiX011;
            if (oxo1 != null) {
                oxo1.OXO1(false);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            this.iiiO = false;
            z = true;
        }
        invalidate();
        int iOXO1 = OXO1(fM38290iO);
        this.X0i1O.set(event.getX(), fM38290iO);
        if ((event.getAction() != 0 && iOXO1 != this.X1IX) || z) {
            this.X1IX = iOXO1;
            XIi00iiXO xIi00iiXO = this.iIXi1iiXI;
            if (xIi00iiXO != null) {
                xIi00iiXO.OXO1(iOXO1, z);
            }
        }
        return O00();
    }

    public void setEnable(boolean enable) {
        this.O001I = enable;
        this.iX1O1.setColor(!enable ? getContext().getResources().getColor(R.color.color_vsbv_false) : getContext().getResources().getColor(R.color.color_vsbv_true));
        invalidate();
    }

    public void setHoverListener(OXO1 hoverListener) {
        this.iXiX011 = hoverListener;
    }

    public void setIndex(int index) {
        this.X11I = index;
    }

    public void setText(String text) {
        this.XXX11i = text;
        invalidate();
    }

    public void setValue(int value) {
        if (O00()) {
            return;
        }
        int i = this.X100O;
        if (value < i) {
            value = i;
        } else {
            int i2 = this.XX1Oi;
            if (value > i2) {
                value = i2;
            }
        }
        int i3 = this.XX1Oi;
        this.X0i1O.set(0.0f, m38290iO((((i3 - value) / ((i3 * 1.0f) - i)) * getProgressHeight()) + getProgressStartY()));
        this.X1IX = value;
        invalidate();
    }

    public void setValueListener(XIi00iiXO valueListener) {
        this.iIXi1iiXI = valueListener;
    }

    public VerticalSeekBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.XXX11i = "125";
        this.X1IX = 0;
        this.X0i1O = new PointF();
        this.O001I = false;
        this.XXO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_btn_slider_nor);
        this.iXiiiO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_btn_slider_sel);
        this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_sb_labal_bg);
        this.X11I = 0;
        this.X100O = -8;
        this.XX1Oi = 8;
        XO0O10(attrs, 0);
    }

    public VerticalSeekBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.XXX11i = "125";
        this.X1IX = 0;
        this.X0i1O = new PointF();
        this.O001I = false;
        this.XXO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_btn_slider_nor);
        this.iXiiiO = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_btn_slider_sel);
        this.Ii1iii0 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eq_sb_labal_bg);
        this.X11I = 0;
        this.X100O = -8;
        this.XX1Oi = 8;
        XO0O10(attrs, defStyle);
    }
}
