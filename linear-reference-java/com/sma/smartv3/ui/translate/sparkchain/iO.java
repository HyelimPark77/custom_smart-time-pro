package com.sma.smartv3.ui.translate.sparkchain;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.iflytek.sparkchain.core.rtasr.RTASR;
import com.iflytek.sparkchain.core.rtasr.RTASRCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class iO {

    @aa1
    public OXO1 I0IIOi;

    @aa1
    public final ry0<mq4> IiI10X;

    @aa1
    public final k85<O00> O00;

    @tb1
    public RTASR OXO1;

    @aa1
    public final String XIi00iiXO;

    @aa1
    public final ty0<O00> XO0O10;

    @aa1
    public final l94<mq4> XOO0ii0;

    @aa1
    public final String iO;

    public static final class OXO1 implements RTASRCallbacks {
        public final /* synthetic */ iO OXO1;

        public OXO1(iO r1) {
            this.OXO1 = r1;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
            iO.XIi00iiXO(this.OXO1).setValue(O00.iO.OXO1);
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
            iO.XIi00iiXO(this.OXO1).setValue(O00.XIi00iiXO.OXO1);
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError r5, Object r6) {
            String r7 = null;
            if (r5 == null) goto L5;
            Integer r0 = Integer.valueOf(r5.getCode());
        L6:
            if (r5 == null) goto L8;
            String r1 = r5.getErrMsg();
        L9:
            if (r5 == null) goto L11;
            r7 = r5.getSid();
        L11:
            i1O0OXO1O.OXO1.OXO1(iO.OXO1(this.OXO1) + " RTASRError :" + r0 + " " + r1 + " " + r7);
            iO.XIi00iiXO(this.OXO1).setValue(new O00.OXO1(r0, r1));
            return;
        L8:
            r1 = null;
            goto L9
        L5:
            r0 = null;
            goto L6
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult r8, Object r9) {
            if (r8 != null) goto L4;
            return;
        L4:
            Integer r1 = Integer.valueOf(r8.getStatus());
            String r2 = r8.getData();
            String r3 = r8.getSid();
            Intrinsics.O10IXXX0X(r3, "getSid(...)");
            mq4 r0 = new mq4(r1, r2, r3, r8.getTransResult().getSrc(), r8.getTransResult().getDst(), Integer.valueOf(r8.getTransResult().getStatus()));
            i1O0OXO1O.OXO1.OXO1(iO.OXO1(this.OXO1) + " RTASRCallbacks : " + r0);
            iO.iO(this.OXO1).iO(r0);
        }
    }

    public iO() {
        this.XIi00iiXO = "0c997b55309fdb251dcb1b8cc6c87959";
        this.iO = "RTASRManager";
        ty0<O00> r0 = l85.OXO1(O00.XIi00iiXO.OXO1);
        this.XO0O10 = r0;
        this.O00 = iX0XiO.XXI(r0);
        ry0<mq4> r1 = m94.XIi00iiXO(0, 64, null, 5, null);
        this.IiI10X = r1;
        this.XOO0ii0 = iX0XiO.I0iXXO(r1);
        this.I0IIOi = new OXO1(this);
    }

    public static final /* synthetic */ String OXO1(iO r0) {
        return r0.iO;
    }

    public static final /* synthetic */ ty0 XIi00iiXO(iO r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ ry0 iO(iO r0) {
        return r0.IiI10X;
    }

    public final void I0IIOi() {
        setValue(O00.XIi00iiXO.OXO1);
        RTASR r0 = this.OXO1;
        if (r0 == null) goto L6;
        r0.stop();
        return;
    }

    @aa1
    public final l94<mq4> IiI10X() {
        return this.XOO0ii0;
    }

    @aa1
    public final k85<O00> O00() {
        return this.O00;
    }

    public final void OIi0(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "byteArray");
        RTASR r0 = this.OXO1;
        if (r0 == null) goto L6;
        r0.write(r2);
        return;
    }

    public final void XO0O10() {
        setValue(O00.XIi00iiXO.OXO1);
        RTASR r0 = this.OXO1;
        if (r0 == null) goto L5;
        r0.stop();
    L5:
        this.OXO1 = null;
    }

    public final void XOO0ii0(@aa1 XO0O10 r5) {
        Intrinsics.X0O(r5, DTBMetricsConfiguration.CONFIG_DIR);
        if (this.OXO1 != null) goto L5;
        this.OXO1 = new RTASR(this.XIi00iiXO);
    L5:
        RTASR r0 = this.OXO1;
        if (r0 == null) goto L8;
        r0.lang(r5.X0O());
        r0.targetLang(r5.iIiiO());
        r0.transStrategy(r5.XX0());
        r0.registerCallbacks(this.I0IIOi);
    L8:
        setValue(O00.XIi00iiXO.OXO1);
        RTASR r1 = this.OXO1;
        if (r1 == null) goto L11;
        Integer r2 = Integer.valueOf(r1.start(r5.O10IXXX0X()));
    L12:
        i1O0OXO1O.OXO1.OXO1(this.iO + " Config:" + r5 + " StartStatus:" + r2);
        if (r2 != null) goto L16;
        return;
    L16:
        if (r2.intValue() != 0) goto L19;
        setValue(O00.iO.OXO1);
        return;
    L19:
        return;
    L11:
        r2 = null;
        goto L12
    }
}
