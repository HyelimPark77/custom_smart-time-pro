package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.translate.AudioRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$save2DataBase$1", m39466f = "LocalSparkChainTranslateUseCase.kt", m39467i = {1}, m39468l = {144, 146}, m39469m = "invokeSuspend", m39470n = {"pcmFilePath"}, m39472s = {"L$0"}, m39473v = 1)
public final class LocalSparkChainTranslateUseCase$save2DataBase$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainTranslateUseCase$save2DataBase$1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase, Continuation<? super LocalSparkChainTranslateUseCase$save2DataBase$1> continuation) {
        super(2, continuation);
        this.this$0 = localSparkChainTranslateUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, AIRecords aIRecords) {
        aIRecords.setMAudioPath(str);
        return Unit.OXO1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSparkChainTranslateUseCase$save2DataBase$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalSparkChainTranslateUseCase$save2DataBase$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final String str;
        String str2;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            AudioRepository audioRepository = this.this$0.XIi00iiXO;
            this.label = 1;
            obj = audioRepository.O00(this);
            if (obj != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i == 1) {
            ResultKt.X1ii(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$0;
            ResultKt.X1ii(obj);
        }
        str = str2;
        long jI0iXXO = this.this$0.IiI10X.I0iXXO(this.this$0.I1XOi1);
        i1O0OXO1O.OXO1.OXO1(this.this$0.XOO0ii0 + " pcmResult:" + jI0iXXO + " aiRecord:" + this.this$0.I1XOi1 + " path:" + str);
        return Unit.OXO1;
        str = (String) obj;
        if (str != null && str.length() != 0) {
            LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase = this.this$0;
            Function1<? super AIRecords, Unit> function1 = new Function1() { // from class: com.sma.smartv3.ui.translate.sparkchain.XIi00iiXO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return LocalSparkChainTranslateUseCase$save2DataBase$1.invokeSuspend$lambda$0(str, (AIRecords) obj2);
                }
            };
            this.L$0 = str;
            this.label = 2;
            if (localSparkChainTranslateUseCase.iOOX010X(function1, this) != objI0iXXO) {
                str2 = str;
                str = str2;
            }
            return objI0iXXO;
        }
        long jI0iXXO2 = this.this$0.IiI10X.I0iXXO(this.this$0.I1XOi1);
        i1O0OXO1O.OXO1.OXO1(this.this$0.XOO0ii0 + " pcmResult:" + jI0iXXO2 + " aiRecord:" + this.this$0.I1XOi1 + " path:" + str);
        return Unit.OXO1;
    }
}
