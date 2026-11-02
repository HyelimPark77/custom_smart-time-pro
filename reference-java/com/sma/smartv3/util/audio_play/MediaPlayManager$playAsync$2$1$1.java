package com.sma.smartv3.util.audio_play;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.MediaPlayManager$playAsync$2$1$1", m39466f = "MediaPlayManager.kt", m39467i = {}, m39468l = {99}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class MediaPlayManager$playAsync$2$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ IO0i<Unit> $cont;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ MediaPlayManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaPlayManager$playAsync$2$1$1(IO0i<? super Unit> iO0i, MediaPlayManager mediaPlayManager, String str, Continuation<? super MediaPlayManager$playAsync$2$1$1> continuation) {
        super(2, continuation);
        this.$cont = iO0i;
        this.this$0 = mediaPlayManager;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPlayManager$playAsync$2$1$1(this.$cont, this.this$0, this.$path, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((MediaPlayManager$playAsync$2$1$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.label = 1;
            if (DelayKt.XIi00iiXO(3000L, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        if (this.$cont.isActive()) {
            i1O0OXO1O.OXO1.XIi00iiXO(this.this$0.IiI10X + " 播放超时，自动结束: " + this.$path);
            IO0i<Unit> iO0i = this.$cont;
            Result.Companion companion = Result.Companion;
            iO0i.resumeWith(Result.m48333constructorimpl(Unit.OXO1));
        }
        return Unit.OXO1;
    }
}
