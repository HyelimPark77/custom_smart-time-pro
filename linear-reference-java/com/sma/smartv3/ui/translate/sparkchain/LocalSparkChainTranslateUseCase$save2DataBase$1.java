package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.ui.translate.AudioRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$save2DataBase$1", f = "LocalSparkChainTranslateUseCase.kt", i = {1}, l = {144, 146}, m = "invokeSuspend", n = {"pcmFilePath"}, s = {"L$0"}, v = 1)
public final class LocalSparkChainTranslateUseCase$save2DataBase$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    public LocalSparkChainTranslateUseCase$save2DataBase$1(LocalSparkChainTranslateUseCase r1, Continuation<? super LocalSparkChainTranslateUseCase$save2DataBase$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    public static /* synthetic */ Unit O00(String r0, AIRecords r1) {
        return invokeSuspend$lambda$0(r0, r1);
    }

    private static final Unit invokeSuspend$lambda$0(String r0, AIRecords r1) {
        r1.setMAudioPath(r0);
        return Unit.OXO1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new LocalSparkChainTranslateUseCase$save2DataBase$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalSparkChainTranslateUseCase$save2DataBase$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        String r2 = (String) this.L$0;
        ResultKt.X1ii(r7);
    L22:
        final String r8 = r2;
    L23:
        long r3 = LocalSparkChainTranslateUseCase.XO0O10(this.this$0).I0iXXO(LocalSparkChainTranslateUseCase.OXO1(this.this$0));
        i1O0OXO1O.OXO1.OXO1(LocalSparkChainTranslateUseCase.IiI10X(this.this$0) + " pcmResult:" + r3 + " aiRecord:" + LocalSparkChainTranslateUseCase.OXO1(this.this$0) + " path:" + r8);
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r7);
    L13:
        r8 = (String) r7;
        if (r8 == null) goto L23;
        if (r8.length() == 0) goto L23;
        LocalSparkChainTranslateUseCase r4 = this.this$0;
        Function1<? super AIRecords, Unit> r5 = new XIi00iiXO(r8);
        this.L$0 = r8;
        this.label = 2;
        if (r4.iOOX010X(r5, this) != r0) goto L21;
    L20:
        return r0;
    L21:
        r2 = r8;
        goto L22
    L10:
        ResultKt.X1ii(r7);
        AudioRepository r9 = LocalSparkChainTranslateUseCase.iO(this.this$0);
        this.label = 1;
        r7 = r9.O00(this);
        if (r7 != r0) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
