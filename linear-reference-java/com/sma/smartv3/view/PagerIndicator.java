package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class PagerIndicator extends View {
    public static final long iXiX011 = 600;
    public int I1;
    public int IO;
    public int X0i1O;
    public int X11iII1O1;
    public Paint X1IX;
    public int XXX11i;
    public Runnable iIXi1iiXI;
    public int iX1O1;

    public class OXO1 implements Runnable {
        public final /* synthetic */ PagerIndicator IO;

        public OXO1(final PagerIndicator this$0) {
            this.IO = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            PagerIndicator r0 = this.IO;
            PagerIndicator.iO(r0, PagerIndicator.XIi00iiXO(r0) + 1);
            if (PagerIndicator.XIi00iiXO(this.IO) != PagerIndicator.OXO1(this.IO)) goto L5;
            PagerIndicator.iO(this.IO, -1);
        L5:
            this.IO.invalidate();
            this.IO.postDelayed(this, 600);
        }
    }

    public PagerIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.iX1O1 = 5;
        this.X11iII1O1 = 40;
        this.XXX11i = 8;
        this.X0i1O = -1;
        this.iIXi1iiXI = new OXO1(this);
        Paint r1 = new Paint();
        this.X1IX = r1;
        r1.setAntiAlias(true);
        this.X1IX.setDither(true);
        this.X1IX.setStrokeWidth(4.0f);
    }

    public static /* bridge */ /* synthetic */ int OXO1(PagerIndicator r0) {
        return r0.iX1O1;
    }

    public static /* bridge */ /* synthetic */ int XIi00iiXO(PagerIndicator r0) {
        return r0.X0i1O;
    }

    public static /* bridge */ /* synthetic */ void iO(PagerIndicator r0, int r1) {
        r0.X0i1O = r1;
    }

    public void XO0O10(boolean start) {
        this.X0i1O = -1;
        invalidate();
        if (start == false) goto L6;
        postDelayed(this.iIXi1iiXI, 600);
        return;
    L6:
        removeCallbacks(this.iIXi1iiXI);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float r0 = this.IO / 2;
        int r1 = this.iX1O1;
        int r2 = (int) (r0 - ((this.XXX11i * r1) + ((this.X11iII1O1 * (r1 - 1.0f)) / 2.0f)));
        int r3 = 0;
    L4:
        if (r3 >= this.iX1O1) goto L12;
        int r4 = this.X0i1O;
        if (r4 != (-1)) goto L8;
        this.X1IX.setColor(-7829368);
    L11:
        int r5 = this.XXX11i;
        canvas.drawCircle((r2 + r5) + ((this.X11iII1O1 + (r5 * 2)) * r3), this.I1 / 2, r5, this.X1IX);
        r3 = r3 + 1;
        goto L4
    L8:
        if (r3 > r4) goto L10;
        this.X1IX.setColor(-1);
        goto L11
    L10:
        this.X1IX.setColor(-7829368);
        goto L11
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.IO = w;
        this.I1 = h;
    }

    public PagerIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PagerIndicator(Context context) {
        this(context, null);
    }
}
