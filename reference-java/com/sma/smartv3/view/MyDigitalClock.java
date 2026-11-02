package com.sma.smartv3.view;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.view.MyDigitalClock;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MyDigitalClock extends TextView {

    /* JADX INFO: renamed from: I1 */
    @tb1
    public Calendar f55006I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public String f55007IO;

    @tb1
    public Runnable X11iII1O1;
    public boolean X1IX;

    @tb1
    public Handler XXX11i;
    public int iX1O1;

    public MyDigitalClock(@tb1 Context context) {
        super(context);
        this.f55007IO = O0X11OiO.iX1O1;
        XIi00iiXO();
    }

    /* JADX INFO: renamed from: iO */
    public static final void m38895iO(MyDigitalClock myDigitalClock) {
        if (myDigitalClock.X1IX) {
            return;
        }
        Calendar calendar = myDigitalClock.f55006I1;
        if (calendar != null) {
            calendar.setTimeInMillis(System.currentTimeMillis() + ((long) myDigitalClock.iX1O1));
        }
        CharSequence charSequence = DateFormat.format(myDigitalClock.f55007IO, myDigitalClock.f55006I1);
        if (!Intrinsics.XOO0ii0(myDigitalClock.getText().toString(), charSequence)) {
            myDigitalClock.setText(charSequence);
            myDigitalClock.invalidate();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = 1000;
        long j2 = jUptimeMillis + (j - (jUptimeMillis % j));
        Handler handler = myDigitalClock.XXX11i;
        if (handler != null) {
            Runnable runnable = myDigitalClock.X11iII1O1;
            Intrinsics.XXI(runnable);
            handler.postAtTime(runnable, j2);
        }
    }

    public final void XIi00iiXO() {
        if (this.f55006I1 == null) {
            this.f55006I1 = Calendar.getInstance();
        }
    }

    @tb1
    public final Calendar getMCalendar() {
        return this.f55006I1;
    }

    @aa1
    public final String getMFormat() {
        return this.f55007IO;
    }

    public final int getMOffset() {
        return this.iX1O1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        this.X1IX = false;
        super.onAttachedToWindow();
        this.XXX11i = new Handler();
        Runnable runnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.rz0
            @Override // java.lang.Runnable
            public final void run() {
                MyDigitalClock.m38895iO(this.f10934IO);
            }
        };
        this.X11iII1O1 = runnable;
        runnable.run();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X1IX = true;
    }

    public final void setMCalendar(@tb1 Calendar calendar) {
        this.f55006I1 = calendar;
    }

    public final void setMFormat(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f55007IO = str;
    }

    public final void setMOffset(int i) {
        this.iX1O1 = i;
    }

    public MyDigitalClock(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55007IO = O0X11OiO.iX1O1;
        XIi00iiXO();
    }
}
