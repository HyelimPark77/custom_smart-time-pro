package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ck4;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.pro.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class FutureCalendarView extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final Context f54983I1;
    public boolean Ii1iii0;
    public int O001I;

    @tb1
    public OXO1 OX110i;
    public int X0i1O;

    @aa1
    public final Calendar X100O;

    @aa1
    public final Calendar X11I;
    public final int X11iII1O1;
    public int X1IX;

    @aa1
    public final LinearLayout.LayoutParams XX1Oi;
    public final int XXO;

    @aa1
    public final Rect XXX11i;
    public int iIXi1iiXI;

    @aa1
    public final Paint iX1O1;
    public final int iXiX011;

    @tb1
    public Date iXiiiO;

    @aa1
    public final Calendar iiiO;

    public interface OXO1 {
        void onDateSelected(@tb1 Calendar calendar, int i, int i2, int i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FutureCalendarView(@aa1 Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.X0O(mContext, "mContext");
    }

    private final int OXO1(float f, float f2) {
        return ((((int) (f2 / this.iXiX011)) - 1) * 7) + ((int) (f / this.iIXi1iiXI));
    }

    private final int XIi00iiXO(int i) {
        return ck4.XIi00iiXO(i);
    }

    public final void XO0O10(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2, i3);
        Date time = calendar.getTime();
        Intrinsics.O10IXXX0X(time, "getTime(...)");
        setDate(time);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent event) {
        int iOXO1;
        Intrinsics.X0O(event, "event");
        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();
        if (action == 0 && (iOXO1 = OXO1(x, y)) >= 0 && iOXO1 < this.O001I * 7 && this.OX110i != null) {
            this.iiiO.setTimeInMillis(this.X11I.getTimeInMillis() + (((long) (iOXO1 * 86400)) * 1000));
            int iO10IXXX0X = OIi1iX.O10IXXX0X(this.iiiO);
            int iM891IO = OIi1iX.m891IO(this.iiiO);
            int iXIi00iiXO = OIi1iX.XIi00iiXO(this.iiiO) + 1;
            OIi1iX.iIiiO(this.iiiO, 0);
            OIi1iX.OiIIX101O(this.iiiO, 0);
            OIi1iX.m890I1(this.iiiO, 0);
            OIi1iX.XX0(this.iiiO, 0);
            OXO1 oxo1 = this.OX110i;
            Intrinsics.XXI(oxo1);
            oxo1.onDateSelected(this.iiiO, iO10IXXX0X, iM891IO, iXIi00iiXO);
            invalidate();
        }
        return true;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38882iO(boolean z) {
        this.Ii1iii0 = z;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.iXiiiO == null) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
            setDate(calendar);
        }
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        LinearLayout.LayoutParams layoutParams = this.XX1Oi;
        layoutParams.width = this.X1IX;
        layoutParams.height = this.X0i1O;
        setLayoutParams(layoutParams);
        int i = this.O001I * 7;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            this.X100O.setTimeInMillis(this.X11I.getTimeInMillis() + (((long) (86400 * i3)) * 1000));
            int iIiI10X = this.Ii1iii0 ? O0X11OiO.O10IXXX0X(this.X100O.getTimeInMillis(), i2, 2, null).IiI10X() : OIi1iX.XIi00iiXO(this.X100O);
            int i5 = i3 % 7;
            int i6 = (i3 / 7) + 1;
            if (OIi1iX.O10IXXX0X(this.X100O) == OIi1iX.O10IXXX0X(this.iiiO) && OIi1iX.m891IO(this.X100O) == OIi1iX.m891IO(this.iiiO) && OIi1iX.XIi00iiXO(this.X100O) == OIi1iX.XIi00iiXO(this.iiiO)) {
                this.iX1O1.setColor(this.X11iII1O1);
                canvas.drawCircle((float) ((((double) i5) + 0.5d) * ((double) this.iIXi1iiXI)), (this.XXO + (this.iXiX011 * i6)) - (this.XXX11i.height() / 2), this.iX1O1.getTextSize(), this.iX1O1);
                this.iX1O1.setColor(hl4.XIi00iiXO(this.f54983I1, R.color.light));
                i4 = i5;
            } else {
                this.iX1O1.setColor(-7829368);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(iIiI10X);
            canvas.drawText(sb.toString(), (float) ((((double) i5) + 0.5d) * ((double) this.iIXi1iiXI)), this.XXO + (i6 * this.iXiX011), this.iX1O1);
            i3++;
            i2 = 0;
        }
        for (int i7 = 0; i7 < 7; i7++) {
            if (i4 == i7) {
                this.iX1O1.setColor(this.X11iII1O1);
            } else {
                this.iX1O1.setColor(hl4.XIi00iiXO(this.f54983I1, R.color.text_color));
            }
            String upperCase = O0X11OiO.iOO1ii1(System.currentTimeMillis(), i7).IiI10X().toUpperCase(Locale.ROOT);
            Intrinsics.O10IXXX0X(upperCase, "toUpperCase(...)");
            int i8 = this.iIXi1iiXI;
            canvas.drawText(upperCase, (i8 / 2) + (i8 * i7), this.XXO, this.iX1O1);
        }
        this.iX1O1.setColor(-7829368);
        int i9 = this.iXiX011;
        canvas.drawLine(0.0f, i9, this.X1IX, i9, this.iX1O1);
        this.iX1O1.setStrokeWidth(SizeUtils.dp2px(2.0f));
        this.iX1O1.setColor(this.X11iII1O1);
        int i10 = this.iIXi1iiXI;
        float f = i10 * 0.5f;
        float f2 = (i4 * i10) + ((i10 - f) / 2.0f);
        int i11 = this.iXiX011;
        float f3 = 1;
        canvas.drawLine(f2, i11 - f3, f + f2, i11 - f3, this.iX1O1);
        this.iX1O1.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        this.X1IX = measuredWidth;
        this.iIXi1iiXI = measuredWidth / 7;
    }

    public final void setDate(@aa1 Calendar cal) {
        Intrinsics.X0O(cal, "cal");
        Date time = cal.getTime();
        Intrinsics.O10IXXX0X(time, "getTime(...)");
        setDate(time);
    }

    public final void setOnDateSelectedListener(@tb1 OXO1 oxo1) {
        this.OX110i = oxo1;
    }

    public final void setRow(int i) {
        this.O001I = i;
        this.X0i1O = this.iXiX011 * i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FutureCalendarView(@aa1 Context mContext, @tb1 AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.X0O(mContext, "mContext");
    }

    public final void setDate(@aa1 Date data) {
        Intrinsics.X0O(data, "data");
        this.iXiiiO = data;
        this.iiiO.setTime(data);
        this.X11I.setTime(data);
        this.X0i1O = this.iXiX011 * this.O001I;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FutureCalendarView(@aa1 Context mContext, @tb1 AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.X0O(mContext, "mContext");
        this.f54983I1 = mContext;
        Paint paint = new Paint();
        this.iX1O1 = paint;
        Rect rect = new Rect();
        this.XXX11i = rect;
        this.O001I = 2;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        this.iiiO = calendar;
        Calendar calendar2 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar2, "getInstance(...)");
        this.X11I = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar3, "getInstance(...)");
        this.X100O = calendar3;
        this.XX1Oi = new LinearLayout.LayoutParams(0, 0);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setTextSize(SizeUtils.sp2px(14.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.getTextBounds("日日日", 0, 1, rect);
        paint.setStrokeWidth(1.0f);
        int iHeight = (int) (((double) rect.height()) * 3.8d);
        this.iXiX011 = iHeight;
        this.XXO = (iHeight / 2) + (rect.height() / 2);
        this.X11iII1O1 = ContextCompat.getColor(mContext, XIi00iiXO(R.color.colorAccent));
        applySkin();
    }

    public /* synthetic */ FutureCalendarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
