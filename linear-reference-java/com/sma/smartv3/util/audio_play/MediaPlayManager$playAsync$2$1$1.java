package com.sma.smartv3.util.audio_play;

import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_play.MediaPlayManager$playAsync$2$1$1", f = "MediaPlayManager.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class MediaPlayManager$playAsync$2$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ IO0i<Unit> $cont;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ MediaPlayManager this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaPlayManager$playAsync$2$1$1(IO0i<? super Unit> r1, MediaPlayManager r2, String r3, Continuation<? super MediaPlayManager$playAsync$2$1$1> r4) {
        this.$cont = r1;
        this.this$0 = r2;
        this.$path = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new MediaPlayManager$playAsync$2$1$1(this.$cont, this.this$0, this.$path, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((MediaPlayManager$playAsync$2$1$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L12:
        if (isActive() == false) goto L15;
        i1O0OXO1O.OXO1.XIi00iiXO(MediaPlayManager.OIi0(this.this$0) + " 播放超时，自动结束: " + this.$path);
        IO0i<Unit> r5 = this.$cont;
        Result.Companion r2 = Result.Companion;
        r5.resumeWith(Result.m6974constructorimpl(Unit.OXO1));
    L15:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        this.label = 1;
        if (DelayKt.XIi00iiXO(3000, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
