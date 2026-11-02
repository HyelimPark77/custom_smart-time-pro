package com.sma.smartv3.util.audio_play;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$enqueue$1", f = "ExoPlayerManager.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class ExoPlayerManager$enqueue$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ ExoPlayerManager this$0;

    public ExoPlayerManager$enqueue$1(ExoPlayerManager r1, String r2, Continuation<? super ExoPlayerManager$enqueue$1> r3) {
        this.this$0 = r1;
        this.$path = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new ExoPlayerManager$enqueue$1(this.this$0, this.$path, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((ExoPlayerManager$enqueue$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        O00<String> r5 = this.this$0.XO0O10();
        String r2 = this.$path;
        this.label = 1;
        if (r5.iIXi1iiXI(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
