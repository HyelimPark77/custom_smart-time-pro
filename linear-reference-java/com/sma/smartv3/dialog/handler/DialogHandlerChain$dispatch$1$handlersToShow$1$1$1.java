package com.sma.smartv3.dialog.handler;

import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatch$1$handlersToShow$1$1$1", f = "DialogHandlerChain.kt", i = {0, 0, 0}, l = {38}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DialogHandlerChain$dispatch$1$handlersToShow$1$1$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
@SourceDebugExtension({"SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1$handlersToShow$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class DialogHandlerChain$dispatch$1$handlersToShow$1$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Pair<? extends OiOI0Iii0, ? extends Boolean>>, Object> {
    final /* synthetic */ OiOI0Iii0 $handler;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public DialogHandlerChain$dispatch$1$handlersToShow$1$1$1(OiOI0Iii0 r1, Continuation<? super DialogHandlerChain$dispatch$1$handlersToShow$1$1$1> r2) {
        this.$handler = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        DialogHandlerChain$dispatch$1$handlersToShow$1$1$1 r0 = new DialogHandlerChain$dispatch$1$handlersToShow$1$1$1(this.$handler, r4);
        r0.L$0 = r3;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Pair<? extends OiOI0Iii0, Boolean>> r2) {
        return ((DialogHandlerChain$dispatch$1$handlersToShow$1$1$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        i00OIXiO r0 = (i00OIXiO) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L12;
        if (r2 != 1) goto L11;
        OiOI0Iii0 r3 = (OiOI0Iii0) this.L$2;
        i00OIXiO r4 = (i00OIXiO) this.L$1;
        ResultKt.X1ii(r7);     // Catch: Throwable -> L8
    L17:
        Object r8 = Result.m6974constructorimpl(Boxing.OXO1(((Boolean) r7).booleanValue()));     // Catch: Throwable -> L8
    L22:
        Boolean r5 = Boxing.OXO1(false);
        if (Result.m6980isFailureimpl(r8) == false) goto L26;
        r8 = r5;
    L26:
        return TuplesKt.OXO1(r3, r8);
    L8:
        Throwable th = th;
    L21:
        Result.Companion r6 = Result.Companion;
        r8 = Result.m6974constructorimpl(ResultKt.OXO1(th));
        goto L22
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L12:
        ResultKt.X1ii(r7);
        OiOI0Iii0 r9 = this.$handler;
        Result.Companion r10 = Result.Companion;     // Catch: Throwable -> L19
        this.L$0 = SpillingKt.OXO1(r0);     // Catch: Throwable -> L19
        this.L$1 = SpillingKt.OXO1(r0);     // Catch: Throwable -> L19
        this.L$2 = r9;     // Catch: Throwable -> L19
        this.I$0 = 0;     // Catch: Throwable -> L19
        this.label = 1;     // Catch: Throwable -> L19
        Object r11 = r9.XIi00iiXO(this);     // Catch: Throwable -> L19
        if (r11 != r1) goto L16;
        return r1;
    L16:
        r3 = r9;
        r7 = r11;
    L19:
        th = move-exception;
        r3 = r9;
        th = th;
        goto L21
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Pair<? extends OiOI0Iii0, ? extends Boolean>> r2) {
        return invoke2(r1, r2);
    }
}
