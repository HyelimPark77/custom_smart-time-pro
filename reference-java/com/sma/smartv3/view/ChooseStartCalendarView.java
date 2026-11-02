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

    /* JADX INFO: renamed from: I1 */
    public String[] f54962I1;
    public Date Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    public int f54963OO;
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
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.Ii1iii0);
        calendar.add(2, count);
        setDate(calendar);
    }

    private int XIi00iiXO(float x, float y) {
        return ((((int) (y / this.O001I)) - 1) * 7) + ((int) (x / this.iXiX011));
    }

    /* JADX INFO: renamed from: iO */
    private int m38876iO(int resId) {
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
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        setDate(calendar.getTime());
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
        int iXIi00iiXO;
        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();
        if (action == 1 && (iXIi00iiXO = XIi00iiXO(x, y)) >= 0 && iXIi00iiXO < this.XXO * 7 && this.i11I != null) {
            int i = this.iiiO.get(1);
            int i2 = this.iiiO.get(2);
            int i3 = (1 - this.f54963OO) + iXIi00iiXO;
            Calendar calendar = Calendar.getInstance();
            calendar.set(i, i2, i3);
            if ((((calendar.getTimeInMillis() / 1000) / 60) / 60) / 24 < (((this.XX1Oi.getTimeInMillis() / 1000) / 60) / 60) / 24 && (((calendar.getTimeInMillis() / 1000) / 60) / 60) / 24 >= (((this.OX110i.getTimeInMillis() / 1000) / 60) / 60) / 24) {
                this.i11I.onDateSelected(calendar, i, i2, i3);
                this.iiiO.set(5, (1 - this.f54963OO) + iXIi00iiXO);
                setDate(this.iiiO);
            }
        }
        return true;
    }

    public Date getDate() {
        return this.Ii1iii0;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Ii1iii0 == null) {
            setDate(Calendar.getInstance());
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        LinearLayout.LayoutParams layoutParams = this.i0X000X0O;
        layoutParams.width = this.X0i1O;
        layoutParams.height = this.iIXi1iiXI;
        setLayoutParams(layoutParams);
        this.X11iII1O1.setColor(hl4.XIi00iiXO(this.iX1O1, R.color.colorAccent));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 7) {
                break;
            }
            String str = this.f54962I1[i3];
            int i4 = this.iXiX011;
            canvas.drawText(str, (i4 / 2) + (i4 * i3), this.iXiiiO, this.X11iII1O1);
            i3++;
        }
        this.X100O.setTime(this.X11I.getTime());
        this.X100O.add(5, ((-this.XXO) + 1) * 7);
        Calendar.getInstance();
        for (i = 7; i2 < this.XXO * i; i = 7) {
            this.X100O.add(5, 1);
            int i5 = this.X100O.get(5);
            int i6 = i2 % 7;
            int i7 = (i2 / 7) + 1;
            this.X11iII1O1.setStyle(Paint.Style.FILL);
            if (this.X100O.get(1) == this.iiiO.get(1) && this.X100O.get(2) == this.iiiO.get(2) && this.X100O.get(5) == this.iiiO.get(5)) {
                this.X11iII1O1.setColor(this.XXX11i);
                canvas.drawCircle((float) ((((double) i6) + 0.5d) * ((double) this.iXiX011)), (this.iXiiiO + (this.O001I * i7)) - (this.X1IX.height() / 2), this.X11iII1O1.getTextSize(), this.X11iII1O1);
            }
            if ((((this.X100O.getTimeInMillis() / 1000) / 60) / 60) / 24 >= (((this.XX1Oi.getTimeInMillis() / 1000) / 60) / 60) / 24 || (((this.X100O.getTimeInMillis() / 1000) / 60) / 60) / 24 < (((this.OX110i.getTimeInMillis() / 1000) / 60) / 60) / 24) {
                this.X11iII1O1.setColor(-7829368);
            } else if (this.X100O.get(1) == this.iiiO.get(1) && this.X100O.get(2) == this.iiiO.get(2) && this.X100O.get(5) == this.iiiO.get(5)) {
                this.X11iII1O1.setColor(hl4.XIi00iiXO(this.iX1O1, R.color.light));
            } else {
                this.X11iII1O1.setColor(hl4.XIi00iiXO(this.iX1O1, R.color.text_color));
            }
            canvas.drawText(i5 + "", (float) ((((double) i6) + 0.5d) * ((double) this.iXiX011)), this.iXiiiO + (i7 * this.O001I), this.X11iII1O1);
            i2++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        this.X0i1O = measuredWidth;
        this.iXiX011 = measuredWidth / 7;
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
        Calendar calendar = this.X11I;
        calendar.add(5, (-calendar.get(5)) + 1);
        int i = this.X11I.get(7);
        int i2 = i < 2 ? 6 : i - 2;
        this.f54963OO = i2;
        this.X11I.add(2, 1);
        this.X11I.add(5, -1);
        int iCeil = ((int) Math.ceil(((i2 + this.X11I.get(5)) * 1.0f) / 7.0f)) + 1;
        this.XXO = iCeil;
        this.iIXi1iiXI = this.O001I * iCeil;
        int i3 = this.X11I.get(7);
        this.X11I.add(5, i3 < 2 ? 0 : 8 - i3);
        if (this.i11I != null) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(this.iiiO.getTime());
            this.i11I.onMonthChange(calendar2, calendar2.get(1), calendar2.get(2), calendar2.get(5));
        }
        invalidate();
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
        this.f54962I1 = context.getResources().getStringArray(R.array.weekdays_s);
        this.X11iII1O1.setAntiAlias(true);
        this.X11iII1O1.setDither(true);
        this.X11iII1O1.setTextSize(OXI1i1.I0IIOi(context, 14.0f));
        this.X11iII1O1.setTextAlign(Paint.Align.CENTER);
        this.X11iII1O1.getTextBounds("日日日", 0, 1, this.X1IX);
        this.X11iII1O1.setStrokeWidth(OXI1i1.XIi00iiXO(this.iX1O1, 1.0f));
        int iHeight = (int) (((double) this.X1IX.height()) * 3.0d);
        this.O001I = iHeight;
        this.iXiiiO = (iHeight / 2) + (this.X1IX.height() / 2);
        this.XXX11i = ContextCompat.getColor(context, m38876iO(R.color.colorAccent));
        setMax(Calendar.getInstance());
        applySkin();
    }
}
