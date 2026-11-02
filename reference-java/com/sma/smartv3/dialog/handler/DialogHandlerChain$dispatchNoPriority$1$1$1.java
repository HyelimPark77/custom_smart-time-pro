package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.uy0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1$1$1", m39466f = "DialogHandlerChain.kt", m39467i = {0, 0, 0, 1, 1, 2, 2, 2, 2}, m39468l = {64, 66, 85}, m39469m = "invokeSuspend", m39470n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DialogHandlerChain$dispatchNoPriority$1$1$1$shouldShow$1", "$this$launch", "shouldShow", "$this$launch", "$this$withLock_u24default$iv", "shouldShow", "$i$f$withLock"}, m39472s = {"L$0", "L$1", "I$0", "L$0", "Z$0", "L$0", "L$1", "Z$0", "I$0"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,79:1\n1#2:80\n116#3,10:81\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1\n*L\n67#1:81,10\n*E\n"})
public final class DialogHandlerChain$dispatchNoPriority$1$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ OiOI0Iii0 $handler;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1$1$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1$1$1$1", m39466f = "DialogHandlerChain.kt", m39467i = {}, m39468l = {66}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C185771 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ OiOI0Iii0 $handler;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185771(FragmentActivity fragmentActivity, OiOI0Iii0 oiOI0Iii0, Continuation<? super C185771> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$handler = oiOI0Iii0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C185771(this.$activity, this.$handler, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C185771) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                if (!this.$activity.isDestroyed()) {
                    OiOI0Iii0 oiOI0Iii0 = this.$handler;
                    FragmentActivity fragmentActivity = this.$activity;
                    this.label = 1;
                    if (oiOI0Iii0.XO0O10(fragmentActivity, this) == objI0iXXO) {
                        return objI0iXXO;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHandlerChain$dispatchNoPriority$1$1$1(OiOI0Iii0 oiOI0Iii0, FragmentActivity fragmentActivity, Continuation<? super DialogHandlerChain$dispatchNoPriority$1$1$1> continuation) {
        super(2, continuation);
        this.$handler = oiOI0Iii0;
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogHandlerChain$dispatchNoPriority$1$1$1 dialogHandlerChain$dispatchNoPriority$1$1$1 = new DialogHandlerChain$dispatchNoPriority$1$1$1(this.$handler, this.$activity, continuation);
        dialogHandlerChain$dispatchNoPriority$1$1$1.L$0 = obj;
        return dialogHandlerChain$dispatchNoPriority$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((DialogHandlerChain$dispatchNoPriority$1$1$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM48333constructorimpl;
        boolean zBooleanValue;
        uy0 uy0Var;
        OiOI0Iii0 oiOI0Iii0;
        uy0 uy0Var2;
        OiOI0Iii0 oiOI0Iii1;
        i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.X1ii(obj);
                OiOI0Iii0 oiOI0Iii2 = this.$handler;
                Result.Companion companion = Result.Companion;
                this.L$0 = SpillingKt.OXO1(i00oixio);
                this.L$1 = SpillingKt.OXO1(i00oixio);
                this.I$0 = 0;
                this.label = 1;
                obj = oiOI0Iii2.XIi00iiXO(this);
                if (obj == objI0iXXO) {
                }
                return objI0iXXO;
            }
            if (i == 1) {
                ResultKt.X1ii(obj);
            } else {
                if (i == 2) {
                    zBooleanValue = this.Z$0;
                    ResultKt.X1ii(obj);
                    uy0Var = DialogHandlerChain.f51198iO;
                    oiOI0Iii0 = this.$handler;
                    this.L$0 = SpillingKt.OXO1(i00oixio);
                    this.L$1 = uy0Var;
                    this.L$2 = oiOI0Iii0;
                    this.Z$0 = zBooleanValue;
                    this.I$0 = 0;
                    this.label = 3;
                    if (uy0Var.lock(null, this) != objI0iXXO) {
                        uy0Var2 = uy0Var;
                        oiOI0Iii1 = oiOI0Iii0;
                    }
                    return objI0iXXO;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oiOI0Iii1 = (OiOI0Iii0) this.L$2;
                uy0Var2 = (uy0) this.L$1;
                ResultKt.X1ii(obj);
            }
            try {
                DialogHandlerChain.XIi00iiXO.remove(oiOI0Iii1);
                Unit unit = Unit.OXO1;
                return Unit.OXO1;
            } finally {
                uy0Var2.unlock(null);
            }
            objM48333constructorimpl = Result.m48333constructorimpl(Boxing.OXO1(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM48333constructorimpl = Result.m48333constructorimpl(ResultKt.OXO1(th));
        }
        Boolean boolOXO1 = Boxing.OXO1(false);
        if (Result.m48339isFailureimpl(objM48333constructorimpl)) {
            objM48333constructorimpl = boolOXO1;
        }
        zBooleanValue = ((Boolean) objM48333constructorimpl).booleanValue();
        if (zBooleanValue) {
            g10 g10VarO00 = IXOX0Xiii.O00();
            C185771 c185771 = new C185771(this.$activity, this.$handler, null);
            this.L$0 = SpillingKt.OXO1(i00oixio);
            this.L$1 = null;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (I100X1.I0IIOi(g10VarO00, c185771, this) != objI0iXXO) {
                uy0Var = DialogHandlerChain.f51198iO;
                oiOI0Iii0 = this.$handler;
                this.L$0 = SpillingKt.OXO1(i00oixio);
                this.L$1 = uy0Var;
                this.L$2 = oiOI0Iii0;
                this.Z$0 = zBooleanValue;
                this.I$0 = 0;
                this.label = 3;
                if (uy0Var.lock(null, this) != objI0iXXO) {
                    uy0Var2 = uy0Var;
                    oiOI0Iii1 = oiOI0Iii0;
                    DialogHandlerChain.XIi00iiXO.remove(oiOI0Iii1);
                    Unit unit2 = Unit.OXO1;
                }
            }
            return objI0iXXO;
        }
        return Unit.OXO1;
    }
}
