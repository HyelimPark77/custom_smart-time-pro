package com.sma.smartv3.otherdevice.p609jl.view;

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
import com.jieli.p197eq.EQPlotCore;
import com.sma.smartv3.C15429R;

/* JADX INFO: loaded from: classes19.dex */
public class EqWaveView extends View {

    /* JADX INFO: renamed from: I1 */
    public Paint f51353I1;

    /* JADX INFO: renamed from: IO */
    public TextPaint f51354IO;
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
        m38285iO(null, 0);
    }

    public void IiI10X(int index, int value) {
        this.iIXi1iiXI[index] = value;
        this.X1IX.updatePara(index, this.OX110i[index], value);
        if (this.O001I == null) {
            this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
        }
        this.X1IX.getEQPlotData(this.O001I, index);
        this.X0i1O = this.iXiX011.XIi00iiXO(this.O001I);
        invalidate();
    }

    public final int O00(float sp) {
        return (int) TypedValue.applyDimension(2, sp, getResources().getDisplayMetrics());
    }

    public final int OXO1(float dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    public final void XIi00iiXO(Canvas canvas) {
        int i = 0;
        while (true) {
            int[] iArr = this.OX110i;
            if (i >= iArr.length) {
                return;
            }
            float fM884iO = this.iXiX011.m884iO(iArr[i]);
            Canvas canvas2 = canvas;
            canvas2.drawLine(fM884iO, 0.0f, fM884iO, getHeight(), this.X11iII1O1);
            canvas2.drawText(this.iIXi1iiXI[i] + "", fM884iO + O00(2.0f), getHeight() - 2, this.f51354IO);
            i++;
            canvas = canvas2;
        }
    }

    public final void XO0O10() {
        int i = this.XXX11i;
        int[] iArr = this.OX110i;
        this.X1IX = new EQPlotCore(i, iArr.length, iArr);
        if (this.O001I == null) {
            this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
        }
    }

    /* JADX INFO: renamed from: iO */
    public final void m38285iO(AttributeSet attrs, int defStyle) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C15429R.styleable.EqWaveView);
        if (typedArrayObtainStyledAttributes != null) {
            this.iXiiiO = typedArrayObtainStyledAttributes.getColor(4, this.iXiiiO);
            this.X11I = typedArrayObtainStyledAttributes.getColor(5, this.X11I);
            this.Ii1iii0 = typedArrayObtainStyledAttributes.getColor(2, this.Ii1iii0);
            this.X100O = typedArrayObtainStyledAttributes.getColor(3, this.X100O);
            this.iiiO = typedArrayObtainStyledAttributes.getColor(0, this.iiiO);
            this.XX1Oi = typedArrayObtainStyledAttributes.getColor(1, this.XX1Oi);
        }
        this.XXX11i = getContext().getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        TextPaint textPaint = new TextPaint();
        this.f51354IO = textPaint;
        textPaint.setFlags(1);
        this.f51354IO.setTextAlign(Paint.Align.LEFT);
        this.f51354IO.setTextSize(O00(8.0f));
        this.f51354IO.setColor(-1);
        Paint paint = new Paint();
        this.f51353I1 = paint;
        paint.setColor(this.Ii1iii0);
        Paint paint2 = this.f51353I1;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        this.f51353I1.setStrokeWidth(5.0f);
        Paint paint3 = new Paint();
        this.iX1O1 = paint3;
        paint3.setColor(this.iXiiiO);
        this.iX1O1.setTextAlign(align);
        this.iX1O1.setStrokeWidth(OXO1(1.5f));
        this.iX1O1.setStyle(Paint.Style.STROKE);
        this.f51354IO.setFlags(1);
        Paint paint4 = new Paint();
        this.X11iII1O1 = paint4;
        paint4.setColor(-1);
        this.X11iII1O1.setTextAlign(align);
        this.X11iII1O1.setStrokeWidth(1.0f);
        this.XXO = new Path();
        XO0O10();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f51353I1.setShader(new LinearGradient(0.0f, canvas.getHeight(), 0.0f, 0.0f, isEnabled() ? this.iiiO : this.XX1Oi, isEnabled() ? this.Ii1iii0 : this.X100O, Shader.TileMode.REPEAT));
        this.iX1O1.setColor(!isEnabled() ? this.X11I : this.iXiiiO);
        this.XXO.reset();
        this.XXO.moveTo(0.0f, getHeight());
        int i = 0;
        while (true) {
            float[] fArr = this.X0i1O;
            if (i >= fArr.length) {
                Path path = this.XXO;
                float width = getWidth();
                float[] fArr2 = this.X0i1O;
                path.lineTo(width, fArr2[fArr2.length - 1]);
                canvas.drawPath(this.XXO, this.iX1O1);
                this.XXO.lineTo(getWidth(), getHeight());
                this.XXO.lineTo(0.0f, getHeight());
                canvas.drawPath(this.XXO, this.f51353I1);
                canvas.clipPath(this.XXO);
                XIi00iiXO(canvas);
                return;
            }
            this.XXO.lineTo(fArr[i], fArr[i + 1]);
            i += 2;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        OIXXII10O oixxii10o = new OIXXII10O(w, h - O00(6.0f));
        this.iXiX011 = oixxii10o;
        oixxii10o.O00(SizeUtils.dp2px(20.0f));
        OIXXII10O oixxii10o2 = this.iXiX011;
        int[] iArr = this.OX110i;
        oixxii10o2.IiI10X(iArr[0], iArr[iArr.length - 1]);
        if (this.O001I == null) {
            this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
        }
        this.X1IX.getEQPlotData(this.O001I, 0);
        setData(this.iIXi1iiXI);
        this.X0i1O = this.iXiX011.XIi00iiXO(this.O001I);
    }

    public void setData(int[] value) {
        int i = 0;
        while (true) {
            int[] iArr = this.OX110i;
            if (i >= iArr.length || i >= value.length) {
                break;
            }
            this.X1IX.updatePara(i, iArr[i], value[i]);
            this.iIXi1iiXI[i] = value[i];
            this.X1IX.getEQPlotData(this.O001I, i);
            i++;
        }
        OIXXII10O oixxii10o = this.iXiX011;
        if (oixxii10o == null) {
            return;
        }
        this.X0i1O = oixxii10o.XIi00iiXO(this.O001I);
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean enable) {
        super.setEnabled(enable);
        invalidate();
    }

    public void setFreqs(int[] freqs) {
        if (freqs.length == this.OX110i.length) {
            boolean z = true;
            for (int i = 0; i < freqs.length; i++) {
                if (freqs[i] != this.OX110i[i]) {
                    z = false;
                }
            }
            if (z) {
                return;
            }
        }
        this.OX110i = freqs;
        OIXXII10O oixxii10o = this.iXiX011;
        if (oixxii10o != null) {
            oixxii10o.O00(SizeUtils.dp2px(20.0f));
            OIXXII10O oixxii10o2 = this.iXiX011;
            int[] iArr = this.OX110i;
            oixxii10o2.IiI10X(iArr[0], iArr[iArr.length - 1]);
        }
        int i2 = this.XXX11i;
        int[] iArr2 = this.OX110i;
        this.X1IX = new EQPlotCore(i2, iArr2.length, iArr2);
        if (this.O001I == null) {
            this.O001I = new float[((this.XXX11i - 2) * 4) + 4];
        }
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
        m38285iO(attrs, 0);
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
        m38285iO(attrs, defStyle);
    }
}
