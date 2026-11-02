package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.XX01Oi;
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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final i00OIXiO f54942iO = I0IIOi.OXO1(ng5.m2716iO(null, 1, null).plus(IXOX0Xiii.m712iO()));

    @aa1
    public final TTSManager IiI10X(@aa1 jl5 newStrategy) {
        Intrinsics.X0O(newStrategy, "newStrategy");
        jl5 jl5Var = this.OXO1;
        if (jl5Var != null) {
            jl5Var.cancel();
        }
        this.OXO1 = newStrategy;
        return this;
    }

    @aa1
    public final TTSManager O00(@aa1 X1XXX0I0 newStrategy) {
        Intrinsics.X0O(newStrategy, "newStrategy");
        this.XIi00iiXO = newStrategy;
        return this;
    }

    @aa1
    public final XiOIO XO0O10(@aa1 TTSData ttsData) {
        Intrinsics.X0O(ttsData, "ttsData");
        return XX01Oi.IiI10X(this.f54942iO, IXOX0Xiii.m712iO(), null, new TTSManager$execute$1(this, ttsData, null), 2, null);
    }

    /* JADX INFO: renamed from: iO */
    public final void m38865iO() {
        jl5 jl5Var = this.OXO1;
        if (jl5Var != null) {
            jl5Var.cancel();
        }
        X1XXX0I0 x1xxx0i0 = this.XIi00iiXO;
        if (x1xxx0i0 != null) {
            x1xxx0i0.stop();
        }
        I0IIOi.IiI10X(this.f54942iO, null, 1, null);
    }
}
