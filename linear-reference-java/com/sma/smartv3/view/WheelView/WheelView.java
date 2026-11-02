package com.sma.smartv3.view.WheelView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.eg1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.mn4;
import com.android.mltcode.paycertificationapi.w4;
import com.android.mltcode.paycertificationapi.zw;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class WheelView extends View {
    public Context I1;
    public float IO;
    public int IO0II0i;
    public int IXI;
    public int IXOIIIO;
    public int Ii0X0X;
    public int Ii0i;
    public int Ii1iii0;
    public int IiiXiI0I;
    public Paint O001I;
    public boolean OO;
    public float OX110i;
    public int X00XIX1;
    public int X00Xi1X;
    public ScheduledFuture<?> X0i1O;
    public int X1;
    public int X100O;
    public int X11I;
    public GestureDetector X11iII1O1;
    public ScheduledExecutorService X1IX;
    public int XO0X10iO;
    public float XOIX;
    public Rect XOO0XOOii;
    public int XOX0O0;
    public long XOXiX0;
    public int XX1Oi;
    public List<String> XXO;
    public dg1 XXX11i;
    public int XXiIiX10;
    public int i0X000X0O;
    public int i11I;
    public Paint iIXi1iiXI;
    public int iOiXi11II;
    public Handler iX1O1;
    public Paint iXiX011;
    public int iXiiiO;
    public int iiiO;

    public static final enum ACTION extends Enum<ACTION> {
        private static final /* synthetic */ ACTION[] $VALUES = null;
        public static final ACTION CLICK = null;
        public static final ACTION DAGGLE = null;
        public static final ACTION FLING = null;

        private static /* synthetic */ ACTION[] $values() {
            return new ACTION[]{CLICK, FLING, DAGGLE};
        }

        static {
            CLICK = new ACTION("CLICK", 0);
            FLING = new ACTION("FLING", 1);
            DAGGLE = new ACTION("DAGGLE", 2);
            $VALUES = $values();
        }

        private ACTION(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public static ACTION valueOf(String name) {
            return (ACTION) Enum.valueOf(ACTION.class, name);
        }

        public static ACTION[] values() {
            return (ACTION[]) $VALUES.clone();
        }
    }

    public WheelView(Context context) {
        super(context);
        this.IO = 1.15f;
        this.X1IX = Executors.newSingleThreadScheduledExecutor();
        this.IXOIIIO = 0;
        this.IO0II0i = 0;
        this.IiiXiI0I = 0;
        this.XOXiX0 = 0;
        this.XOO0XOOii = new Rect();
        iO(context);
    }

    public final void I0IIOi(float velocityY) {
        OXO1();
        this.X0i1O = this.X1IX.scheduleWithFixedDelay(new w4(this, velocityY), 0, 10, TimeUnit.MILLISECONDS);
    }

    public void IO(int left, int top, int right, int bottom) {
        this.IXOIIIO = left;
        this.IO0II0i = right;
    }

    public final void IiI10X() {
        if (this.XXX11i == null) goto L6;
        postDelayed(new eg1(this), 50);
        return;
    }

    public final void O00() {
        int r1 = 0;
    L4:
        if (r1 >= this.XXO.size()) goto L9;
        String r2 = this.XXO.get(r1);
        this.iXiX011.getTextBounds(r2, 0, r2.length(), this.XOO0XOOii);
        this.iXiX011.getTextBounds("星期", 0, 2, this.XOO0XOOii);
        int r3 = this.XOO0XOOii.height();
        if (r3 <= this.iiiO) goto L8;
        this.iiiO = r3;
    L8:
        r1 = r1 + 1;
        goto L4
    }

    public void OIX0iXi(ACTION action) {
        OXO1();
        if (action != ACTION.FLING) goto L5;
    L6:
        float r8 = this.OX110i * this.iiiO;
        int r0 = (int) (((this.X00XIX1 % r8) + r8) % r8);
        this.IiiXiI0I = r0;
        if (r0 <= (r8 / 2.0f)) goto L9;
        this.IiiXiI0I = (int) (r8 - r0);
    L10:
        this.X0i1O = this.X1IX.scheduleWithFixedDelay(new mn4(this, this.IiiXiI0I), 0, 10, TimeUnit.MILLISECONDS);
        return;
    L9:
        this.IiiXiI0I = -r0;
        goto L10
    L5:
        if (action != ACTION.DAGGLE) goto L10;
        goto L6
    }

    public final void OIi0() {
        this.OO = false;
    }

    public void OXO1() {
        ScheduledFuture<?> r0 = this.X0i1O;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isCancelled() == true) goto L9;
        this.X0i1O.cancel(true);
        this.X0i1O = null;
        return;
    }

    public final int XIi00iiXO(String a, Paint paint, Rect rect) {
        paint.getTextBounds(a, 0, a.length(), rect);
        int r3 = rect.width();
        return Math.max((this.X1 - r3) / 2, 0);
    }

    public final void XO0O10() {
        Paint r0 = new Paint();
        this.iIXi1iiXI = r0;
        r0.setColor(this.X11I);
        this.iIXi1iiXI.setAntiAlias(true);
        Paint r1 = this.iIXi1iiXI;
        iiOI111I r2 = iiOI111I.OXO1;
        MyTypeface r3 = MyTypeface.DIN_COND_BOLD;
        r1.setTypeface(r2.OXO1(r3, this.I1));
        this.iIXi1iiXI.setTextSize(this.iXiiiO);
        Paint r4 = new Paint();
        this.iXiX011 = r4;
        r4.setColor(this.X100O);
        this.iXiX011.setAntiAlias(true);
        this.iXiX011.setTextScaleX(this.IO);
        this.iXiX011.setTypeface(r2.OXO1(r3, this.I1));
        this.iXiX011.setTextSize(this.iXiiiO);
        Paint r5 = new Paint();
        this.O001I = r5;
        r5.setColor(this.XX1Oi);
        this.O001I.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final void XOO0ii0() {
        if (this.XXO != null) goto L5;
        return;
    L5:
        O00();
        int r0 = this.iiiO;
        float r2 = this.OX110i;
        int r1 = (int) ((r0 * r2) * (this.XXiIiX10 - 1));
        this.Ii0i = r1;
        int r3 = (int) (((double) (r1 * 2)) / 3.141592653589793d);
        this.X00Xi1X = r3;
        this.IXI = (int) (((double) r1) / 3.141592653589793d);
        this.XOX0O0 = (int) ((r3 - (r0 * r2)) / 2.0f);
        this.iOiXi11II = (int) ((r3 + (r2 * r0)) / 2.0f);
        if (this.i0X000X0O == (-1)) goto L8;
    L11:
        this.XO0X10iO = this.i0X000X0O;
        return;
    L8:
        if (this.OO == false) goto L10;
        this.i0X000X0O = (this.XXO.size() + 1) / 2;
        goto L11
    L10:
        this.i0X000X0O = 0;
        goto L11
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return this.IXOIIIO;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return this.IO0II0i;
    }

    public final int getSelectedItem() {
        return this.i11I;
    }

    public final void iO(Context context) {
        gk4.I0IIOi = isInEditMode();
        this.I1 = context;
        this.iX1O1 = new OXO1(this);
        GestureDetector r0 = new GestureDetector(context, new zw(this));
        this.X11iII1O1 = r0;
        r0.setIsLongpressEnabled(false);
        this.OX110i = 2.0f;
        this.OO = true;
        this.XXiIiX10 = 7;
        this.X11I = -5263441;
        this.X100O = gk4.iO(context, R.color.colorAccent);
        this.XX1Oi = -3815995;
        this.X00XIX1 = 0;
        this.i0X000X0O = -1;
        XO0O10();
        setTextSize(24.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        List<String> r0 = this.XXO;
        if (r0 == null) goto L62;
        String[] r1 = new String[this.XXiIiX10];
        int r2 = (int) (this.X00XIX1 / (this.OX110i * this.iiiO));
        this.Ii0X0X = r2;
        int r3 = this.i0X000X0O + (r2 % r0.size());
        this.XO0X10iO = r3;
        if (this.OO == true) goto L12;
        if (r3 >= 0) goto L10;
        this.XO0X10iO = 0;
    L10:
        if (this.XO0X10iO <= (this.XXO.size() - 1)) goto L17;
        this.XO0X10iO = this.XXO.size() - 1;
    L17:
        int r4 = (int) (this.X00XIX1 % (this.OX110i * this.iiiO));
        int r5 = 0;
    L18:
        int r6 = this.XXiIiX10;
        if (r5 >= r6) goto L36;
        int r7 = this.XO0X10iO - ((r6 / 2) - r5);
        if (this.OO == false) goto L29;
    L22:
        if (r7 >= 0) goto L25;
        r7 = r7 + this.XXO.size();
    L25:
        if (r7 <= (this.XXO.size() - 1)) goto L27;
        r7 = r7 - this.XXO.size();
        goto L25
    L27:
        r1[r5] = this.XXO.get(r7);
    L35:
        r5 = r5 + 1;
        goto L18
    L29:
        if (r7 >= 0) goto L32;
        r1[r5] = "";
        goto L35
    L32:
        if (r7 <= (this.XXO.size() - 1)) goto L34;
        r1[r5] = "";
        goto L35
    L34:
        r1[r5] = this.XXO.get(r7);
        goto L35
    L36:
        int r8 = 0;
    L38:
        if (r8 >= this.XXiIiX10) goto L73;
        canvas.save();
        float r9 = this.iiiO * this.OX110i;
        double r10 = (((double) ((r8 * r9) - r4)) * 3.141592653589793d) / ((double) this.Ii0i);
        float r11 = (float) (90.0d - ((r10 / 3.141592653589793d) * 180.0d));
        if (r11 < 90.0f) goto L42;
    L60:
        canvas.restore();
    L61:
        r8 = r8 + 1;
        goto L38
    L42:
        if (r11 <= (-90.0f)) goto L60;
        int r12 = (int) ((((double) this.IXI) - (Math.cos(r10) * ((double) this.IXI))) - ((Math.sin(r10) * ((double) this.iiiO)) / 2.0d));
        canvas.translate(0.0f, r12);
        canvas.scale(1.0f, (float) Math.sin(r10));
        int r13 = this.XOX0O0;
        if (r12 <= r13) goto L47;
    L49:
        int r14 = this.iOiXi11II;
        if (r12 <= r14) goto L52;
    L54:
        if (r12 >= r13) goto L56;
    L58:
        canvas.clipRect(0, 0, this.X1, (int) r9);
        String r15 = r1[r8];
        canvas.drawText(r15, XIi00iiXO(r15, this.iIXi1iiXI, this.XOO0XOOii), this.iiiO, this.iIXi1iiXI);
    L59:
        canvas.restore();
        goto L61
    L56:
        if ((this.iiiO + r12) > r14) goto L58;
        canvas.clipRect(0, 0, this.X1, (int) r9);
        String r16 = r1[r8];
        canvas.drawText(r16, XIi00iiXO(r16, this.iXiX011, this.XOO0XOOii), this.iiiO, this.iXiX011);
        this.i11I = this.XXO.indexOf(r1[r8]);
        goto L59
    L52:
        if ((this.iiiO + r12) < r14) goto L54;
        canvas.save();
        canvas.clipRect(0, 0, this.X1, this.iOiXi11II - r12);
        String r17 = r1[r8];
        canvas.drawText(r17, XIi00iiXO(r17, this.iXiX011, this.XOO0XOOii), this.iiiO, this.iXiX011);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, this.iOiXi11II - r12, this.X1, (int) r9);
        String r18 = r1[r8];
        canvas.drawText(r18, XIi00iiXO(r18, this.iIXi1iiXI, this.XOO0XOOii), this.iiiO, this.iIXi1iiXI);
        canvas.restore();
        goto L59
    L47:
        if ((this.iiiO + r12) < r13) goto L49;
        canvas.save();
        canvas.clipRect(0, 0, this.X1, this.XOX0O0 - r12);
        String r19 = r1[r8];
        canvas.drawText(r19, XIi00iiXO(r19, this.iIXi1iiXI, this.XOO0XOOii), this.iiiO, this.iIXi1iiXI);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, this.XOX0O0 - r12, this.X1, (int) r9);
        String r20 = r1[r8];
        canvas.drawText(r20, XIi00iiXO(r20, this.iXiX011, this.XOO0XOOii), this.iiiO, this.iXiX011);
        canvas.restore();
        goto L59
    L73:
        return;
    L12:
        if (r3 >= 0) goto L15;
        this.XO0X10iO = this.XXO.size() + this.XO0X10iO;
    L15:
        if (this.XO0X10iO <= (this.XXO.size() - 1)) goto L17;
        this.XO0X10iO -= this.XXO.size();
        goto L17
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        XOO0ii0();
        int r1 = getMeasuredWidth();
        this.X1 = r1;
        setMeasuredDimension(r1, this.X00Xi1X);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean r0 = this.X11iII1O1.onTouchEvent(event);
        float r1 = this.OX110i * this.iiiO;
        int r2 = event.getAction();
        if (r2 != 0) goto L5;
        this.XOXiX0 = System.currentTimeMillis();
        OXO1();
        this.XOIX = event.getRawY();
    L20:
        invalidate();
        return true;
    L5:
        if (r2 == 2) goto L11;
        if (r0 == true) goto L20;
        float r10 = event.getY();
        int r3 = this.IXI;
        int r11 = (int) (((Math.acos((r3 - r10) / r3) * ((double) this.IXI)) + ((double) (r1 / 2.0f))) / ((double) r1));
        this.IiiXiI0I = (int) (((r11 - (this.XXiIiX10 / 2)) * r1) - (((this.X00XIX1 % r1) + r1) % r1));
        if ((System.currentTimeMillis() - this.XOXiX0) <= 120) goto L10;
        OIX0iXi(ACTION.DAGGLE);
        goto L20
    L10:
        OIX0iXi(ACTION.CLICK);
        goto L20
    L11:
        float r4 = this.XOIX - event.getRawY();
        this.XOIX = event.getRawY();
        this.X00XIX1 = (int) (this.X00XIX1 + r4);
        if (this.OO == true) goto L20;
        float r12 = (-this.i0X000X0O) * r1;
        float r5 = ((this.XXO.size() - 1) - this.i0X000X0O) * r1;
        int r6 = this.X00XIX1;
        if (r6 >= r12) goto L17;
        this.X00XIX1 = (int) r12;
        goto L20
    L17:
        if (r6 <= r5) goto L20;
        this.X00XIX1 = (int) r5;
        goto L20
    }

    public final void setInitPosition(int initPosition) {
        this.X00XIX1 = 0;
        if (initPosition >= 0) goto L6;
        this.i0X000X0O = 0;
        return;
    L6:
        this.i0X000X0O = initPosition;
    }

    public final void setItems(List<String> items) {
        this.XXO = items;
        if (this.i0X000X0O <= (items.size() - 1)) goto L5;
        this.i0X000X0O = items.size() - 1;
    L5:
        XOO0ii0();
        invalidate();
    }

    public final void setListener(dg1 OnItemSelectedListener) {
        this.XXX11i = OnItemSelectedListener;
    }

    @Override // android.view.View
    public final void setScaleX(float scaleX) {
        if (scaleX <= 0.0f) goto L6;
        this.IO = scaleX;
        this.iXiX011.setTextScaleX(scaleX);
        return;
    }

    public final void setTextSize(float size) {
        if (size <= 0.0f) goto L6;
        int r2 = (int) (this.I1.getResources().getDisplayMetrics().density * size);
        this.iXiiiO = r2;
        this.iIXi1iiXI.setTextSize(r2);
        this.iXiX011.setTextSize(this.iXiiiO);
        return;
    }

    public void setVisibleCount(int count) {
        this.XXiIiX10 = count + 2;
    }

    public WheelView(Context context, AttributeSet attributeset) {
        super(context, attributeset);
        this.IO = 1.15f;
        this.X1IX = Executors.newSingleThreadScheduledExecutor();
        this.IXOIIIO = 0;
        this.IO0II0i = 0;
        this.IiiXiI0I = 0;
        this.XOXiX0 = 0;
        this.XOO0XOOii = new Rect();
        iO(context);
    }

    public WheelView(Context context, AttributeSet attributeset, int defStyleAttr) {
        super(context, attributeset, defStyleAttr);
        this.IO = 1.15f;
        this.X1IX = Executors.newSingleThreadScheduledExecutor();
        this.IXOIIIO = 0;
        this.IO0II0i = 0;
        this.IiiXiI0I = 0;
        this.XOXiX0 = 0;
        this.XOO0XOOii = new Rect();
        iO(context);
    }
}
