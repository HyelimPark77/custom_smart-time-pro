package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class PagerIndicator extends View {
    public static final long iXiX011 = 600;

    /* JADX INFO: renamed from: I1 */
    public int f55019I1;

    /* JADX INFO: renamed from: IO */
    public int f55020IO;
    public int X0i1O;
    public int X11iII1O1;
    public Paint X1IX;
    public int XXX11i;
    public Runnable iIXi1iiXI;
    public int iX1O1;

    public class OXO1 implements Runnable {
        public OXO1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PagerIndicator.this.X0i1O++;
            if (PagerIndicator.this.X0i1O == PagerIndicator.this.iX1O1) {
                PagerIndicator.this.X0i1O = -1;
            }
            PagerIndicator.this.invalidate();
            PagerIndicator.this.postDelayed(this, 600L);
        }
    }

    public PagerIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.iX1O1 = 5;
        this.X11iII1O1 = 40;
        this.XXX11i = 8;
        this.X0i1O = -1;
        this.iIXi1iiXI = new OXO1();
        Paint paint = new Paint();
        this.X1IX = paint;
        paint.setAntiAlias(true);
        this.X1IX.setDither(true);
        this.X1IX.setStrokeWidth(4.0f);
    }

    public void XO0O10(boolean start) {
        this.X0i1O = -1;
        invalidate();
        if (start) {
            postDelayed(this.iIXi1iiXI, 600L);
        } else {
            removeCallbacks(this.iIXi1iiXI);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.f55020IO / 2;
        int i = this.iX1O1;
        int i2 = (int) (f - ((this.XXX11i * i) + ((this.X11iII1O1 * (i - 1.0f)) / 2.0f)));
        for (int i3 = 0; i3 < this.iX1O1; i3++) {
            int i4 = this.X0i1O;
            if (i4 == -1) {
                this.X1IX.setColor(-7829368);
            } else if (i3 <= i4) {
                this.X1IX.setColor(-1);
            } else {
                this.X1IX.setColor(-7829368);
            }
            int i5 = this.XXX11i;
            canvas.drawCircle(i2 + i5 + ((this.X11iII1O1 + (i5 * 2)) * i3), this.f55019I1 / 2, i5, this.X1IX);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.f55020IO = w;
        this.f55019I1 = h;
    }

    public PagerIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PagerIndicator(Context context) {
        this(context, null);
    }
}
