package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
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

    @aa1
    public final Context I1;
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
        void onDateSelected(@tb1 Calendar r1, int r2, int r3, int r4);
    }

    @JvmOverloads
    public FutureCalendarView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "mContext");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final int OXO1(float r2, float r3) {
        return ((((int) (r3 / this.iXiX011)) - 1) * 7) + ((int) (r2 / this.iIXi1iiXI));
    }

    private final int XIi00iiXO(int r1) {
        return ck4.XIi00iiXO(r1);
    }

    public final void XO0O10(int r2, int r3, int r4) {
        Calendar r0 = Calendar.getInstance();
        r0.set(r2, r3, r4);
        Date r5 = r0.getTime();
        Intrinsics.O10IXXX0X(r5, "getTime(...)");
        setDate(r5);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent r10) {
        Intrinsics.X0O(r10, NotificationCompat.CATEGORY_EVENT);
        int r0 = r10.getAction();
        float r1 = r10.getX();
        float r11 = r10.getY();
        if (r0 != 0) goto L11;
        int r12 = OXO1(r1, r11);
        if (r12 < 0) goto L11;
        if (r12 >= (this.O001I * 7)) goto L11;
        if (this.OX110i == null) goto L11;
        this.iiiO.setTimeInMillis(this.X11I.getTimeInMillis() + (((long) (r12 * 86400)) * 1000));
        int r13 = OIi1iX.O10IXXX0X(this.iiiO);
        int r2 = OIi1iX.IO(this.iiiO);
        int r3 = OIi1iX.XIi00iiXO(this.iiiO) + 1;
        OIi1iX.iIiiO(this.iiiO, 0);
        OIi1iX.OiIIX101O(this.iiiO, 0);
        OIi1iX.I1(this.iiiO, 0);
        OIi1iX.XX0(this.iiiO, 0);
        OXO1 r4 = this.OX110i;
        Intrinsics.XXI(r4);
        r4.onDateSelected(this.iiiO, r13, r2, r3);
        invalidate();
    L11:
        return true;
    }

    public final void iO(boolean r1) {
        this.Ii1iii0 = r1;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.iXiiiO != null) goto L6;
        Calendar r0 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r0, "getInstance(...)");
        setDate(r0);
        return;
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r18) {
        Intrinsics.X0O(r18, "canvas");
        super.onDraw(r18);
        LinearLayout.LayoutParams r2 = this.XX1Oi;
        r2.width = this.X1IX;
        r2.height = this.X0i1O;
        setLayoutParams(r2);
        int r3 = this.O001I * 7;
        int r4 = 0;
        int r5 = 0;
        int r7 = 0;
    L4:
        if (r5 >= r3) goto L18;
        this.X100O.setTimeInMillis(this.X11I.getTimeInMillis() + (((long) (86400 * r5)) * 1000));
        if (this.Ii1iii0 == false) goto L8;
        int r9 = O0X11OiO.O10IXXX0X(this.X100O.getTimeInMillis(), r4, 2, null).IiI10X();
    L9:
        int r11 = r5 % 7;
        int r12 = (r5 / 7) + 1;
        if (OIi1iX.O10IXXX0X(this.X100O) == OIi1iX.O10IXXX0X(this.iiiO)) goto L12;
    L16:
        this.iX1O1.setColor(-7829368);
    L17:
        StringBuilder r6 = new StringBuilder();
        r6.append(r9);
        r18.drawText(r6.toString(), (float) ((((double) r11) + 0.5d) * ((double) this.iIXi1iiXI)), this.XXO + (r12 * this.iXiX011), this.iX1O1);
        r5 = r5 + 1;
        r4 = 0;
        goto L4
    L12:
        if (OIi1iX.IO(this.X100O) != OIi1iX.IO(this.iiiO)) goto L16;
        if (OIi1iX.XIi00iiXO(this.X100O) != OIi1iX.XIi00iiXO(this.iiiO)) goto L16;
        this.iX1O1.setColor(this.X11iII1O1);
        r18.drawCircle((float) ((((double) r11) + 0.5d) * ((double) this.iIXi1iiXI)), (this.XXO + (this.iXiX011 * r12)) - (this.XXX11i.height() / 2), this.iX1O1.getTextSize(), this.iX1O1);
        this.iX1O1.setColor(hl4.XIi00iiXO(this.I1, R.color.light));
        r7 = r11;
        goto L17
    L8:
        r9 = OIi1iX.XIi00iiXO(this.X100O);
        goto L9
    L18:
        int r8 = 0;
    L19:
        if (r8 >= 7) goto L24;
        if (r7 != r8) goto L22;
        this.iX1O1.setColor(this.X11iII1O1);
    L23:
        String r10 = O0X11OiO.iOO1ii1(System.currentTimeMillis(), r8).IiI10X().toUpperCase(Locale.ROOT);
        Intrinsics.O10IXXX0X(r10, "toUpperCase(...)");
        int r13 = this.iIXi1iiXI;
        r18.drawText(r10, (r13 / 2) + (r13 * r8), this.XXO, this.iX1O1);
        r8 = r8 + 1;
        goto L19
    L22:
        this.iX1O1.setColor(hl4.XIi00iiXO(this.I1, R.color.text_color));
        goto L23
    L24:
        this.iX1O1.setColor(-7829368);
        int r14 = this.iXiX011;
        r18.drawLine(0.0f, r14, this.X1IX, r14, this.iX1O1);
        this.iX1O1.setStrokeWidth(SizeUtils.dp2px(2.0f));
        this.iX1O1.setColor(this.X11iII1O1);
        int r1 = this.iIXi1iiXI;
        float r15 = r1 * 0.5f;
        float r16 = (r7 * r1) + ((r1 - r15) / 2.0f);
        int r17 = this.iXiX011;
        float r19 = 1;
        r18.drawLine(r16, r17 - r19, r15 + r16, r17 - r19, this.iX1O1);
        this.iX1O1.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r3 = getMeasuredWidth();
        this.X1IX = r3;
        this.iIXi1iiXI = r3 / 7;
    }

    public final void setDate(@aa1 Calendar r2) {
        Intrinsics.X0O(r2, "cal");
        Date r3 = r2.getTime();
        Intrinsics.O10IXXX0X(r3, "getTime(...)");
        setDate(r3);
    }

    public final void setOnDateSelectedListener(@tb1 OXO1 r1) {
        this.OX110i = r1;
    }

    public final void setRow(int r2) {
        this.O001I = r2;
        this.X0i1O = this.iXiX011 * r2;
        invalidate();
    }

    @JvmOverloads
    public FutureCalendarView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "mContext");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    public final void setDate(@aa1 Date r2) {
        Intrinsics.X0O(r2, "data");
        this.iXiiiO = r2;
        this.iiiO.setTime(r2);
        this.X11I.setTime(r2);
        this.X0i1O = this.iXiX011 * this.O001I;
        invalidate();
    }

    @JvmOverloads
    public FutureCalendarView(@aa1 Context r6, @tb1 AttributeSet r7, int r8) {
        Intrinsics.X0O(r6, "mContext");
        super(r6, r7, r8);
        this.I1 = r6;
        Paint r9 = new Paint();
        this.iX1O1 = r9;
        Rect r10 = new Rect();
        this.XXX11i = r10;
        this.O001I = 2;
        Calendar r1 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r1, "getInstance(...)");
        this.iiiO = r1;
        Calendar r2 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r2, "getInstance(...)");
        this.X11I = r2;
        Calendar r3 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r3, "getInstance(...)");
        this.X100O = r3;
        this.XX1Oi = new LinearLayout.LayoutParams(0, 0);
        r9.setAntiAlias(true);
        r9.setDither(true);
        r9.setTextSize(SizeUtils.sp2px(14.0f));
        r9.setTextAlign(Paint.Align.CENTER);
        r9.getTextBounds("日日日", 0, 1, r10);
        r9.setStrokeWidth(1.0f);
        int r11 = (int) (((double) r10.height()) * 3.8d);
        this.iXiX011 = r11;
        this.XXO = (r11 / 2) + (r10.height() / 2);
        this.X11iII1O1 = ContextCompat.getColor(r6, XIi00iiXO(R.color.colorAccent));
        applySkin();
    }

    public /* synthetic */ FutureCalendarView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
