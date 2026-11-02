package com.sma.smartv3.p610ui.translate.sparkchain;

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

/* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.iO */
/* JADX INFO: loaded from: classes3.dex */
public final class C19038iO {

    @aa1
    public OXO1 I0IIOi;

    @aa1
    public final ry0<mq4> IiI10X;

    @aa1
    public final k85<O00> O00;

    @tb1
    public RTASR OXO1;

    @aa1
    public final ty0<O00> XO0O10;

    @aa1
    public final l94<mq4> XOO0ii0;

    @aa1
    public final String XIi00iiXO = "0c997b55309fdb251dcb1b8cc6c87959";

    /* JADX INFO: renamed from: iO */
    @aa1
    public final String f54869iO = "RTASRManager";

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.iO$OXO1 */
    public static final class OXO1 implements RTASRCallbacks {
        public OXO1() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
            C19038iO.this.XO0O10.setValue(O00.C19012iO.OXO1);
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
            C19038iO.this.XO0O10.setValue(O00.XIi00iiXO.OXO1);
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError rtAsrError, Object obj) {
            Integer numValueOf = rtAsrError != null ? Integer.valueOf(rtAsrError.getCode()) : null;
            String errMsg = rtAsrError != null ? rtAsrError.getErrMsg() : null;
            String sid = rtAsrError != null ? rtAsrError.getSid() : null;
            i1O0OXO1O.OXO1.OXO1(C19038iO.this.f54869iO + " RTASRError :" + numValueOf + " " + errMsg + " " + sid);
            C19038iO.this.XO0O10.setValue(new O00.OXO1(numValueOf, errMsg));
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult rtAsrResult, Object obj) {
            if (rtAsrResult == null) {
                return;
            }
            Integer numValueOf = Integer.valueOf(rtAsrResult.getStatus());
            String data = rtAsrResult.getData();
            String sid = rtAsrResult.getSid();
            Intrinsics.O10IXXX0X(sid, "getSid(...)");
            mq4 mq4Var = new mq4(numValueOf, data, sid, rtAsrResult.getTransResult().getSrc(), rtAsrResult.getTransResult().getDst(), Integer.valueOf(rtAsrResult.getTransResult().getStatus()));
            i1O0OXO1O.OXO1.OXO1(C19038iO.this.f54869iO + " RTASRCallbacks : " + mq4Var);
            C19038iO.this.IiI10X.mo3016iO(mq4Var);
        }
    }

    public C19038iO() {
        ty0<O00> ty0VarOXO1 = l85.OXO1(O00.XIi00iiXO.OXO1);
        this.XO0O10 = ty0VarOXO1;
        this.O00 = iX0XiO.XXI(ty0VarOXO1);
        ry0<mq4> ry0VarXIi00iiXO = m94.XIi00iiXO(0, 64, null, 5, null);
        this.IiI10X = ry0VarXIi00iiXO;
        this.XOO0ii0 = iX0XiO.I0iXXO(ry0VarXIi00iiXO);
        this.I0IIOi = new OXO1();
    }

    public final void I0IIOi() {
        this.XO0O10.setValue(O00.XIi00iiXO.OXO1);
        RTASR rtasr = this.OXO1;
        if (rtasr != null) {
            rtasr.stop();
        }
    }

    @aa1
    public final l94<mq4> IiI10X() {
        return this.XOO0ii0;
    }

    @aa1
    public final k85<O00> O00() {
        return this.O00;
    }

    public final void OIi0(@aa1 byte[] byteArray) {
        Intrinsics.X0O(byteArray, "byteArray");
        RTASR rtasr = this.OXO1;
        if (rtasr != null) {
            rtasr.write(byteArray);
        }
    }

    public final void XO0O10() {
        this.XO0O10.setValue(O00.XIi00iiXO.OXO1);
        RTASR rtasr = this.OXO1;
        if (rtasr != null) {
            rtasr.stop();
        }
        this.OXO1 = null;
    }

    public final void XOO0ii0(@aa1 XO0O10 config) {
        Intrinsics.X0O(config, "config");
        if (this.OXO1 == null) {
            this.OXO1 = new RTASR(this.XIi00iiXO);
        }
        RTASR rtasr = this.OXO1;
        if (rtasr != null) {
            rtasr.lang(config.X0O());
            rtasr.targetLang(config.iIiiO());
            rtasr.transStrategy(config.XX0());
            rtasr.registerCallbacks(this.I0IIOi);
        }
        this.XO0O10.setValue(O00.XIi00iiXO.OXO1);
        RTASR rtasr2 = this.OXO1;
        Integer numValueOf = rtasr2 != null ? Integer.valueOf(rtasr2.start(config.O10IXXX0X())) : null;
        i1O0OXO1O.OXO1.OXO1(this.f54869iO + " Config:" + config + " StartStatus:" + numValueOf);
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.XO0O10.setValue(O00.C19012iO.OXO1);
        }
    }
}
