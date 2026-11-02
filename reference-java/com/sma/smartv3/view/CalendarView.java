package com.sma.smartv3.view;

import android.content.Context;
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
public class CalendarView extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public String[] f54960I1;
    public Date Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    public int f54961OO;
    public int OX110i;
    public LinearLayout.LayoutParams X00XIX1;
    public int X0i1O;
    public Calendar X100O;
    public Calendar X11I;
    public Paint X11iII1O1;
    public Rect X1IX;
    public int XOX0O0;
    public Calendar XX1Oi;
    public int XXO;
    public int XXX11i;
    public OXO1 i0X000X0O;
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

    public CalendarView(Context context) {
        this(context, null);
    }

    public void IiI10X() {
        OXO1(-1);
    }

    public void O00(int year, int month, int day) {
        this.f54961OO = year;
        this.XOX0O0 = month;
        this.iOiXi11II = day;
        this.XX1Oi.set(year, month, day);
    }

    public final void OXO1(int count) {
        Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.Ii1iii0);
        calendar.add(2, count);
        setDate(calendar);
    }

    public final int XIi00iiXO(float x, float y) {
        return ((((int) (y / this.O001I)) - 1) * 7) + ((int) (x / this.iXiX011));
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
        if (action == 1 && (iXIi00iiXO = XIi00iiXO(x, y)) >= 0 && iXIi00iiXO < this.XXO * 7 && this.i0X000X0O != null) {
            int i = this.iiiO.get(1);
            int i2 = this.iiiO.get(2);
            int i3 = (1 - this.OX110i) + iXIi00iiXO;
            Calendar calendar = Calendar.getInstance();
            calendar.set(i, i2, i3);
            if ((((calendar.getTimeInMillis() / 1000) / 60) / 60) / 24 > (((this.XX1Oi.getTimeInMillis() / 1000) / 60) / 60) / 24) {
                return true;
            }
            this.i0X000X0O.onDateSelected(calendar, i, i2, i3);
            this.iiiO.set(5, (1 - this.OX110i) + iXIi00iiXO);
            setDate(this.iiiO);
        }
        return true;
    }

    public Date getDate() {
        return this.Ii1iii0;
    }

    /* JADX INFO: renamed from: iO */
    public final int m38875iO(int resId) {
        return ck4.XIi00iiXO(resId);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Ii1iii0 == null) {
            setDate(Calendar.getInstance());
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: double
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.view.CalendarView.onDraw(android.graphics.Canvas):void");
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

    public void setOnDateSelectedListener(OXO1 listener) {
        this.i0X000X0O = listener;
    }

    public CalendarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setDate(Date data) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        if (this.f54961OO != -1 && this.XOX0O0 != -1) {
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = this.f54961OO;
            if (i > i3) {
                OXO1 oxo1 = this.i0X000X0O;
                if (oxo1 != null) {
                    oxo1.onInteractivePrompts(this.iX1O1.getString(R.string.no_more));
                    return;
                }
                return;
            }
            if (i == i3 && i2 > this.XOX0O0) {
                OXO1 oxo2 = this.i0X000X0O;
                if (oxo2 != null) {
                    oxo2.onInteractivePrompts(this.iX1O1.getString(R.string.no_more));
                    return;
                }
                return;
            }
        }
        this.Ii1iii0 = data;
        this.iiiO.setTime(data);
        this.X11I.setTime(data);
        Calendar calendar2 = this.X11I;
        calendar2.add(5, (-calendar2.get(5)) + 1);
        int i4 = this.X11I.get(7);
        int i5 = i4 < 2 ? 6 : i4 - 2;
        this.OX110i = i5;
        this.X11I.add(2, 1);
        this.X11I.add(5, -1);
        int iCeil = ((int) Math.ceil(((i5 + this.X11I.get(5)) * 1.0f) / 7.0f)) + 1;
        this.XXO = iCeil;
        this.iIXi1iiXI = this.O001I * iCeil;
        int i6 = this.X11I.get(7);
        this.X11I.add(5, i6 < 2 ? 0 : 8 - i6);
        if (this.i0X000X0O != null) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(this.iiiO.getTime());
            this.i0X000X0O.onMonthChange(calendar3, calendar3.get(1), calendar3.get(2), calendar3.get(5));
        }
        invalidate();
    }

    public CalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.X11iII1O1 = new Paint();
        this.X1IX = new Rect();
        this.iiiO = Calendar.getInstance();
        this.X11I = Calendar.getInstance();
        this.X100O = Calendar.getInstance();
        this.XX1Oi = Calendar.getInstance();
        this.f54961OO = -1;
        this.XOX0O0 = -1;
        this.X00XIX1 = new LinearLayout.LayoutParams(0, 0);
        this.iX1O1 = context;
        this.f54960I1 = context.getResources().getStringArray(R.array.weekdays_s);
        this.X11iII1O1.setAntiAlias(true);
        this.X11iII1O1.setDither(true);
        this.X11iII1O1.setTextSize(OXI1i1.I0IIOi(context, 14.0f));
        this.X11iII1O1.setTextAlign(Paint.Align.CENTER);
        this.X11iII1O1.getTextBounds("日日日", 0, 1, this.X1IX);
        this.X11iII1O1.setStrokeWidth(OXI1i1.XIi00iiXO(this.iX1O1, 1.0f));
        int iHeight = (int) (((double) this.X1IX.height()) * 3.0d);
        this.O001I = iHeight;
        this.iXiiiO = (iHeight / 2) + (this.X1IX.height() / 2);
        this.XXX11i = ContextCompat.getColor(context, m38875iO(R.color.colorAccent));
        setBackgroundColor(hl4.XIi00iiXO(this.iX1O1, R.color.view_page_secondary_bg));
        setMax(Calendar.getInstance());
        applySkin();
    }
}
