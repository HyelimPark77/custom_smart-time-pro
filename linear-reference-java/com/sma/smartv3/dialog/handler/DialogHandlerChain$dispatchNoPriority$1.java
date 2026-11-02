package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1", f = "DialogHandlerChain.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1869#2,2:80\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1\n*L\n62#1:80,2\n*E\n"})
public final class DialogHandlerChain$dispatchNoPriority$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    private /* synthetic */ Object L$0;
    int label;

    public DialogHandlerChain$dispatchNoPriority$1(FragmentActivity r1, Continuation<? super DialogHandlerChain$dispatchNoPriority$1> r2) {
        this.$activity = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        DialogHandlerChain$dispatchNoPriority$1 r0 = new DialogHandlerChain$dispatchNoPriority$1(this.$activity, r4);
        r0.L$0 = r3;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((DialogHandlerChain$dispatchNoPriority$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r8) {
        i00OIXiO r1 = (i00OIXiO) this.L$0;
        pb.I0iXXO();
        if (this.label != 0) goto L15;
        ResultKt.X1ii(r8);
        if (isDestroyed() == true) goto L7;
        List r9 = DialogHandlerChain.OXO1();
        FragmentActivity r0 = this.$activity;
        Iterator r10 = r9.iterator();
    L10:
        if (r10.hasNext() == false) goto L13;
        OiOI0Iii0 r2 = (OiOI0Iii0) r10.next();
        I100X1.O00(r1, IXOX0Xiii.iO(), null, new DialogHandlerChain$dispatchNoPriority$1$1$1(r2, r0, null), 2, null);
        goto L10
    L13:
        return Unit.OXO1;
    L7:
        return Unit.OXO1;
    L15:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
