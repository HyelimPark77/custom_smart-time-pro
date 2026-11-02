package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.LocalAudioInputService$start$1", f = "LocalAudioInputService.kt", i = {0}, l = {31}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
public final class LocalAudioInputService$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ iXOIii $sink;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalAudioInputService this$0;

    public LocalAudioInputService$start$1(LocalAudioInputService r1, iXOIii r2, Continuation<? super LocalAudioInputService$start$1> r3) {
        this.this$0 = r1;
        this.$sink = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        LocalAudioInputService$start$1 r0 = new LocalAudioInputService$start$1(this.this$0, this.$sink, r5);
        r0.L$0 = r4;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalAudioInputService$start$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        final i00OIXiO r0 = (i00OIXiO) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L8;
        if (r2 != 1) goto L7;
        ResultKt.X1ii(r7);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        ii0iIIX0<byte[]> r8 = LocalAudioInputService.OXO1(this.this$0).O00();
        final iXOIii r4 = this.$sink;
        final LocalAudioInputService r5 = this.this$0;
        IXiXI<? super byte[]> r3 = new AnonymousClass1(r4, r0, r5);
        this.L$0 = SpillingKt.OXO1(r0);
        this.label = 1;
        if (r8.collect(r3, this) != r1) goto L12;
        return r1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
