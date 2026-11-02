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

    /* JADX INFO: renamed from: I1 */
    public Context f55030I1;

    /* JADX INFO: renamed from: IO */
    public String[] f55031IO;
    public int IO0II0i;
    public int IXOIIIO;
    public Paint Ii0X0X;
    public Calendar Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    public int f55032OO;
    public int OX110i;
    public OXO1 X00XIX1;
    public float X00Xi1X;
    public int X0i1O;

    /* JADX INFO: renamed from: X1 */
    public float f55033X1;
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

    /* JADX INFO: renamed from: IO */
    public void m38907IO(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        setDate(calendar.getTime());
    }

    public final long IiI10X(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public void O00() {
        this.i0X000X0O.clear();
        invalidate();
    }

    public void OIX0iXi(int year, int month, int day) {
        this.OX110i = year;
        this.f55032OO = month;
        this.XOX0O0 = day;
        this.X100O.set(year, month, day);
    }

    public void OIi0(long timestamp) {
        this.i0X000X0O.remove(Long.valueOf(timestamp));
        invalidate();
    }

    public final void OXO1(int count) {
        Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.iXiiiO);
        calendar.add(2, count);
        setDate(calendar);
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
        int iXOO0ii0;
        OXO1 oxo1;
        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();
        if (action == 1 && (iXOO0ii0 = XOO0ii0(x, y)) >= 0 && iXOO0ii0 < this.O001I * 7) {
            int i = (1 - this.XX1Oi) + iXOO0ii0;
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.IXOIIIO, this.IO0II0i, i);
            if (calendar.get(1) == this.IXOIIIO && calendar.get(2) == this.IO0II0i && (((calendar.getTimeInMillis() / 1000) / 60) / 60) / 24 <= (((this.X100O.getTimeInMillis() / 1000) / 60) / 60) / 24 && (oxo1 = this.X00XIX1) != null) {
                oxo1.onDateSelected(calendar, this.IXOIIIO, this.IO0II0i, i);
                this.Ii1iii0.set(5, i);
                setDate(this.Ii1iii0);
            }
        }
        return true;
    }

    public Date getDate() {
        return this.iXiiiO;
    }

    public int getMaxProgress() {
        return this.i11I;
    }

    /* JADX INFO: renamed from: iO */
    public void m38908iO(Map<Long, XIi00iiXO> dataMap) {
        this.i0X000X0O.clear();
        this.i0X000X0O.putAll(dataMap);
        invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.iXiiiO == null) {
            setDate(Calendar.getInstance());
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x019a  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        for (int i = 0; i < 7; i++) {
            String str = this.f55031IO[i];
            int i2 = this.iIXi1iiXI;
            canvas2.drawText(str, (i2 / 2) + (i2 * i), this.XXO, this.iX1O1);
        }
        this.X11I.setTime(this.iiiO.getTime());
        this.X11I.add(5, ((-this.O001I) + 1) * 7);
        Calendar calendar = Calendar.getInstance();
        for (int i3 = 0; i3 < this.O001I * 7; i3++) {
            this.X11I.add(5, 1);
            int i4 = this.X11I.get(5);
            int i5 = (i3 / 7) + 1;
            float f = (float) ((((double) (i3 % 7)) + 0.5d) * ((double) this.iIXi1iiXI));
            float fHeight = (this.XXO + (this.iXiX011 * i5)) - (this.XXX11i.height() / 2);
            if (this.X11I.get(1) == this.IXOIIIO && this.X11I.get(2) == this.IO0II0i) {
                if (this.X11I.get(1) == this.Ii1iii0.get(1) && this.X11I.get(2) == this.Ii1iii0.get(2) && this.X11I.get(5) == this.Ii1iii0.get(5)) {
                    if (this.X11I.get(1) <= this.X100O.get(1) && ((this.X11I.get(1) != this.X100O.get(1) || this.X11I.get(2) <= this.X100O.get(2)) && (this.X11I.get(1) != this.X100O.get(1) || this.X11I.get(2) != this.X100O.get(2) || this.X11I.get(5) <= this.X100O.get(5)))) {
                        this.iX1O1.setColor(this.X11iII1O1);
                        this.iX1O1.setStyle(Paint.Style.STROKE);
                        canvas2.drawCircle(f, fHeight, this.iX1O1.getTextSize(), this.iX1O1);
                    }
                    this.iX1O1.setStyle(Paint.Style.FILL);
                }
                this.XO0X10iO.setColor(gk4.m1859iO(this.f55030I1, R.color.color_E8E8E8));
                RectF rectF = this.XXiIiX10;
                float f2 = this.X00Xi1X;
                rectF.set(f - f2, fHeight - f2, f + f2, fHeight + f2);
                canvas2.drawArc(this.XXiIiX10, -90.0f, 360.0f, false, this.XO0X10iO);
                long jIiI10X = IiI10X(this.X11I.getTimeInMillis());
                if (this.i0X000X0O.containsKey(Long.valueOf(jIiI10X))) {
                    XIi00iiXO xIi00iiXO = this.i0X000X0O.get(Long.valueOf(jIiI10X));
                    int i6 = xIi00iiXO.OXO1;
                    int i7 = xIi00iiXO.XIi00iiXO;
                    float fMin = Math.min(1.0f, Math.max(0.0f, i6 / this.i11I));
                    if (fMin > 0.0f) {
                        this.Ii0X0X.setColor(i7);
                        canvas2 = canvas;
                        canvas2.drawArc(this.XXiIiX10, -90.0f, fMin * 360.0f, false, this.Ii0X0X);
                    } else {
                        canvas2 = canvas;
                    }
                } else {
                    canvas2 = canvas;
                }
                if (calendar.getTime().getTime() > this.X11I.getTime().getTime()) {
                    this.iX1O1.setColor(gk4.m1859iO(this.f55030I1, R.color.text_color));
                } else {
                    this.iX1O1.setColor(-7829368);
                }
                canvas2.drawText(i4 + "", f, this.XXO + (i5 * this.iXiX011), this.iX1O1);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        this.X1IX = measuredWidth;
        int i = measuredWidth / 7;
        this.iIXi1iiXI = i;
        this.X00Xi1X = i * 0.3f;
        float fXIi00iiXO = OXI1i1.XIi00iiXO(this.f55030I1, 3.0f);
        this.f55033X1 = fXIi00iiXO;
        this.XO0X10iO.setStrokeWidth(fXIi00iiXO);
        this.Ii0X0X.setStrokeWidth(this.f55033X1);
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
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        if (this.OX110i != -1 && this.f55032OO != -1) {
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = this.OX110i;
            if (i > i3) {
                OXO1 oxo1 = this.X00XIX1;
                if (oxo1 != null) {
                    oxo1.onInteractivePrompts(this.f55030I1.getString(R.string.no_more));
                    return;
                }
                return;
            }
            if (i == i3 && i2 > this.f55032OO) {
                OXO1 oxo2 = this.X00XIX1;
                if (oxo2 != null) {
                    oxo2.onInteractivePrompts(this.f55030I1.getString(R.string.no_more));
                    return;
                }
                return;
            }
        }
        this.iXiiiO = data;
        this.Ii1iii0.setTime(data);
        this.IXOIIIO = this.Ii1iii0.get(1);
        this.IO0II0i = this.Ii1iii0.get(2);
        this.iiiO.setTime(data);
        Calendar calendar2 = this.iiiO;
        calendar2.add(5, (-calendar2.get(5)) + 1);
        int i4 = this.iiiO.get(7);
        int i5 = i4 < 2 ? 6 : i4 - 2;
        this.XX1Oi = i5;
        this.iiiO.add(2, 1);
        this.iiiO.add(5, -1);
        int iCeil = ((int) Math.ceil(((i5 + this.iiiO.get(5)) * 1.0f) / 7.0f)) + 1;
        this.O001I = iCeil;
        this.X0i1O = this.iXiX011 * iCeil;
        int i6 = this.iiiO.get(7);
        this.iiiO.add(5, i6 < 2 ? 0 : 8 - i6);
        if (this.X00XIX1 != null) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(this.Ii1iii0.getTime());
            if (calendar3.getTime().getTime() < this.X100O.getTime().getTime()) {
                this.X00XIX1.onMonthChange(calendar3, calendar3.get(1), calendar3.get(2), calendar3.get(5));
            }
        }
        invalidate();
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
        this.f55032OO = -1;
        this.iOiXi11II = new LinearLayout.LayoutParams(0, 0);
        this.i0X000X0O = new HashMap();
        this.i11I = 100;
        this.XO0X10iO = new Paint();
        this.Ii0X0X = new Paint();
        this.XXiIiX10 = new RectF();
        this.f55033X1 = 4.0f;
        this.f55030I1 = context;
        this.f55031IO = context.getResources().getStringArray(R.array.weekdays_s);
        this.iX1O1.setAntiAlias(true);
        this.iX1O1.setDither(true);
        this.iX1O1.setTextSize(OXI1i1.I0IIOi(context, 14.0f));
        this.iX1O1.setTextAlign(Paint.Align.CENTER);
        this.iX1O1.getTextBounds("日日日", 0, 1, this.XXX11i);
        this.iX1O1.setStrokeWidth(OXI1i1.XIi00iiXO(this.f55030I1, 1.0f));
        int iHeight = (int) (((double) this.XXX11i.height()) * 3.0d);
        this.iXiX011 = iHeight;
        this.XXO = (iHeight / 2) + (this.XXX11i.height() / 2);
        this.X11iII1O1 = gk4.m1859iO(context, R.color.colorAccent);
        setMax(Calendar.getInstance());
        this.XO0X10iO.setAntiAlias(true);
        Paint paint = this.XO0X10iO;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.XO0X10iO.setStrokeWidth(this.f55033X1);
        this.XO0X10iO.setColor(gk4.m1859iO(this.f55030I1, R.color.color_E8E8E8));
        this.Ii0X0X.setAntiAlias(true);
        this.Ii0X0X.setStyle(style);
        this.Ii0X0X.setStrokeWidth(this.f55033X1);
        this.Ii0X0X.setStrokeCap(Paint.Cap.ROUND);
        XO0O10();
    }
}
