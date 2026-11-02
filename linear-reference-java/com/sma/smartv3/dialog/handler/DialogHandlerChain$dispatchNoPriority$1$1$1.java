package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
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
@DebugMetadata(c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1$1$1", f = "DialogHandlerChain.kt", i = {0, 0, 0, 1, 1, 2, 2, 2, 2}, l = {64, 66, 85}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DialogHandlerChain$dispatchNoPriority$1$1$1$shouldShow$1", "$this$launch", "shouldShow", "$this$launch", "$this$withLock_u24default$iv", "shouldShow", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0", "L$0", "Z$0", "L$0", "L$1", "Z$0", "I$0"}, v = 1)
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

    /* JADX INFO: renamed from: com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1$1$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1$1$1$1", f = "DialogHandlerChain.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ OiOI0Iii0 $handler;
        int label;

        public AnonymousClass1(FragmentActivity r1, OiOI0Iii0 r2, Continuation<? super AnonymousClass1> r3) {
            this.$activity = r1;
            this.$handler = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.$activity, this.$handler, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L14:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            if (isDestroyed() == true) goto L14;
            OiOI0Iii0 r5 = this.$handler;
            FragmentActivity r2 = this.$activity;
            this.label = 1;
            if (r5.XO0O10(r2, this) != r0) goto L14;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public DialogHandlerChain$dispatchNoPriority$1$1$1(OiOI0Iii0 r1, FragmentActivity r2, Continuation<? super DialogHandlerChain$dispatchNoPriority$1$1$1> r3) {
        this.$handler = r1;
        this.$activity = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        DialogHandlerChain$dispatchNoPriority$1$1$1 r0 = new DialogHandlerChain$dispatchNoPriority$1$1$1(this.$handler, this.$activity, r5);
        r0.L$0 = r4;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((DialogHandlerChain$dispatchNoPriority$1$1$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r11) {
        i00OIXiO r0 = (i00OIXiO) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L10;
        if (r2 != 3) goto L9;
        OiOI0Iii0 r3 = (OiOI0Iii0) this.L$2;
        uy0 r4 = (uy0) this.L$1;
        ResultKt.X1ii(r11);
    L42:
        DialogHandlerChain.OXO1().remove(r3);     // Catch: Throwable -> L37
        Unit r12 = Unit.OXO1;     // Catch: Throwable -> L37
        r4.unlock(null);
    L41:
        return Unit.OXO1;
    L37:
        th = move-exception;
        r4.unlock(null);
        throw th;
    L9:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L10:
        boolean r5 = this.Z$0;
        ResultKt.X1ii(r11);
    L31:
        uy0 r13 = DialogHandlerChain.XIi00iiXO();
        OiOI0Iii0 r6 = this.$handler;
        this.L$0 = SpillingKt.OXO1(r0);
        this.L$1 = r13;
        this.L$2 = r6;
        this.Z$0 = r5;
        this.I$0 = 0;
        this.label = 3;
        if (r13.lock(null, this) != r1) goto L34;
    L33:
        return r1;
    L34:
        r4 = r13;
        r3 = r6;
        goto L42
    L11:
        i00OIXiO r7 = (i00OIXiO) this.L$1;
        ResultKt.X1ii(r11);     // Catch: Throwable -> L14
    L20:
        Object r14 = Result.m6974constructorimpl(Boxing.OXO1(((Boolean) r11).booleanValue()));     // Catch: Throwable -> L14
    L23:
        Boolean r8 = Boxing.OXO1(false);
        if (Result.m6980isFailureimpl(r14) == false) goto L26;
        r14 = r8;
    L26:
        r5 = ((Boolean) r14).booleanValue();
        if (r5 == false) goto L41;
        g10 r15 = IXOX0Xiii.O00();
        AnonymousClass1 r9 = new AnonymousClass1(this.$activity, this.$handler, null);
        this.L$0 = SpillingKt.OXO1(r0);
        this.L$1 = null;
        this.Z$0 = r5;
        this.label = 2;
        if (I100X1.I0IIOi(r15, r9, this) != r1) goto L31;
    L16:
        ResultKt.X1ii(r11);
        OiOI0Iii0 r16 = this.$handler;
        Result.Companion r10 = Result.Companion;     // Catch: Throwable -> L14
        this.L$0 = SpillingKt.OXO1(r0);     // Catch: Throwable -> L14
        this.L$1 = SpillingKt.OXO1(r0);     // Catch: Throwable -> L14
        this.I$0 = 0;     // Catch: Throwable -> L14
        this.label = 1;     // Catch: Throwable -> L14
        r11 = r16.XIi00iiXO(this);     // Catch: Throwable -> L14
        if (r11 != r1) goto L20;
    L14:
        th = move-exception;
        Result.Companion r17 = Result.Companion;
        r14 = Result.m6974constructorimpl(ResultKt.OXO1(th));
        goto L23
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
