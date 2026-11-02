package com.sma.smartv3.otherdevice.jl.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.android.mltcode.paycertificationapi.OIXXII10O;
import com.blankj.utilcode.util.SizeUtils;
import com.jieli.eq.EQPlotCore;
import com.sma.smartv3.R;

/* JADX INFO: loaded from: classes19.dex */
public class EqWaveView extends View {
    public Paint I1;
    public TextPaint IO;
    public int Ii1iii0;
    public float[] O001I;
    public int[] OX110i;
    public float[] X0i1O;
    public int X100O;
    public int X11I;
    public Paint X11iII1O1;
    public EQPlotCore X1IX;
    public int XX1Oi;
    public Path XXO;
    public int XXX11i;
    public int[] iIXi1iiXI;
    public Paint iX1O1;
    public OIXXII10O iXiX011;
    public int iXiiiO;
    public int iiiO;

    public EqWaveView(Context context) {
        super(context);
        this.XXX11i = 2000;
        this.iIXi1iiXI = new int[10];
        this.iXiX011 = null;
        this.iXiiiO = -8365077;
        this.Ii1iii0 = -8365077;
        this.iiiO = 2136883691;
        this.X11I = 13948116;
        this.X100O = 12303291;
        this.XX1Oi = 12303291;
        this.OX110i = new int[]{31, 63, 125, 250, 500, 1000, 2000, 8000, 16000};
        iO(null, 0);
    }

    public void IiI10X(int index, int value) {
        this.iIXi1iiXI[index] = value;
        this.X1IX.updatePara(index, this.OX110i[index], value);
        if (this.O001I != null) goto L5;
        this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
    L5:
        this.X1IX.getEQPlotData(this.O001I, index);
        this.X0i1O = XIi00iiXO(this.O001I);
        invalidate();
    }

    public final int O00(float sp) {
        return (int) TypedValue.applyDimension(2, sp, getResources().getDisplayMetrics());
    }

    public final int OXO1(float dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    public final void XIi00iiXO(Canvas canvas) {
        int r0 = 0;
    L3:
        int[] r1 = this.OX110i;
        if (r0 >= r1.length) goto L6;
        float r4 = iO(r1[r0]);
        Canvas r3 = canvas;
        r3.drawLine(r4, 0.0f, r4, getHeight(), this.X11iII1O1);
        r3.drawText(this.iIXi1iiXI[r0] + "", r4 + O00(2.0f), getHeight() - 2, this.IO);
        r0 = r0 + 1;
        canvas = r3;
        goto L3
    }

    public final void XO0O10() {
        int r1 = this.XXX11i;
        int[] r2 = this.OX110i;
        this.X1IX = new EQPlotCore(r1, r2.length, r2);
        if (this.O001I != null) goto L6;
        this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
        return;
    }

    public final void iO(AttributeSet attrs, int defStyle) {
        TypedArray r4 = getContext().obtainStyledAttributes(attrs, R.styleable.EqWaveView);
        if (r4 == null) goto L5;
        this.iXiiiO = r4.getColor(4, this.iXiiiO);
        this.X11I = r4.getColor(5, this.X11I);
        this.Ii1iii0 = r4.getColor(2, this.Ii1iii0);
        this.X100O = r4.getColor(3, this.X100O);
        this.iiiO = r4.getColor(0, this.iiiO);
        this.XX1Oi = r4.getColor(1, this.XX1Oi);
    L5:
        this.XXX11i = getContext().getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        TextPaint r5 = new TextPaint();
        this.IO = r5;
        r5.setFlags(1);
        this.IO.setTextAlign(Paint.Align.LEFT);
        this.IO.setTextSize(O00(8.0f));
        this.IO.setColor(-1);
        Paint r6 = new Paint();
        this.I1 = r6;
        r6.setColor(this.Ii1iii0);
        Paint r7 = this.I1;
        Paint.Align r1 = Paint.Align.CENTER;
        r7.setTextAlign(r1);
        this.I1.setStrokeWidth(5.0f);
        Paint r8 = new Paint();
        this.iX1O1 = r8;
        r8.setColor(this.iXiiiO);
        this.iX1O1.setTextAlign(r1);
        this.iX1O1.setStrokeWidth(OXO1(1.5f));
        this.iX1O1.setStyle(Paint.Style.STROKE);
        this.IO.setFlags(1);
        Paint r9 = new Paint();
        this.X11iII1O1 = r9;
        r9.setColor(-1);
        this.X11iII1O1.setTextAlign(r1);
        this.X11iII1O1.setStrokeWidth(1.0f);
        this.XXO = new Path();
        XO0O10();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float r2 = canvas.getHeight();
        if (isEnabled() == false) goto L6;
        int r1 = this.iiiO;
    L5:
        int r5 = r1;
        if (isEnabled() == false) goto L11;
        int r3 = this.Ii1iii0;
    L12:
        this.I1.setShader(new LinearGradient(0.0f, r2, 0.0f, 0.0f, r5, r3, Shader.TileMode.REPEAT));
        Paint r0 = this.iX1O1;
        if (isEnabled() == true) goto L15;
        int r4 = this.X11I;
    L16:
        r0.setColor(r4);
        this.XXO.reset();
        this.XXO.moveTo(0.0f, getHeight());
        int r6 = 0;
    L17:
        float[] r7 = this.X0i1O;
        if (r6 >= r7.length) goto L20;
        this.XXO.lineTo(r7[r6], r7[r6 + 1]);
        r6 = r6 + 2;
        goto L17
    L20:
        Path r8 = this.XXO;
        float r9 = getWidth();
        float[] r10 = this.X0i1O;
        r8.lineTo(r9, r10[r10.length - 1]);
        canvas.drawPath(this.XXO, this.iX1O1);
        this.XXO.lineTo(getWidth(), getHeight());
        this.XXO.lineTo(0.0f, getHeight());
        canvas.drawPath(this.XXO, this.I1);
        canvas.clipPath(this.XXO);
        XIi00iiXO(canvas);
        return;
    L15:
        r4 = this.iXiiiO;
        goto L16
    L11:
        r3 = this.X100O;
        goto L12
    L6:
        r1 = this.XX1Oi;
        goto L5
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        OIXXII10O r4 = new OIXXII10O(w, h - O00(6.0f));
        this.iXiX011 = r4;
        r4.O00(SizeUtils.dp2px(20.0f));
        OIXXII10O r2 = this.iXiX011;
        int[] r3 = this.OX110i;
        r2.IiI10X(r3[0], r3[r3.length - 1]);
        if (this.O001I != null) goto L5;
        this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
    L5:
        this.X1IX.getEQPlotData(this.O001I, 0);
        setData(this.iIXi1iiXI);
        this.X0i1O = XIi00iiXO(this.O001I);
    }

    public void setData(int[] value) {
        int r0 = 0;
    L3:
        int[] r1 = this.OX110i;
        if (r0 >= r1.length) goto L8;
        if (r0 >= value.length) goto L8;
        this.X1IX.updatePara(r0, r1[r0], value[r0]);
        this.iIXi1iiXI[r0] = value[r0];
        this.X1IX.getEQPlotData(this.O001I, r0);
        r0 = r0 + 1;
    L8:
        OIXXII10O r5 = this.iXiX011;
        if (r5 != null) goto L11;
        return;
    L11:
        this.X0i1O = r5.XIi00iiXO(this.O001I);
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean enable) {
        super.setEnabled(enable);
        invalidate();
    }

    public void setFreqs(int[] freqs) {
        if (freqs.length != this.OX110i.length) goto L13;
        int r0 = 0;
        boolean r1 = true;
    L6:
        if (r0 >= freqs.length) goto L11;
        if (freqs[r0] == this.OX110i[r0]) goto L10;
        r1 = false;
    L10:
        r0 = r0 + 1;
        goto L6
    L11:
        if (r1 == false) goto L13;
        return;
    L13:
        this.OX110i = freqs;
        OIXXII10O r7 = this.iXiX011;
        if (r7 == null) goto L16;
        r7.O00(SizeUtils.dp2px(20.0f));
        OIXXII10O r8 = this.iXiX011;
        int[] r2 = this.OX110i;
        r8.IiI10X(r2[0], r2[r2.length - 1]);
    L16:
        int r3 = this.XXX11i;
        int[] r4 = this.OX110i;
        this.X1IX = new EQPlotCore(r3, r4.length, r4);
        if (this.O001I != null) goto L19;
        this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
    L19:
        setData(this.iIXi1iiXI);
    }

    public EqWaveView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.XXX11i = 2000;
        this.iIXi1iiXI = new int[10];
        this.iXiX011 = null;
        this.iXiiiO = -8365077;
        this.Ii1iii0 = -8365077;
        this.iiiO = 2136883691;
        this.X11I = 13948116;
        this.X100O = 12303291;
        this.XX1Oi = 12303291;
        this.OX110i = new int[]{31, 63, 125, 250, 500, 1000, 2000, 8000, 16000};
        iO(attrs, 0);
    }

    public EqWaveView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.XXX11i = 2000;
        this.iIXi1iiXI = new int[10];
        this.iXiX011 = null;
        this.iXiiiO = -8365077;
        this.Ii1iii0 = -8365077;
        this.iiiO = 2136883691;
        this.X11I = 13948116;
        this.X100O = 12303291;
        this.XX1Oi = 12303291;
        this.OX110i = new int[]{31, 63, 125, 250, 500, 1000, 2000, 8000, 16000};
        iO(attrs, defStyle);
    }
}
