package com.sma.smartv3.location;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sma.smartv3.location.iO */
/* JADX INFO: loaded from: classes19.dex */
public final class C18593iO {

    @aa1
    public static final C18593iO OXO1 = new C18593iO();

    @aa1
    public static final String XIi00iiXO = "SpeedFromGPSHelp";
    public static final float XO0O10 = 0.99f;

    /* JADX INFO: renamed from: iO */
    public static float f51292iO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m38250iO(C18593iO c18593iO, CustomLocation customLocation, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c18593iO.XIi00iiXO(customLocation, function1);
    }

    public final float OXO1() {
        return f51292iO;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final void XIi00iiXO(@aa1 CustomLocation newLocation, @tb1 Function1<? super Float, Unit> function1) {
        float fI0IIOi;
        Intrinsics.X0O(newLocation, "newLocation");
        if (newLocation.O00() != CustomLocation.TYPE.NORMAL) {
            return;
        }
        if (newLocation.XOO0ii0() == 0) {
            if (newLocation.I0IIOi() < XO0O10) {
                fI0IIOi = 0.0f;
            } else {
                fI0IIOi = (float) (((double) newLocation.I0IIOi()) * 3.6d);
            }
        } else if (newLocation.I0IIOi() < ((double) XO0O10) * 3.6d) {
            fI0IIOi = 0.0f;
        } else {
            fI0IIOi = newLocation.I0IIOi();
        }
        float fMax = Math.max(fI0IIOi, 0.0f);
        f51292iO = fMax;
        if (function1 != null) {
            function1.invoke2(Float.valueOf(fMax));
        }
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " originalGpsSpeed = " + newLocation.I0IIOi() + " m/s , Speed = " + f51292iO + " km/h");
    }

    public final void XO0O10(float f) {
        f51292iO = f;
    }
}
