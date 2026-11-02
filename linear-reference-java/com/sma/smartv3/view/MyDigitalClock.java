package com.sma.smartv3.view;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.rz0;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MyDigitalClock extends TextView {

    @tb1
    public Calendar I1;

    @aa1
    public String IO;

    @tb1
    public Runnable X11iII1O1;
    public boolean X1IX;

    @tb1
    public Handler XXX11i;
    public int iX1O1;

    public MyDigitalClock(@tb1 Context r1) {
        super(r1);
        this.IO = O0X11OiO.iX1O1;
        XIi00iiXO();
    }

    public static /* synthetic */ void OXO1(MyDigitalClock r0) {
        iO(r0);
    }

    public static final void iO(MyDigitalClock r6) {
        if (r6.X1IX == true) goto L16;
        Calendar r0 = r6.I1;
        if (r0 == null) goto L8;
        r0.setTimeInMillis(System.currentTimeMillis() + ((long) r6.iX1O1));
    L8:
        CharSequence r1 = DateFormat.format(r6.IO, r6.I1);
        if (Intrinsics.XOO0ii0(r6.getText().toString(), r1) == true) goto L11;
        r6.setText(r1);
        r6.invalidate();
    L11:
        long r2 = SystemClock.uptimeMillis();
        long r3 = 1000;
        long r4 = r2 + (r3 - (r2 % r3));
        Handler r5 = r6.XXX11i;
        if (r5 == null) goto L15;
        Runnable r7 = r6.X11iII1O1;
        Intrinsics.XXI(r7);
        r5.postAtTime(r7, r4);
        return;
    L15:
        return;
    }

    public final void XIi00iiXO() {
        if (this.I1 != null) goto L6;
        this.I1 = Calendar.getInstance();
        return;
    }

    @tb1
    public final Calendar getMCalendar() {
        return this.I1;
    }

    @aa1
    public final String getMFormat() {
        return this.IO;
    }

    public final int getMOffset() {
        return this.iX1O1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.X1IX = false;
        super.onAttachedToWindow();
        this.XXX11i = new Handler();
        Runnable r0 = new rz0(this);
        this.X11iII1O1 = r0;
        r0.run();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X1IX = true;
    }

    public final void setMCalendar(@tb1 Calendar r1) {
        this.I1 = r1;
    }

    public final void setMFormat(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.IO = r2;
    }

    public final void setMOffset(int r1) {
        this.iX1O1 = r1;
    }

    public MyDigitalClock(@tb1 Context r1, @tb1 AttributeSet r2) {
        super(r1, r2);
        this.IO = O0X11OiO.iX1O1;
        XIi00iiXO();
    }
}
