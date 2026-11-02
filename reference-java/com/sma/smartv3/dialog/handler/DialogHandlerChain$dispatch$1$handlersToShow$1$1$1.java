package com.sma.smartv3.dialog.handler;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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
@DebugMetadata(m39465c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatch$1$handlersToShow$1$1$1", m39466f = "DialogHandlerChain.kt", m39467i = {0, 0, 0}, m39468l = {38}, m39469m = "invokeSuspend", m39470n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DialogHandlerChain$dispatch$1$handlersToShow$1$1$1$1"}, m39472s = {"L$0", "L$1", "I$0"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1$handlersToShow$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class DialogHandlerChain$dispatch$1$handlersToShow$1$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Pair<? extends OiOI0Iii0, ? extends Boolean>>, Object> {
    final /* synthetic */ OiOI0Iii0 $handler;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHandlerChain$dispatch$1$handlersToShow$1$1$1(OiOI0Iii0 oiOI0Iii0, Continuation<? super DialogHandlerChain$dispatch$1$handlersToShow$1$1$1> continuation) {
        super(2, continuation);
        this.$handler = oiOI0Iii0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogHandlerChain$dispatch$1$handlersToShow$1$1$1 dialogHandlerChain$dispatch$1$handlersToShow$1$1$1 = new DialogHandlerChain$dispatch$1$handlersToShow$1$1$1(this.$handler, continuation);
        dialogHandlerChain$dispatch$1$handlersToShow$1$1$1.L$0 = obj;
        return dialogHandlerChain$dispatch$1$handlersToShow$1$1$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Pair<? extends OiOI0Iii0, Boolean>> continuation) {
        return ((DialogHandlerChain$dispatch$1$handlersToShow$1$1$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OiOI0Iii0 oiOI0Iii0;
        Throwable th;
        Object objM48333constructorimpl;
        i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            OiOI0Iii0 oiOI0Iii1 = this.$handler;
            try {
                Result.Companion companion = Result.Companion;
                this.L$0 = SpillingKt.OXO1(i00oixio);
                this.L$1 = SpillingKt.OXO1(i00oixio);
                this.L$2 = oiOI0Iii1;
                this.I$0 = 0;
                this.label = 1;
                Object objXIi00iiXO = oiOI0Iii1.XIi00iiXO(this);
                if (objXIi00iiXO == objI0iXXO) {
                    return objI0iXXO;
                }
                oiOI0Iii0 = oiOI0Iii1;
                obj = objXIi00iiXO;
            } catch (Throwable th2) {
                oiOI0Iii0 = oiOI0Iii1;
                th = th2;
                Result.Companion companion2 = Result.Companion;
                objM48333constructorimpl = Result.m48333constructorimpl(ResultKt.OXO1(th));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oiOI0Iii0 = (OiOI0Iii0) this.L$2;
            try {
                ResultKt.X1ii(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.Companion;
                objM48333constructorimpl = Result.m48333constructorimpl(ResultKt.OXO1(th));
            }
        }
        objM48333constructorimpl = Result.m48333constructorimpl(Boxing.OXO1(((Boolean) obj).booleanValue()));
        Boolean boolOXO1 = Boxing.OXO1(false);
        if (Result.m48339isFailureimpl(objM48333constructorimpl)) {
            objM48333constructorimpl = boolOXO1;
        }
        return TuplesKt.OXO1(oiOI0Iii0, objM48333constructorimpl);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object invoke2(i00OIXiO i00oixio, Continuation<? super Pair<? extends OiOI0Iii0, ? extends Boolean>> continuation) {
        return invoke2(i00oixio, (Continuation<? super Pair<? extends OiOI0Iii0, Boolean>>) continuation);
    }
}
