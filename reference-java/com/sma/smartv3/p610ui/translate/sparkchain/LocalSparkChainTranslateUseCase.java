package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uy0;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.translate.AudioRepository;
import com.sma.smartv3.util.audio_play.MediaPlayManager;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.flow.OXO1;
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

    /* JADX INFO: renamed from: IO */
    @aa1
    public final MediaPlayManager f54843IO;

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
    public final C19038iO XO0O10;

    @aa1
    public final String XOO0ii0;

    @aa1
    public final k85<Boolean> XXI;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final SparkLicenseManager f54844iO;

    public LocalSparkChainTranslateUseCase(@aa1 i00OIXiO scope, @aa1 AudioRepository audioRepo, @aa1 SparkLicenseManager sparkChainLicenseManager, @aa1 C19038iO translator, @aa1 SparkChainTTS ttsManager, @aa1 cr4 repository) {
        Intrinsics.X0O(scope, "scope");
        Intrinsics.X0O(audioRepo, "audioRepo");
        Intrinsics.X0O(sparkChainLicenseManager, "sparkChainLicenseManager");
        Intrinsics.X0O(translator, "translator");
        Intrinsics.X0O(ttsManager, "ttsManager");
        Intrinsics.X0O(repository, "repository");
        this.OXO1 = scope;
        this.XIi00iiXO = audioRepo;
        this.f54844iO = sparkChainLicenseManager;
        this.XO0O10 = translator;
        this.O00 = ttsManager;
        this.IiI10X = repository;
        this.XOO0ii0 = "LocalXunFeiTranslateUseCase";
        this.I0IIOi = translator.IiI10X();
        k85<O00> k85VarO00 = translator.O00();
        this.OIi0 = k85VarO00;
        this.f54843IO = new MediaPlayManager(scope);
        this.OIX0iXi = m94.XIi00iiXO(0, 64, null, 5, null);
        this.I0iXXO = translator.IiI10X();
        k85<Boolean> k85VarMo628iO = audioRepo.mo628iO();
        this.XXI = k85VarMo628iO;
        XO0O10.OXO1 oxo1 = XO0O10.f54862IO;
        this.X1ii = oxo1.m38785iO();
        this.O10IXXX0X = oxo1.OXO1();
        this.X0O = iX0XiO.OXI0Xi(iX0XiO.XO0X10iO(iX0XiO.IXXOO(k85VarO00, k85VarMo628iO, new LocalSparkChainTranslateUseCase$recordingAndTranslating$1(this, null))), scope, OXO1.OXO1.m39915iO(), Boolean.FALSE);
        this.I1XOi1 = new AIRecords(0, 0L, null, AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType(), 0, null, null, 0, 0, 0, null, null, null, null, null, 0, null, 131063, null);
        this.IIX1OXO = MutexKt.XIi00iiXO(false, 1, null);
        X1ii();
        XXI();
        OIX0iXi();
        I0iXXO();
    }

    public final XiOIO I0iXXO() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainTranslateUseCase$collectLicenseState$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m38772I1() {
        if (!(this.OIi0.getValue() instanceof O00.C19012iO) || !this.XXI.getValue().booleanValue()) {
            XiOIii1();
        } else {
            m38774OX();
            OiIIX101O();
        }
    }

    @aa1
    public final l94<mq4> I1XOi1() {
        return this.I0iXXO;
    }

    public final void II1Xi0(@aa1 Function1<? super XO0O10, Unit> update) {
        Intrinsics.X0O(update, "update");
        update.invoke2(this.O10IXXX0X);
        i1O0OXO1O.OXO1.OXO1(this.XOO0ii0 + " Config:" + this.O10IXXX0X);
    }

    @aa1
    public final k85<O00> IIX1OXO() {
        return this.OIi0;
    }

    /* JADX INFO: renamed from: IO */
    public final void m38773IO() {
        this.f54843IO.stop();
        m38774OX();
        this.O00.XOO0ii0();
    }

    @aa1
    public final List<LanguageTranslationData> O10IXXX0X() {
        return this.X1ii;
    }

    public final void OII() {
        this.f54843IO.stop();
    }

    public final XiOIO OIX0iXi() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainTranslateUseCase$collectAudioPathPlay$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: OX */
    public final void m38774OX() {
        i1O0OXO1O.OXO1.OXO1(this.XOO0ii0 + " stopRecord");
        this.XIi00iiXO.stop();
        this.XO0O10.I0IIOi();
    }

    public final XiOIO OiIIX101O() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainTranslateUseCase$save2DataBase$1(this, null), 2, null);
    }

    public final void X01IiOiIi(boolean z) {
        this.O10IXXX0X.iOOX010X(z);
        if (z) {
            return;
        }
        this.f54843IO.X1ii();
    }

    @aa1
    public final k85<Boolean> X0O() {
        return this.X0O;
    }

    public final XiOIO X1ii() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainTranslateUseCase$collectTranslatorState$1(this, null), 2, null);
    }

    public final void XX0() {
        this.f54843IO.X1ii();
    }

    public final XiOIO XXI() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new LocalSparkChainTranslateUseCase$collectResultToTTS$1(this, null), 2, null);
    }

    @aa1
    public final l94<mq4> XiOIO() {
        return this.I0IIOi;
    }

    public final void XiOIii1() {
        this.f54844iO.XO0O10();
        this.OIX0iXi.mo3016iO(new mq4(2, null, "-10086", null, null, 2, 26, null));
    }

    @aa1
    public final k85<Boolean> iIiiO() {
        return this.XXI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public final Object iOOX010X(@aa1 Function1<? super AIRecords, Unit> function1, @aa1 Continuation<? super Unit> continuation) {
        LocalSparkChainTranslateUseCase$updateAiRecord$1 localSparkChainTranslateUseCase$updateAiRecord$1;
        uy0 uy0Var;
        if (continuation instanceof LocalSparkChainTranslateUseCase$updateAiRecord$1) {
            localSparkChainTranslateUseCase$updateAiRecord$1 = (LocalSparkChainTranslateUseCase$updateAiRecord$1) continuation;
            int i = localSparkChainTranslateUseCase$updateAiRecord$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localSparkChainTranslateUseCase$updateAiRecord$1.label = i - Integer.MIN_VALUE;
            } else {
                localSparkChainTranslateUseCase$updateAiRecord$1 = new LocalSparkChainTranslateUseCase$updateAiRecord$1(this, continuation);
            }
        } else {
            localSparkChainTranslateUseCase$updateAiRecord$1 = new LocalSparkChainTranslateUseCase$updateAiRecord$1(this, continuation);
        }
        Object obj = localSparkChainTranslateUseCase$updateAiRecord$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = localSparkChainTranslateUseCase$updateAiRecord$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            uy0Var = this.IIX1OXO;
            localSparkChainTranslateUseCase$updateAiRecord$1.L$0 = function1;
            localSparkChainTranslateUseCase$updateAiRecord$1.L$1 = uy0Var;
            localSparkChainTranslateUseCase$updateAiRecord$1.I$0 = 0;
            localSparkChainTranslateUseCase$updateAiRecord$1.label = 1;
            if (uy0Var.lock(null, localSparkChainTranslateUseCase$updateAiRecord$1) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uy0 uy0Var2 = (uy0) localSparkChainTranslateUseCase$updateAiRecord$1.L$1;
            Function1<? super AIRecords, Unit> function2 = (Function1) localSparkChainTranslateUseCase$updateAiRecord$1.L$0;
            ResultKt.X1ii(obj);
            uy0Var = uy0Var2;
            function1 = function2;
        }
        try {
            function1.invoke2(this.I1XOi1);
            return Unit.OXO1;
        } finally {
            uy0Var.unlock(null);
        }
    }
}
