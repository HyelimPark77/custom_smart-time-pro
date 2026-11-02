package com.sma.smartv3.util.audio_play;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2954td;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$forcePlay$1", m39466f = "ExoPlayerManager.kt", m39467i = {}, m39468l = {93, 96}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class ExoPlayerManager$forcePlay$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ ExoPlayerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerManager$forcePlay$1(ExoPlayerManager exoPlayerManager, String str, Continuation<? super ExoPlayerManager$forcePlay$1> continuation) {
        super(2, continuation);
        this.this$0 = exoPlayerManager;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExoPlayerManager$forcePlay$1(this.this$0, this.$path, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((ExoPlayerManager$forcePlay$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r6.iIXi1iiXI(r1, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.X1ii(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            return Unit.OXO1;
        }
        ResultKt.X1ii(obj);
        XiOIO xiOIO = this.this$0.XO0O10;
        if (xiOIO != null) {
            this.label = 1;
            if (C2954td.I0iXXO(xiOIO, this) != objI0iXXO) {
            }
        }
        return objI0iXXO;
        this.this$0.OIi0().stop();
        i1O0OXO1O.OXO1.OXO1("ForcePlay:" + this.$path);
        O00<String> o00XO0O10 = this.this$0.XO0O10();
        String str = this.$path;
        this.label = 2;
    }
}
