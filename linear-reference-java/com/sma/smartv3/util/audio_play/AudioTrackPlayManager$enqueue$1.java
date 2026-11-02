package com.sma.smartv3.util.audio_play;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_play.AudioTrackPlayManager$enqueue$1", f = "AudioTrackPlayManager.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AudioTrackPlayManager$enqueue$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ AudioTrackPlayManager this$0;

    public AudioTrackPlayManager$enqueue$1(AudioTrackPlayManager r1, String r2, Continuation<? super AudioTrackPlayManager$enqueue$1> r3) {
        this.this$0 = r1;
        this.$path = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new AudioTrackPlayManager$enqueue$1(this.this$0, this.$path, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AudioTrackPlayManager$enqueue$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r6);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r6);
        i1O0OXO1O.OXO1.OXO1(AudioTrackPlayManager.XOO0ii0(this.this$0) + " enqueue " + this.$path);
        O00<String> r7 = this.this$0.XO0O10();
        String r2 = this.$path;
        this.label = 1;
        if (r7.iIXi1iiXI(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
