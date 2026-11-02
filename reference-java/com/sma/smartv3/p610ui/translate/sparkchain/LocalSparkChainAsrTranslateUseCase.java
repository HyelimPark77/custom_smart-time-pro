package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.I0OX;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b06;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1iII1i1;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.np4;
import com.android.mltcode.paycertificationapi.op4;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.util.audio_play.MediaPlayManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalSparkChainAsrTranslateUseCase {

    @aa1
    public final XO0O10 I0IIOi;

    @aa1
    public final l94<String> I0iXXO;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final k85<I0OX> f54829IO;

    @aa1
    public final SparkChainTTS IiI10X;

    @aa1
    public final op4 O00;

    @tb1
    public XiOIO O10IXXX0X;

    @aa1
    public l94<String> OIX0iXi;

    @aa1
    public final l94<i1iII1i1> OIi0;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final MediaPlayManager X1ii;

    @aa1
    public final b06 XIi00iiXO;

    @aa1
    public final np4 XO0O10;

    @aa1
    public final SparkChainSessionRepository XOO0ii0;

    @aa1
    public final k85<Boolean> XXI;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final SparkLicenseManager f54830iO;

    public LocalSparkChainAsrTranslateUseCase(@aa1 i00OIXiO scope, @aa1 b06 audioRepo, @aa1 SparkLicenseManager sparkChainLicenseManager, @aa1 np4 asrTranslator, @aa1 op4 its, @aa1 SparkChainTTS tts, @aa1 SparkChainSessionRepository repository) {
        Intrinsics.X0O(scope, "scope");
        Intrinsics.X0O(audioRepo, "audioRepo");
        Intrinsics.X0O(sparkChainLicenseManager, "sparkChainLicenseManager");
        Intrinsics.X0O(asrTranslator, "asrTranslator");
        Intrinsics.X0O(its, "its");
        Intrinsics.X0O(tts, "tts");
        Intrinsics.X0O(repository, "repository");
        this.OXO1 = scope;
        this.XIi00iiXO = audioRepo;
        this.f54830iO = sparkChainLicenseManager;
        this.XO0O10 = asrTranslator;
        this.O00 = its;
        this.IiI10X = tts;
        this.XOO0ii0 = repository;
        this.I0IIOi = XO0O10.f54862IO.OXO1();
        this.OIi0 = asrTranslator.O00();
        this.f54829IO = asrTranslator.IiI10X();
        this.OIX0iXi = its.m2775iO();
        this.I0iXXO = tts.O00();
        this.XXI = audioRepo.mo628iO();
        this.X1ii = new MediaPlayManager(scope);
        XXI();
    }

    public final void I0iXXO() {
        m38770OX();
        m38769I1();
        this.IiI10X.XOO0ii0();
        this.O10IXXX0X = null;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m38769I1() {
        XiOIO xiOIO = this.O10IXXX0X;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        np4.OIi0(this.XO0O10, false, 1, null);
        this.XIi00iiXO.stop();
    }

    @aa1
    public final l94<String> I1XOi1() {
        return this.I0iXXO;
    }

    @aa1
    public final l94<String> IIX1OXO() {
        return this.OIX0iXi;
    }

    @aa1
    public final l94<i1iII1i1> O10IXXX0X() {
        return this.OIi0;
    }

    public final void OII() {
        this.f54830iO.XO0O10();
    }

    /* JADX INFO: renamed from: OX */
    public final void m38770OX() {
        this.X1ii.stop();
    }

    @aa1
    public final XiOIO OiIIX101O(@aa1 iOIXXXII0 aiMsg) {
        Intrinsics.X0O(aiMsg, "aiMsg");
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainAsrTranslateUseCase$saveItem$1(this, aiMsg, null), 2, null);
    }

    @aa1
    public final k85<I0OX> X0O() {
        return this.f54829IO;
    }

    public final void X1ii(@aa1 String path) {
        Intrinsics.X0O(path, "path");
        this.X1ii.OXO1(path);
    }

    @aa1
    public final XiOIO XX0() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainAsrTranslateUseCase$saveAllData$1(this, null), 2, null);
    }

    public final void XXI() {
        XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$1(this, null), 2, null);
        XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$2(this, null), 2, null);
        XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$3(this, null), 2, null);
        XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$4(this, null), 2, null);
    }

    @aa1
    public final k85<Boolean> XiOIO() {
        return this.XXI;
    }

    public final void XiOIii1(@aa1 l94<String> l94Var) {
        Intrinsics.X0O(l94Var, "<set-?>");
        this.OIX0iXi = l94Var;
    }

    public final void iIiiO() {
        this.X1ii.X1ii();
    }

    public final void iOOX010X(@aa1 Function1<? super XO0O10, Unit> update) {
        Intrinsics.X0O(update, "update");
        update.invoke2(this.I0IIOi);
    }
}
