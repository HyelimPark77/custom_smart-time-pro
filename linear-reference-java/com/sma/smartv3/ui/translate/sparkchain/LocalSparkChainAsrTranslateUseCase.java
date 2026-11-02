package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.I0OX;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
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

    @aa1
    public final k85<I0OX> IO;

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

    @aa1
    public final SparkLicenseManager iO;

    public LocalSparkChainAsrTranslateUseCase(@aa1 i00OIXiO r2, @aa1 b06 r3, @aa1 SparkLicenseManager r4, @aa1 np4 r5, @aa1 op4 r6, @aa1 SparkChainTTS r7, @aa1 SparkChainSessionRepository r8) {
        Intrinsics.X0O(r2, "scope");
        Intrinsics.X0O(r3, "audioRepo");
        Intrinsics.X0O(r4, "sparkChainLicenseManager");
        Intrinsics.X0O(r5, "asrTranslator");
        Intrinsics.X0O(r6, "its");
        Intrinsics.X0O(r7, "tts");
        Intrinsics.X0O(r8, "repository");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
        this.iO = r4;
        this.XO0O10 = r5;
        this.O00 = r6;
        this.IiI10X = r7;
        this.XOO0ii0 = r8;
        this.I0IIOi = XO0O10.IO.OXO1();
        this.OIi0 = r5.O00();
        this.IO = r5.IiI10X();
        this.OIX0iXi = r6.iO();
        this.I0iXXO = r7.O00();
        this.XXI = r3.iO();
        this.X1ii = new MediaPlayManager(r2);
        XXI();
    }

    public static final /* synthetic */ i00OIXiO I0IIOi(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.OXO1;
    }

    public static final /* synthetic */ SparkChainTTS IO(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ op4 IiI10X(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.O00;
    }

    public static final /* synthetic */ XO0O10 O00(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.I0IIOi;
    }

    public static final /* synthetic */ void OIX0iXi(LocalSparkChainAsrTranslateUseCase r0, XiOIO r1) {
        r0.O10IXXX0X = r1;
    }

    public static final /* synthetic */ SparkLicenseManager OIi0(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.iO;
    }

    public static final /* synthetic */ XiOIO OXO1(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.O10IXXX0X;
    }

    public static final /* synthetic */ np4 XIi00iiXO(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ b06 XO0O10(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ SparkChainSessionRepository XOO0ii0(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.XOO0ii0;
    }

    public static final /* synthetic */ MediaPlayManager iO(LocalSparkChainAsrTranslateUseCase r0) {
        return r0.X1ii;
    }

    public final void I0iXXO() {
        OX();
        I1();
        this.IiI10X.XOO0ii0();
        this.O10IXXX0X = null;
    }

    public final void I1() {
        XiOIO r0 = this.O10IXXX0X;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        np4.OIi0(this.XO0O10, false, 1, null);
        stop();
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
        this.iO.XO0O10();
    }

    public final void OX() {
        this.X1ii.stop();
    }

    @aa1
    public final XiOIO OiIIX101O(@aa1 iOIXXXII0 r8) {
        Intrinsics.X0O(r8, "aiMsg");
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainAsrTranslateUseCase$saveItem$1(this, r8, null), 2, null);
    }

    @aa1
    public final k85<I0OX> X0O() {
        return this.IO;
    }

    public final void X1ii(@aa1 String r2) {
        Intrinsics.X0O(r2, "path");
        this.X1ii.OXO1(r2);
    }

    @aa1
    public final XiOIO XX0() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainAsrTranslateUseCase$saveAllData$1(this, null), 2, null);
    }

    public final void XXI() {
        I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$1(this, null), 2, null);
        I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$2(this, null), 2, null);
        I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$3(this, null), 2, null);
        I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainAsrTranslateUseCase$collectData$4(this, null), 2, null);
    }

    @aa1
    public final k85<Boolean> XiOIO() {
        return this.XXI;
    }

    public final void XiOIii1(@aa1 l94<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.OIX0iXi = r2;
    }

    public final void iIiiO() {
        this.X1ii.X1ii();
    }

    public final void iOOX010X(@aa1 Function1<? super XO0O10, Unit> r2) {
        Intrinsics.X0O(r2, "update");
        r2.invoke(this.I0IIOi);
    }
}
