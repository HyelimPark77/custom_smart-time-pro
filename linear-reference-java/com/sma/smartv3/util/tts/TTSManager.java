package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.jl5;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class TTSManager {

    @tb1
    public jl5 OXO1;

    @tb1
    public X1XXX0I0 XIi00iiXO;

    @aa1
    public final i00OIXiO iO;

    public TTSManager() {
        this.iO = I0IIOi.OXO1(ng5.iO(null, 1, null).plus(IXOX0Xiii.iO()));
    }

    public static final /* synthetic */ X1XXX0I0 OXO1(TTSManager r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ jl5 XIi00iiXO(TTSManager r0) {
        return r0.OXO1;
    }

    @aa1
    public final TTSManager IiI10X(@aa1 jl5 r2) {
        Intrinsics.X0O(r2, "newStrategy");
        jl5 r0 = this.OXO1;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        this.OXO1 = r2;
        return this;
    }

    @aa1
    public final TTSManager O00(@aa1 X1XXX0I0 r2) {
        Intrinsics.X0O(r2, "newStrategy");
        this.XIi00iiXO = r2;
        return this;
    }

    @aa1
    public final XiOIO XO0O10(@aa1 TTSData r8) {
        Intrinsics.X0O(r8, "ttsData");
        return I100X1.O00(this.iO, IXOX0Xiii.iO(), null, new TTSManager$execute$1(this, r8, null), 2, null);
    }

    public final void iO() {
        jl5 r0 = this.OXO1;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        X1XXX0I0 r1 = this.XIi00iiXO;
        if (r1 == null) goto L8;
        r1.stop();
    L8:
        I0IIOi.IiI10X(this.iO, null, 1, null);
    }
}
