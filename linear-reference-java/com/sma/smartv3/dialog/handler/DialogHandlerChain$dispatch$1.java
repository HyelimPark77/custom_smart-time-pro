package com.sma.smartv3.dialog.handler;

import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OiOI0Iii0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.uy0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatch$1", f = "DialogHandlerChain.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {84, 40, 49}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$i$f$withLock", "$this$launch", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-DialogHandlerChain$dispatch$1$handlersToShow$1", "$this$launch", "handlersToShow", "$this$forEach$iv", "element$iv", "handler", "$this$invokeSuspend_u24lambda_u241_u240", "$i$f$forEach", "$i$a$-forEach-DialogHandlerChain$dispatch$1$1", "$i$a$-runCatching-DialogHandlerChain$dispatch$1$1$1"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 1)
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
        public OXO1() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
            return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(((OiOI0Iii0) r1).OXO1()), Integer.valueOf(((OiOI0Iii0) r2).OXO1()));
        }
    }

    public DialogHandlerChain$dispatch$1(FragmentActivity r1, Continuation<? super DialogHandlerChain$dispatch$1> r2) {
        this.$activity = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        DialogHandlerChain$dispatch$1 r0 = new DialogHandlerChain$dispatch$1(this.$activity, r4);
        r0.L$0 = r3;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((DialogHandlerChain$dispatch$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0156 -> B:58:0x018b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0188 -> B:58:0x018b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r18) {
        i00OIXiO r2 = (i00OIXiO) this.L$0;
        Object r8 = pb.I0iXXO();
        int r0 = this.label;
        if (r0 == 0) goto L20;
        if (r0 == 1) goto L19;
        if (r0 == 2) goto L14;
        if (r0 != 3) goto L13;
        int r3 = this.I$0;
        i00OIXiO r1 = (i00OIXiO) this.L$7;
        OiOI0Iii0 r4 = (OiOI0Iii0) this.L$6;
        Iterator r5 = (Iterator) this.L$4;
        FragmentActivity r6 = (FragmentActivity) this.L$3;
        Iterable r7 = (Iterable) this.L$2;
        List r9 = (List) this.L$1;
        ResultKt.X1ii(r18);     // Catch: Throwable -> L10
    L58:
        Object r10 = Result.m6974constructorimpl(Unit.OXO1);     // Catch: Throwable -> L10
    L61:
        Throwable r11 = Result.m6977exceptionOrNullimpl(r10);
        if (r11 == null) goto L51;
        i1O0OXO1O.OXO1.OXO1("DialogHandlerChain Dispatch Exception: " + r11.getMessage());
    L51:
        if (r5.hasNext() == false) goto L65;
        Object r12 = r5.next();
        OiOI0Iii0 r13 = (OiOI0Iii0) r12;
        Result.Companion r14 = Result.Companion;     // Catch: Throwable -> L10
        if (r6.isDestroyed() == true) goto L58;
        this.L$0 = r2;     // Catch: Throwable -> L10
        this.L$1 = SpillingKt.OXO1(r9);     // Catch: Throwable -> L10
        this.L$2 = SpillingKt.OXO1(r7);     // Catch: Throwable -> L10
        this.L$3 = r6;     // Catch: Throwable -> L10
        this.L$4 = r5;     // Catch: Throwable -> L10
        this.L$5 = SpillingKt.OXO1(r12);     // Catch: Throwable -> L10
        this.L$6 = SpillingKt.OXO1(r13);     // Catch: Throwable -> L10
        this.L$7 = SpillingKt.OXO1(r2);     // Catch: Throwable -> L10
        this.I$0 = r3;     // Catch: Throwable -> L10
        this.I$1 = 0;     // Catch: Throwable -> L10
        this.I$2 = 0;     // Catch: Throwable -> L10
        this.label = 3;     // Catch: Throwable -> L10
        if (r13.XO0O10(r6, this) != r8) goto L58;
    L57:
        return r8;
    L65:
        return Unit.OXO1;
    L10:
        th = move-exception;
        Result.Companion r15 = Result.Companion;
        r10 = Result.m6974constructorimpl(ResultKt.OXO1(th));
        goto L61
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        uy0 r16 = (uy0) this.L$1;
        ResultKt.X1ii(r18);     // Catch: Throwable -> L17
        Object r17 = r18;
    L38:
        ArrayList r19 = new ArrayList();     // Catch: Throwable -> L17
        Iterator r20 = ((Iterable) r17).iterator();     // Catch: Throwable -> L17
    L40:
        if (r20.hasNext() == false) goto L44;
        Object r21 = r20.next();     // Catch: Throwable -> L17
        if (((Boolean) ((Pair) r21).getSecond()).booleanValue() == false) goto L40;
        r19.add(r21);     // Catch: Throwable -> L17
        goto L40
    L44:
        ArrayList r22 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r19, 10));     // Catch: Throwable -> L17
        Iterator r23 = r19.iterator();     // Catch: Throwable -> L17
    L46:
        if (r23.hasNext() == false) goto L48;
        r22.add((OiOI0Iii0) ((Pair) r23.next()).getFirst());     // Catch: Throwable -> L17
        goto L46
    L48:
        List r24 = CollectionsKt___CollectionsKt.II0O1(r22, new OXO1());     // Catch: Throwable -> L17
        DialogHandlerChain.OXO1().removeAll(r24);     // Catch: Throwable -> L17
        r16.unlock(null);
        List r25 = r24;
        r6 = this.$activity;
        r5 = r25.iterator();
        r9 = r24;
        r7 = r25;
        r3 = 0;
    L17:
        th = th;
    L66:
        r16.unlock(null);
        throw th;
    L19:
        int r26 = this.I$0;
        uy0 r27 = (uy0) this.L$1;
        ResultKt.X1ii(r18);
        uy0 r110 = r27;
    L70:
        List r28 = DialogHandlerChain.OXO1();     // Catch: Throwable -> L32
        ArrayList r111 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r28, 10));     // Catch: Throwable -> L32
        Iterator r112 = r28.iterator();     // Catch: Throwable -> L32
    L30:
        if (r112.hasNext() == false) goto L34;
        r111.add(I100X1.XIi00iiXO(r2, IXOX0Xiii.iO(), null, new DialogHandlerChain$dispatch$1$handlersToShow$1$1$1((OiOI0Iii0) r112.next(), null), 2, null));     // Catch: Throwable -> L32
        goto L30
    L34:
        this.L$0 = r2;     // Catch: Throwable -> L32
        this.L$1 = r110;     // Catch: Throwable -> L32
        this.I$0 = r26;     // Catch: Throwable -> L32
        this.I$1 = 0;     // Catch: Throwable -> L32
        this.label = 2;     // Catch: Throwable -> L32
        r17 = AwaitKt.OXO1(r111, this);     // Catch: Throwable -> L32
        if (r17 == r8) goto L57;
        r16 = r110;
    L32:
        th = th;
        r16 = r110;
        goto L66
    L20:
        ResultKt.X1ii(r18);
        if (isDestroyed() == true) goto L23;
        uy0 r29 = DialogHandlerChain.XIi00iiXO();
        this.L$0 = r2;
        this.L$1 = r29;
        this.I$0 = 0;
        this.label = 1;
        if (r29.lock(null, this) == r8) goto L57;
        r110 = r29;
        r26 = 0;
        goto L70
    L23:
        return Unit.OXO1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
