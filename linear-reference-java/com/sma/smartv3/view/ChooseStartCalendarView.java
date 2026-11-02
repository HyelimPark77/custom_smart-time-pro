package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.ck4;
import com.android.mltcode.paycertificationapi.hl4;
import com.sma.smartv3.pro.R;
import java.util.Calendar;
import java.util.Date;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public class ChooseStartCalendarView extends SkinCompatView {
    public String[] I1;
    public Date Ii1iii0;
    public int O001I;
    public int OO;
    public Calendar OX110i;
    public int X00XIX1;
    public int X0i1O;
    public Calendar X100O;
    public Calendar X11I;
    public Paint X11iII1O1;
    public Rect X1IX;
    public int XOX0O0;
    public Calendar XX1Oi;
    public int XXO;
    public int XXX11i;
    public LinearLayout.LayoutParams i0X000X0O;
    public OXO1 i11I;
    public int iIXi1iiXI;
    public int iOiXi11II;
    public Context iX1O1;
    public int iXiX011;
    public int iXiiiO;
    public Calendar iiiO;

    public interface OXO1 {
        void onDateSelected(Calendar calendar, int year, int month, int day);

        void onInteractivePrompts(String msg);

        void onMonthChange(Calendar calendar, int year, int month, int day);
    }

    public ChooseStartCalendarView(Context context) {
        this(context, null);
    }

    private void OXO1(int count) {
        Calendar.getInstance();
        Calendar r0 = Calendar.getInstance();
        r0.setTime(this.Ii1iii0);
        r0.add(2, count);
        setDate(r0);
    }

    private int XIi00iiXO(float x, float y) {
        return ((((int) (y / this.O001I)) - 1) * 7) + ((int) (x / this.iXiX011));
    }

    private int iO(int resId) {
        return ck4.XIi00iiXO(resId);
    }

    public void IiI10X() {
        OXO1(-1);
    }

    public void O00(int year, int month, int day) {
        this.XOX0O0 = year;
        this.iOiXi11II = month;
        this.X00XIX1 = day;
        this.XX1Oi.set(year, month, day);
    }

    public void XO0O10(int year, int month, int day) {
        Calendar r0 = Calendar.getInstance();
        r0.set(year, month, day);
        setDate(r0.getTime());
    }

    public void XOO0ii0() {
        OXO1(1);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        int r1 = event.getAction();
        float r2 = event.getX();
        float r3 = event.getY();
        if (r1 != 1) goto L16;
        int r4 = XIi00iiXO(r2, r3);
        if (r4 < 0) goto L16;
        if (r4 >= (this.XXO * 7)) goto L16;
        if (this.i11I == null) goto L16;
        int r5 = this.iiiO.get(1);
        int r6 = this.iiiO.get(2);
        int r7 = (1 - this.OO) + r4;
        Calendar r8 = Calendar.getInstance();
        r8.set(r5, r6, r7);
        if (((((r8.getTimeInMillis() / 1000) / 60) / 60) / 24) >= ((((this.XX1Oi.getTimeInMillis() / 1000) / 60) / 60) / 24)) goto L16;
        if (((((r8.getTimeInMillis() / 1000) / 60) / 60) / 24) < ((((this.OX110i.getTimeInMillis() / 1000) / 60) / 60) / 24)) goto L16;
        this.i11I.onDateSelected(r8, r5, r6, r7);
        this.iiiO.set(5, (1 - this.OO) + r4);
        setDate(this.iiiO);
    L16:
        return true;
    }

    public Date getDate() {
        return this.Ii1iii0;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Ii1iii0 != null) goto L6;
        setDate(Calendar.getInstance());
        return;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LinearLayout.LayoutParams r2 = this.i0X000X0O;
        r2.width = this.X0i1O;
        r2.height = this.iIXi1iiXI;
        setLayoutParams(r2);
        this.X11iII1O1.setColor(hl4.XIi00iiXO(this.iX1O1, R.color.colorAccent));
        int r3 = 0;
        int r4 = 0;
    L3:
        int r5 = 7;
        if (r4 >= 7) goto L6;
        String r6 = this.I1[r4];
        int r7 = this.iXiX011;
        canvas.drawText(r6, (r7 / 2) + (r7 * r4), this.iXiiiO, this.X11iII1O1);
        r4 = r4 + 1;
        goto L3
    L6:
        this.X100O.setTime(this.X11I.getTime());
        this.X100O.add(5, ((-this.XXO) + 1) * 7);
        Calendar.getInstance();
    L8:
        if (r3 >= (this.XXO * r5)) goto L30;
        this.X100O.add(5, 1);
        int r8 = this.X100O.get(5);
        int r9 = r3 % 7;
        int r10 = (r3 / 7) + 1;
        this.X11iII1O1.setStyle(Paint.Style.FILL);
        if (this.X100O.get(1) != this.iiiO.get(1)) goto L17;
        if (this.X100O.get(2) != this.iiiO.get(2)) goto L17;
        if (this.X100O.get(5) != this.iiiO.get(5)) goto L17;
        this.X11iII1O1.setColor(this.XXX11i);
        canvas.drawCircle((float) ((((double) r9) + 0.5d) * ((double) this.iXiX011)), (this.iXiiiO + (this.O001I * r10)) - (this.X1IX.height() / 2), this.X11iII1O1.getTextSize(), this.X11iII1O1);
    L17:
        if (((((this.X100O.getTimeInMillis() / 1000) / 60) / 60) / 24) < ((((this.XX1Oi.getTimeInMillis() / 1000) / 60) / 60) / 24)) goto L19;
    L28:
        this.X11iII1O1.setColor(-7829368);
    L29:
        canvas.drawText(r8 + "", (float) ((((double) r9) + 0.5d) * ((double) this.iXiX011)), this.iXiiiO + (r10 * this.O001I), this.X11iII1O1);
        r3 = r3 + 1;
        r5 = 7;
        goto L8
    L19:
        if (((((this.X100O.getTimeInMillis() / 1000) / 60) / 60) / 24) < ((((this.OX110i.getTimeInMillis() / 1000) / 60) / 60) / 24)) goto L28;
        if (this.X100O.get(1) == this.iiiO.get(1)) goto L23;
    L27:
        this.X11iII1O1.setColor(hl4.XIi00iiXO(this.iX1O1, R.color.text_color));
        goto L29
    L23:
        if (this.X100O.get(2) != this.iiiO.get(2)) goto L27;
        if (this.X100O.get(5) != this.iiiO.get(5)) goto L27;
        this.X11iII1O1.setColor(hl4.XIi00iiXO(this.iX1O1, R.color.light));
        goto L29
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int r1 = getMeasuredWidth();
        this.X0i1O = r1;
        this.iXiX011 = r1 / 7;
    }

    public void setDate(Calendar cal) {
        setDate(cal.getTime());
    }

    public void setMax(Calendar cal) {
        O00(cal.get(1), cal.get(2), cal.get(5));
    }

    public void setMin(Calendar cal) {
        this.OX110i.set(cal.get(1), cal.get(2), cal.get(5));
    }

    public void setOnDateSelectedListener(OXO1 listener) {
        this.i11I = listener;
    }

    public ChooseStartCalendarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setDate(Date data) {
        Calendar.getInstance().setTime(data);
        this.Ii1iii0 = data;
        this.iiiO.setTime(data);
        this.X11I.setTime(data);
        Calendar r7 = this.X11I;
        r7.add(5, (-r7.get(5)) + 1);
        int r8 = this.X11I.get(7);
        if (r8 >= 2) goto L5;
        int r9 = 6;
    L6:
        this.OO = r9;
        this.X11I.add(2, 1);
        this.X11I.add(5, -1);
        int r10 = ((int) Math.ceil(((r9 + this.X11I.get(5)) * 1.0f) / 7.0f)) + 1;
        this.XXO = r10;
        this.iIXi1iiXI = this.O001I * r10;
        int r11 = this.X11I.get(7);
        if (r11 >= 2) goto L9;
        int r12 = 0;
    L10:
        this.X11I.add(5, r12);
        if (this.i11I == null) goto L13;
        Calendar r13 = Calendar.getInstance();
        r13.setTime(this.iiiO.getTime());
        this.i11I.onMonthChange(r13, r13.get(1), r13.get(2), r13.get(5));
    L13:
        invalidate();
        return;
    L9:
        r12 = 8 - r11;
        goto L10
    L5:
        r9 = r8 - 2;
        goto L6
    }

    public ChooseStartCalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.X11iII1O1 = new Paint();
        this.X1IX = new Rect();
        this.iiiO = Calendar.getInstance();
        this.X11I = Calendar.getInstance();
        this.X100O = Calendar.getInstance();
        this.XX1Oi = Calendar.getInstance();
        this.OX110i = Calendar.getInstance();
        this.XOX0O0 = -1;
        this.iOiXi11II = -1;
        this.i0X000X0O = new LinearLayout.LayoutParams(0, 0);
        this.iX1O1 = context;
        this.I1 = context.getResources().getStringArray(R.array.weekdays_s);
        this.X11iII1O1.setAntiAlias(true);
        this.X11iII1O1.setDither(true);
        this.X11iII1O1.setTextSize(OXI1i1.I0IIOi(context, 14.0f));
        this.X11iII1O1.setTextAlign(Paint.Align.CENTER);
        this.X11iII1O1.getTextBounds("日日日", 0, 1, this.X1IX);
        this.X11iII1O1.setStrokeWidth(OXI1i1.XIi00iiXO(this.iX1O1, 1.0f));
        int r5 = (int) (((double) this.X1IX.height()) * 3.0d);
        this.O001I = r5;
        this.iXiiiO = (r5 / 2) + (this.X1IX.height() / 2);
        this.XXX11i = ContextCompat.getColor(context, iO(R.color.colorAccent));
        setMax(Calendar.getInstance());
        applySkin();
    }
}
