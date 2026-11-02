package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.gk4;
import com.sma.smartv3.pro.R;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressCalendarView extends View {
    public Context I1;
    public String[] IO;
    public int IO0II0i;
    public int IXOIIIO;
    public Paint Ii0X0X;
    public Calendar Ii1iii0;
    public int O001I;
    public int OO;
    public int OX110i;
    public OXO1 X00XIX1;
    public float X00Xi1X;
    public int X0i1O;
    public float X1;
    public Calendar X100O;
    public Calendar X11I;
    public int X11iII1O1;
    public int X1IX;
    public Paint XO0X10iO;
    public int XOX0O0;
    public int XX1Oi;
    public int XXO;
    public Rect XXX11i;
    public RectF XXiIiX10;
    public Map<Long, XIi00iiXO> i0X000X0O;
    public int i11I;
    public int iIXi1iiXI;
    public LinearLayout.LayoutParams iOiXi11II;
    public Paint iX1O1;
    public int iXiX011;
    public Date iXiiiO;
    public Calendar iiiO;

    public interface OXO1 {
        void onDateSelected(Calendar calendar, int year, int month, int day);

        void onInteractivePrompts(String msg);

        void onMonthChange(Calendar calendar, int year, int month, int day);
    }

    public static class XIi00iiXO {
        public int OXO1;
        public int XIi00iiXO;

        public XIi00iiXO(int progress, int color) {
            this.OXO1 = progress;
            this.XIi00iiXO = color;
        }
    }

    public ProgressCalendarView(Context context) {
        this(context, null);
    }

    public XIi00iiXO I0IIOi(long timestamp) {
        return this.i0X000X0O.get(Long.valueOf(timestamp));
    }

    public void I0iXXO() {
        OXO1(-1);
    }

    public void IO(int year, int month, int day) {
        Calendar r0 = Calendar.getInstance();
        r0.set(year, month, day);
        setDate(r0.getTime());
    }

    public final long IiI10X(long timestamp) {
        Calendar r0 = Calendar.getInstance();
        r0.setTimeInMillis(timestamp);
        r0.set(11, 0);
        r0.set(12, 0);
        r0.set(13, 0);
        r0.set(14, 0);
        return r0.getTimeInMillis();
    }

    public void O00() {
        this.i0X000X0O.clear();
        invalidate();
    }

    public void OIX0iXi(int year, int month, int day) {
        this.OX110i = year;
        this.OO = month;
        this.XOX0O0 = day;
        this.X100O.set(year, month, day);
    }

    public void OIi0(long timestamp) {
        this.i0X000X0O.remove(Long.valueOf(timestamp));
        invalidate();
    }

    public final void OXO1(int count) {
        Calendar.getInstance();
        Calendar r0 = Calendar.getInstance();
        r0.setTime(this.iXiiiO);
        r0.add(2, count);
        setDate(r0);
    }

    public void XIi00iiXO(long timestamp, int progress, int color) {
        this.i0X000X0O.put(Long.valueOf(timestamp), new XIi00iiXO(progress, color));
        invalidate();
    }

    public void XO0O10() {
        invalidate();
    }

    public final int XOO0ii0(float x, float y) {
        return ((((int) (y / this.iXiX011)) - 1) * 7) + ((int) (x / this.iIXi1iiXI));
    }

    public void XXI() {
        OXO1(1);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        int r0 = event.getAction();
        float r1 = event.getX();
        float r14 = event.getY();
        if (r0 != 1) goto L20;
        int r15 = XOO0ii0(r1, r14);
        if (r15 < 0) goto L20;
        if (r15 >= (this.O001I * 7)) goto L20;
        int r2 = (1 - this.XX1Oi) + r15;
        Calendar r16 = Calendar.getInstance();
        r16.set(this.IXOIIIO, this.IO0II0i, r2);
        if (r16.get(1) != this.IXOIIIO) goto L20;
        if (r16.get(2) != this.IO0II0i) goto L20;
        if (((((r16.getTimeInMillis() / 1000) / 60) / 60) / 24) <= ((((this.X100O.getTimeInMillis() / 1000) / 60) / 60) / 24)) goto L17;
        return true;
    L17:
        OXO1 r3 = this.X00XIX1;
        if (r3 == null) goto L20;
        r3.onDateSelected(r16, this.IXOIIIO, this.IO0II0i, r2);
        this.Ii1iii0.set(5, r2);
        setDate(this.Ii1iii0);
    L20:
        return true;
    }

    public Date getDate() {
        return this.iXiiiO;
    }

    public int getMaxProgress() {
        return this.i11I;
    }

    public void iO(Map<Long, XIi00iiXO> dataMap) {
        this.i0X000X0O.clear();
        this.i0X000X0O.putAll(dataMap);
        invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.iXiiiO != null) goto L6;
        setDate(Calendar.getInstance());
        return;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas r1 = canvas;
        super.onDraw(canvas);
        int r3 = 0;
    L4:
        if (r3 >= 7) goto L6;
        String r4 = this.IO[r3];
        int r5 = this.iIXi1iiXI;
        r1.drawText(r4, (r5 / 2) + (r5 * r3), this.XXO, this.iX1O1);
        r3 = r3 + 1;
        goto L4
    L6:
        this.X11I.setTime(this.iiiO.getTime());
        this.X11I.add(5, ((-this.O001I) + 1) * 7);
        Calendar r10 = Calendar.getInstance();
        int r11 = 0;
    L8:
        if (r11 >= (this.O001I * 7)) goto L48;
        this.X11I.add(5, 1);
        int r12 = this.X11I.get(5);
        int r13 = (r11 / 7) + 1;
        float r14 = (float) ((((double) (r11 % 7)) + 0.5d) * ((double) this.iIXi1iiXI));
        float r2 = (this.XXO + (this.iXiX011 * r13)) - (this.XXX11i.height() / 2);
        if (this.X11I.get(1) != this.IXOIIIO) goto L47;
        if (this.X11I.get(2) != this.IO0II0i) goto L47;
        if (this.X11I.get(1) == this.Ii1iii0.get(1)) goto L16;
    L36:
        this.XO0X10iO.setColor(gk4.iO(this.I1, R.color.color_E8E8E8));
        RectF r6 = this.XXiIiX10;
        float r7 = this.X00Xi1X;
        r6.set(r14 - r7, r2 - r7, r14 + r7, r2 + r7);
        r1.drawArc(this.XXiIiX10, -90.0f, 360.0f, false, this.XO0X10iO);
        long r8 = IiI10X(this.X11I.getTimeInMillis());
        if (this.i0X000X0O.containsKey(Long.valueOf(r8)) == false) goto L41;
        XIi00iiXO r9 = this.i0X000X0O.get(Long.valueOf(r8));
        int r15 = r9.OXO1;
        int r16 = r9.XIi00iiXO;
        float r17 = Math.min(1.0f, Math.max(0.0f, r15 / this.i11I));
        if (r17 <= 0.0f) goto L41;
        this.Ii0X0X.setColor(r16);
        r1 = canvas;
        r1.drawArc(this.XXiIiX10, -90.0f, r17 * 360.0f, false, this.Ii0X0X);
    L43:
        if (r10.getTime().getTime() <= this.X11I.getTime().getTime()) goto L45;
        this.iX1O1.setColor(gk4.iO(this.I1, R.color.text_color));
    L46:
        r1.drawText(r12 + "", r14, this.XXO + (r13 * this.iXiX011), this.iX1O1);
        goto L47
    L45:
        this.iX1O1.setColor(-7829368);
    L41:
        r1 = canvas;
        goto L43
    L16:
        if (this.X11I.get(2) != this.Ii1iii0.get(2)) goto L36;
        if (this.X11I.get(5) != this.Ii1iii0.get(5)) goto L36;
        if (this.X11I.get(1) <= this.X100O.get(1)) goto L23;
    L35:
        this.iX1O1.setStyle(Paint.Style.FILL);
        goto L36
    L23:
        if (this.X11I.get(1) != this.X100O.get(1)) goto L28;
        if (this.X11I.get(2) > this.X100O.get(2)) goto L35;
    L28:
        if (this.X11I.get(1) == this.X100O.get(1)) goto L30;
    L34:
        this.iX1O1.setColor(this.X11iII1O1);
        this.iX1O1.setStyle(Paint.Style.STROKE);
        r1.drawCircle(r14, r2, this.iX1O1.getTextSize(), this.iX1O1);
        goto L35
    L30:
        if (this.X11I.get(2) != this.X100O.get(2)) goto L34;
        if (this.X11I.get(5) <= this.X100O.get(5)) goto L34;
    L47:
        r11 = r11 + 1;
        goto L8
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int r1 = getMeasuredWidth();
        this.X1IX = r1;
        int r2 = r1 / 7;
        this.iIXi1iiXI = r2;
        this.X00Xi1X = r2 * 0.3f;
        float r3 = OXI1i1.XIi00iiXO(this.I1, 3.0f);
        this.X1 = r3;
        this.XO0X10iO.setStrokeWidth(r3);
        this.Ii0X0X.setStrokeWidth(this.X1);
    }

    public void setDate(Calendar cal) {
        setDate(cal.getTime());
    }

    public void setMax(Calendar cal) {
        OIX0iXi(cal.get(1), cal.get(2), cal.get(5));
    }

    public void setMaxProgress(int maxProgress) {
        this.i11I = maxProgress;
        invalidate();
    }

    public void setOnDateSelectedListener(OXO1 listener) {
        this.X00XIX1 = listener;
    }

    public ProgressCalendarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setDate(Date data) {
        Calendar r0 = Calendar.getInstance();
        r0.setTime(data);
        if (this.OX110i != (-1)) goto L5;
    L19:
        this.iXiiiO = data;
        this.Ii1iii0.setTime(data);
        this.IXOIIIO = this.Ii1iii0.get(1);
        this.IO0II0i = this.Ii1iii0.get(2);
        this.iiiO.setTime(data);
        Calendar r9 = this.iiiO;
        r9.add(5, (-r9.get(5)) + 1);
        int r10 = this.iiiO.get(7);
        if (r10 >= 2) goto L22;
        int r11 = 6;
    L23:
        this.XX1Oi = r11;
        this.iiiO.add(2, 1);
        this.iiiO.add(5, -1);
        int r12 = ((int) Math.ceil(((r11 + this.iiiO.get(5)) * 1.0f) / 7.0f)) + 1;
        this.O001I = r12;
        this.X0i1O = this.iXiX011 * r12;
        int r13 = this.iiiO.get(7);
        if (r13 >= 2) goto L26;
        int r14 = 0;
    L27:
        this.iiiO.add(5, r14);
        if (this.X00XIX1 == null) goto L32;
        Calendar r15 = Calendar.getInstance();
        r15.setTime(this.Ii1iii0.getTime());
        if (r15.getTime().getTime() >= this.X100O.getTime().getTime()) goto L32;
        this.X00XIX1.onMonthChange(r15, r15.get(1), r15.get(2), r15.get(5));
    L32:
        invalidate();
        return;
    L26:
        r14 = 8 - r13;
        goto L27
    L22:
        r11 = r10 - 2;
        goto L23
    L5:
        if (this.OO == (-1)) goto L19;
        int r1 = r0.get(1);
        int r2 = r0.get(2);
        int r5 = this.OX110i;
        if (r1 <= r5) goto L12;
        OXO1 r16 = this.X00XIX1;
        if (r16 == null) goto L34;
        r16.onInteractivePrompts(this.I1.getString(R.string.no_more));
        return;
    L34:
        return;
    L12:
        if (r1 != r5) goto L19;
        if (r2 <= this.OO) goto L19;
        OXO1 r17 = this.X00XIX1;
        if (r17 == null) goto L35;
        r17.onInteractivePrompts(this.I1.getString(R.string.no_more));
        return;
    }

    public ProgressCalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.iX1O1 = new Paint();
        this.XXX11i = new Rect();
        this.Ii1iii0 = Calendar.getInstance();
        this.iiiO = Calendar.getInstance();
        this.X11I = Calendar.getInstance();
        this.X100O = Calendar.getInstance();
        this.OX110i = -1;
        this.OO = -1;
        this.iOiXi11II = new LinearLayout.LayoutParams(0, 0);
        this.i0X000X0O = new HashMap();
        this.i11I = 100;
        this.XO0X10iO = new Paint();
        this.Ii0X0X = new Paint();
        this.XXiIiX10 = new RectF();
        this.X1 = 4.0f;
        this.I1 = context;
        this.IO = context.getResources().getStringArray(R.array.weekdays_s);
        this.iX1O1.setAntiAlias(true);
        this.iX1O1.setDither(true);
        this.iX1O1.setTextSize(OXI1i1.I0IIOi(context, 14.0f));
        this.iX1O1.setTextAlign(Paint.Align.CENTER);
        this.iX1O1.getTextBounds("日日日", 0, 1, this.XXX11i);
        this.iX1O1.setStrokeWidth(OXI1i1.XIi00iiXO(this.I1, 1.0f));
        int r5 = (int) (((double) this.XXX11i.height()) * 3.0d);
        this.iXiX011 = r5;
        this.XXO = (r5 / 2) + (this.XXX11i.height() / 2);
        this.X11iII1O1 = gk4.iO(context, R.color.colorAccent);
        setMax(Calendar.getInstance());
        this.XO0X10iO.setAntiAlias(true);
        Paint r4 = this.XO0X10iO;
        Paint.Style r6 = Paint.Style.STROKE;
        r4.setStyle(r6);
        this.XO0X10iO.setStrokeWidth(this.X1);
        this.XO0X10iO.setColor(gk4.iO(this.I1, R.color.color_E8E8E8));
        this.Ii0X0X.setAntiAlias(true);
        this.Ii0X0X.setStyle(r6);
        this.Ii0X0X.setStrokeWidth(this.X1);
        this.Ii0X0X.setStrokeCap(Paint.Cap.ROUND);
        XO0O10();
    }
}
