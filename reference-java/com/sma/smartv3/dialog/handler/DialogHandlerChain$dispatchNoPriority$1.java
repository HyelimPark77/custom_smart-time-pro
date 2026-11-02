package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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
@DebugMetadata(m39465c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1", m39466f = "DialogHandlerChain.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
@SourceDebugExtension({"SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1869#2,2:80\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1\n*L\n62#1:80,2\n*E\n"})
public final class DialogHandlerChain$dispatchNoPriority$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHandlerChain$dispatchNoPriority$1(FragmentActivity fragmentActivity, Continuation<? super DialogHandlerChain$dispatchNoPriority$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogHandlerChain$dispatchNoPriority$1 dialogHandlerChain$dispatchNoPriority$1 = new DialogHandlerChain$dispatchNoPriority$1(this.$activity, continuation);
        dialogHandlerChain$dispatchNoPriority$1.L$0 = obj;
        return dialogHandlerChain$dispatchNoPriority$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((DialogHandlerChain$dispatchNoPriority$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        if (this.$activity.isDestroyed()) {
            return Unit.OXO1;
        }
        List list = DialogHandlerChain.XIi00iiXO;
        FragmentActivity fragmentActivity = this.$activity;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            XX01Oi.IiI10X(i00oixio, IXOX0Xiii.m712iO(), null, new DialogHandlerChain$dispatchNoPriority$1$1$1((OiOI0Iii0) it.next(), fragmentActivity, null), 2, null);
        }
        return Unit.OXO1;
    }
}
