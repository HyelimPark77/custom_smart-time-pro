package com.sma.smartv3.otherdevice.jl.view;

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
    public TextPaint I1;
    public TextPaint IO;
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
        TextPaint r4 = new TextPaint();
        this.IO = r4;
        r4.setFlags(1);
        TextPaint r5 = this.IO;
        Paint.Align r0 = Paint.Align.CENTER;
        r5.setTextAlign(r0);
        this.IO.setTextSize(I0IIOi(12.0f));
        this.IO.setColor(getContext().getResources().getColor(R.color.gray_8B8B8B));
        TextPaint r6 = new TextPaint();
        this.I1 = r6;
        r6.setFlags(1);
        this.I1.setTextAlign(r0);
        this.I1.setTextSize(I0IIOi(14.0f));
        this.I1.setColor(-1);
        Paint r7 = new Paint();
        this.iX1O1 = r7;
        Paint.Cap r1 = Paint.Cap.ROUND;
        r7.setStrokeCap(r1);
        this.iX1O1.setStrokeWidth(XIi00iiXO(3.0f));
        setEnable(true);
        Paint r8 = new Paint();
        this.X11iII1O1 = r8;
        r8.setStrokeCap(r1);
        this.X11iII1O1.setStrokeWidth(XIi00iiXO(3.0f));
        this.X11iII1O1.setColor(getContext().getResources().getColor(R.color.gray_E5E5E5));
    }

    public final boolean XOO0ii0(float x, float y) {
        float r3 = this.X0i1O.y;
        float r0 = this.XXO.getHeight() / 2.0f;
        if (y < (r3 + r0)) goto L5;
        return false;
    L5:
        if (y <= (r3 - r0)) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() != 0) goto L6;
        this.iiiO = XOO0ii0(event.getX(), event.getY());
    L6:
        if (O00() == false) goto L9;
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(event);
    L9:
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    public final float iO(float y) {
        if (y >= getProgressStartY()) goto L7;
        return getProgressStartY();
    L7:
        if (y > getProgressEndY()) goto L9;
        return y;
    L9:
        return getProgressEndY();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float r3 = this.X0i1O.y;
        float r2 = getWidth() / 2.0f;
        if (O00() == false) goto L5;
        Bitmap r0 = this.iXiiiO;
    L6:
        canvas.drawLine(r2, getProgressStartY(), r2, getProgressEndY(), this.X11iII1O1);
        if (r3 == getProgressEndY()) goto L9;
        canvas.drawLine(r2, r3, r2, getProgressEndY(), this.iX1O1);
    L9:
        float r4 = r3 - (r0.getHeight() / 2.0f);
        canvas.drawBitmap(r0, (getWidth() - r0.getWidth()) / 2.0f, r4, null);
        canvas.drawText(this.XXX11i, r2, getHeight() - I0IIOi(2.0f), this.IO);
        if (O00() == false) goto L13;
        float r15 = (getWidth() - this.Ii1iii0.getWidth()) / 2.0f;
        float r5 = (r4 - this.Ii1iii0.getHeight()) + (r0.getHeight() / 4.0f);
        canvas.drawBitmap(this.Ii1iii0, r15, r5, null);
        canvas.drawText(this.X1IX + "", getWidth() / 2.0f, r5 + (this.Ii1iii0.getHeight() / 1.65f), this.I1);
        return;
    L13:
        return;
    L5:
        r0 = this.XXO;
        goto L6
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float r2 = getProgressHeight();
        int r3 = this.XX1Oi;
        int r4 = this.X100O;
        float r5 = r2 / (r3 - r4);
        float r6 = (((r3 - this.X1IX) / (r3 - (r4 * 1.0f))) * getProgressHeight()) + getProgressStartY();
        if (Math.abs(this.X0i1O.y - r6) <= r5) goto L6;
        this.X0i1O.set(0.0f, iO(r6));
        return;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean r1 = false;
        if (this.O001I == true) goto L6;
        this.iiiO = false;
        return super.onTouchEvent(event);
    L6:
        float r0 = iO(event.getY());
        int r2 = event.getAction();
        if (r2 == 0) goto L17;
        if (r2 != 1) goto L10;
    L13:
        OXO1 r3 = this.iXiX011;
        if (r3 == null) goto L16;
        r3.OXO1(false);
    L16:
        getParent().requestDisallowInterceptTouchEvent(false);
        this.iiiO = false;
        r1 = true;
    L20:
        invalidate();
        int r4 = OXO1(r0);
        this.X0i1O.set(event.getX(), r0);
        if (event.getAction() != 0) goto L23;
    L24:
        if (r1 == false) goto L29;
    L25:
        this.X1IX = r4;
        XIi00iiXO r6 = this.iIXi1iiXI;
        if (r6 == null) goto L29;
        r6.OXO1(r4, r1);
    L29:
        return O00();
    L23:
        if (r4 != this.X1IX) goto L25;
    L10:
        if (r2 != 3) goto L20;
        r0 = this.X0i1O.y;
        goto L13
    L17:
        OXO1 r5 = this.iXiX011;
        if (r5 == null) goto L20;
        r5.OXO1(true);
        goto L20
    }

    public void setEnable(boolean enable) {
        this.O001I = enable;
        Paint r0 = this.iX1O1;
        if (enable == true) goto L5;
        int r3 = getContext().getResources().getColor(R.color.color_vsbv_false);
    L6:
        r0.setColor(r3);
        invalidate();
        return;
    L5:
        r3 = getContext().getResources().getColor(R.color.color_vsbv_true);
        goto L6
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
        if (O00() == false) goto L5;
        return;
    L5:
        int r0 = this.X100O;
        if (value >= r0) goto L8;
        value = r0;
    L11:
        int r1 = this.XX1Oi;
        this.X0i1O.set(0.0f, iO((((r1 - value) / ((r1 * 1.0f) - r0)) * getProgressHeight()) + getProgressStartY()));
        this.X1IX = value;
        invalidate();
        return;
    L8:
        int r2 = this.XX1Oi;
        if (value <= r2) goto L11;
        value = r2;
        goto L11
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
