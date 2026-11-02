package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import java.util.Comparator;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatch$1", m39466f = "DialogHandlerChain.kt", m39467i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m39468l = {84, 40, 49}, m39469m = "invokeSuspend", m39470n = {"$this$launch", "$this$withLock_u24default$iv", "$i$f$withLock", "$this$launch", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-DialogHandlerChain$dispatch$1$handlersToShow$1", "$this$launch", "handlersToShow", "$this$forEach$iv", "element$iv", "handler", "$this$invokeSuspend_u24lambda_u241_u240", "$i$f$forEach", "$i$a$-forEach-DialogHandlerChain$dispatch$1$1", "$i$a$-runCatching-DialogHandlerChain$dispatch$1$1$1"}, m39472s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n116#2,7:80\n124#2,2:100\n1563#3:87\n1634#3,3:88\n774#3:91\n865#3,2:92\n1563#3:94\n1634#3,3:95\n1056#3:98\n1869#3,2:102\n1#4:99\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1\n*L\n35#1:80,7\n35#1:100,2\n36#1:87\n36#1:88,3\n41#1:91\n41#1:92,2\n42#1:94\n42#1:95,3\n43#1:98\n47#1:102,2\n*E\n"})
public final class DialogHandlerChain$dispatch$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1\n*L\n1#1,328:1\n43#2:329\n*E\n"})
    public static final class OXO1<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(((OiOI0Iii0) t).OXO1()), Integer.valueOf(((OiOI0Iii0) t2).OXO1()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHandlerChain$dispatch$1(FragmentActivity fragmentActivity, Continuation<? super DialogHandlerChain$dispatch$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DialogHandlerChain$dispatch$1 dialogHandlerChain$dispatch$1 = new DialogHandlerChain$dispatch$1(this.$activity, continuation);
        dialogHandlerChain$dispatch$1.L$0 = obj;
        return dialogHandlerChain$dispatch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((DialogHandlerChain$dispatch$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:8:0x003a, B:58:0x018b, B:53:0x0150, B:55:0x0158), top: B:72:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0156 -> B:58:0x018b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0188 -> B:58:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
