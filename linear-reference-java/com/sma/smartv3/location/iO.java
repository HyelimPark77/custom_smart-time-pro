package com.sma.smartv3.location;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class iO {

    @aa1
    public static final iO OXO1 = null;

    @aa1
    public static final String XIi00iiXO = null;
    public static final float XO0O10 = 0.0f;
    public static float iO;

    static {
        OXO1 = new iO();
        XIi00iiXO = "SpeedFromGPSHelp";
        XO0O10 = 0.99f;
    }

    public iO() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iO(iO r0, CustomLocation r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.XIi00iiXO(r1, r2);
    }

    public final float OXO1() {
        return iO;
    }

    public final void XIi00iiXO(@aa1 CustomLocation r9, @tb1 Function1<? super Float, Unit> r10) {
        Intrinsics.X0O(r9, "newLocation");
        if (r9.O00() == CustomLocation.TYPE.NORMAL) goto L6;
        return;
    L6:
        if (r9.XOO0ii0() != 0) goto L12;
        if (r9.I0IIOi() >= XO0O10) goto L10;
    L9:
        float r0 = 0.0f;
    L15:
        float r1 = Math.max(r0, 0.0f);
        iO = r1;
        if (r10 == null) goto L18;
        r10.invoke(Float.valueOf(r1));
    L18:
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " originalGpsSpeed = " + r9.I0IIOi() + " m/s , Speed = " + iO + " km/h");
        return;
    L10:
        r0 = (float) (((double) r9.I0IIOi()) * 3.6d);
        goto L15
    L12:
        if (r9.I0IIOi() < (((double) XO0O10) * 3.6d)) goto L9;
        r0 = r9.I0IIOi();
        goto L15
    }

    public final void XO0O10(float r1) {
        iO = r1;
    }
}
