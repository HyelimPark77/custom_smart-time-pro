package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uy0;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.ui.translate.AudioRepository;
import com.sma.smartv3.util.audio_play.MediaPlayManager;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nLocalSparkChainTranslateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSparkChainTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,191:1\n116#2,10:192\n*S KotlinDebug\n*F\n+ 1 LocalSparkChainTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase\n*L\n77#1:192,10\n*E\n"})
public final class LocalSparkChainTranslateUseCase {

    @aa1
    public final l94<mq4> I0IIOi;

    @aa1
    public final l94<mq4> I0iXXO;

    @aa1
    public final AIRecords I1XOi1;

    @aa1
    public final uy0 IIX1OXO;

    @aa1
    public final MediaPlayManager IO;

    @aa1
    public final cr4 IiI10X;

    @aa1
    public final SparkChainTTS O00;

    @aa1
    public final XO0O10 O10IXXX0X;

    @aa1
    public final ry0<mq4> OIX0iXi;

    @aa1
    public final k85<O00> OIi0;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final k85<Boolean> X0O;

    @aa1
    public final List<LanguageTranslationData> X1ii;

    @aa1
    public final AudioRepository XIi00iiXO;

    @aa1
    public final iO XO0O10;

    @aa1
    public final String XOO0ii0;

    @aa1
    public final k85<Boolean> XXI;

    @aa1
    public final SparkLicenseManager iO;

    public LocalSparkChainTranslateUseCase(@aa1 i00OIXiO r31, @aa1 AudioRepository r32, @aa1 SparkLicenseManager r33, @aa1 iO r34, @aa1 SparkChainTTS r35, @aa1 cr4 r36) {
        Intrinsics.X0O(r31, "scope");
        Intrinsics.X0O(r32, "audioRepo");
        Intrinsics.X0O(r33, "sparkChainLicenseManager");
        Intrinsics.X0O(r34, "translator");
        Intrinsics.X0O(r35, "ttsManager");
        Intrinsics.X0O(r36, "repository");
        this.OXO1 = r31;
        this.XIi00iiXO = r32;
        this.iO = r33;
        this.XO0O10 = r34;
        this.O00 = r35;
        this.IiI10X = r36;
        this.XOO0ii0 = "LocalXunFeiTranslateUseCase";
        this.I0IIOi = r34.IiI10X();
        k85<O00> r3 = r34.O00();
        this.OIi0 = r3;
        this.IO = new MediaPlayManager(r31);
        this.OIX0iXi = m94.XIi00iiXO(0, 64, null, 5, null);
        this.I0iXXO = r34.IiI10X();
        k85<Boolean> r2 = r32.iO();
        this.XXI = r2;
        XO0O10.OXO1 r4 = XO0O10.IO;
        this.X1ii = r4.iO();
        this.O10IXXX0X = r4.OXO1();
        this.X0O = iX0XiO.OXI0Xi(iX0XiO.XO0X10iO(iX0XiO.IXXOO(r3, r2, new LocalSparkChainTranslateUseCase$recordingAndTranslating$1(this, null))), r31, kotlinx.coroutines.flow.OXO1.OXO1.iO(), Boolean.FALSE);
        this.I1XOi1 = new AIRecords(0, 0, null, AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType(), 0, null, null, 0, 0, 0, null, null, null, null, null, 0, null, 131063, null);
        this.IIX1OXO = MutexKt.XIi00iiXO(false, 1, null);
        X1ii();
        XXI();
        OIX0iXi();
        I0iXXO();
    }

    public static final /* synthetic */ XO0O10 I0IIOi(LocalSparkChainTranslateUseCase r0) {
        return r0.O10IXXX0X;
    }

    public static final /* synthetic */ String IiI10X(LocalSparkChainTranslateUseCase r0) {
        return r0.XOO0ii0;
    }

    public static final /* synthetic */ SparkLicenseManager O00(LocalSparkChainTranslateUseCase r0) {
        return r0.iO;
    }

    public static final /* synthetic */ SparkChainTTS OIi0(LocalSparkChainTranslateUseCase r0) {
        return r0.O00;
    }

    public static final /* synthetic */ AIRecords OXO1(LocalSparkChainTranslateUseCase r0) {
        return r0.I1XOi1;
    }

    public static final /* synthetic */ MediaPlayManager XIi00iiXO(LocalSparkChainTranslateUseCase r0) {
        return r0.IO;
    }

    public static final /* synthetic */ cr4 XO0O10(LocalSparkChainTranslateUseCase r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ iO XOO0ii0(LocalSparkChainTranslateUseCase r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ AudioRepository iO(LocalSparkChainTranslateUseCase r0) {
        return r0.XIi00iiXO;
    }

    public final XiOIO I0iXXO() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainTranslateUseCase$collectLicenseState$1(this, null), 2, null);
    }

    public final void I1() {
        if ((getValue() instanceof O00.iO) == true) goto L5;
    L8:
        XiOIii1();
        return;
    L5:
        if (getValue().booleanValue() == false) goto L8;
        OX();
        OiIIX101O();
    }

    @aa1
    public final l94<mq4> I1XOi1() {
        return this.I0iXXO;
    }

    public final void II1Xi0(@aa1 Function1<? super XO0O10, Unit> r4) {
        Intrinsics.X0O(r4, "update");
        r4.invoke(this.O10IXXX0X);
        i1O0OXO1O.OXO1.OXO1(this.XOO0ii0 + " Config:" + this.O10IXXX0X);
    }

    @aa1
    public final k85<O00> IIX1OXO() {
        return this.OIi0;
    }

    public final void IO() {
        this.IO.stop();
        OX();
        this.O00.XOO0ii0();
    }

    @aa1
    public final List<LanguageTranslationData> O10IXXX0X() {
        return this.X1ii;
    }

    public final void OII() {
        this.IO.stop();
    }

    public final XiOIO OIX0iXi() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainTranslateUseCase$collectAudioPathPlay$1(this, null), 2, null);
    }

    public final void OX() {
        i1O0OXO1O.OXO1.OXO1(this.XOO0ii0 + " stopRecord");
        this.XIi00iiXO.stop();
        this.XO0O10.I0IIOi();
    }

    public final XiOIO OiIIX101O() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainTranslateUseCase$save2DataBase$1(this, null), 2, null);
    }

    public final void X01IiOiIi(boolean r2) {
        this.O10IXXX0X.iOOX010X(r2);
        if (r2 == true) goto L6;
        this.IO.X1ii();
        return;
    }

    @aa1
    public final k85<Boolean> X0O() {
        return this.X0O;
    }

    public final XiOIO X1ii() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainTranslateUseCase$collectTranslatorState$1(this, null), 2, null);
    }

    public final void XX0() {
        this.IO.X1ii();
    }

    public final XiOIO XXI() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new LocalSparkChainTranslateUseCase$collectResultToTTS$1(this, null), 2, null);
    }

    @aa1
    public final l94<mq4> XiOIO() {
        return this.I0IIOi;
    }

    public final void XiOIii1() {
        this.iO.XO0O10();
        int r2 = 2;
        String r3 = null;
        String r4 = "-10086";
        String r5 = null;
        String r6 = null;
        iO(new mq4(r2, r3, r4, r5, r6, r2, 26, null));
    }

    @aa1
    public final k85<Boolean> iIiiO() {
        return this.XXI;
    }

    @tb1
    public final Object iOOX010X(@aa1 Function1<? super AIRecords, Unit> r6, @aa1 Continuation<? super Unit> r7) {
        if ((r7 instanceof LocalSparkChainTranslateUseCase$updateAiRecord$1) == false) goto L7;
        LocalSparkChainTranslateUseCase$updateAiRecord$1 r0 = (LocalSparkChainTranslateUseCase$updateAiRecord$1) r7;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        uy0 r9 = (uy0) r0.L$1;
        Function1<? super AIRecords, Unit> r4 = (Function1) r0.L$0;
        ResultKt.X1ii(r8);
        uy0 r10 = r9;
        r6 = r4;
    L23:
        r6.invoke(this.I1XOi1);     // Catch: Throwable -> L20
        r10.unlock(null);
        return Unit.OXO1;
    L20:
        th = move-exception;
        r10.unlock(null);
        throw th;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r8);
        r10 = this.IIX1OXO;
        r0.L$0 = r6;
        r0.L$1 = r10;
        r0.I$0 = 0;
        r0.label = 1;
        if (r10.lock(null, r0) != r2) goto L23;
        return r2;
    L7:
        r0 = new LocalSparkChainTranslateUseCase$updateAiRecord$1(this, r7);
        goto L8
    }
}
