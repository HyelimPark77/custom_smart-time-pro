package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.util.audio_recorder.AudioFileOutputManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.LocalAudioInputService$flushLocalAudioAndGetPath$2", f = "LocalAudioInputService.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class LocalAudioInputService$flushLocalAudioAndGetPath$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ i00OIXiO $scope;
    int label;
    final /* synthetic */ LocalAudioInputService this$0;

    public LocalAudioInputService$flushLocalAudioAndGetPath$2(LocalAudioInputService r1, i00OIXiO r2, Continuation<? super LocalAudioInputService$flushLocalAudioAndGetPath$2> r3) {
        this.this$0 = r1;
        this.$scope = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new LocalAudioInputService$flushLocalAudioAndGetPath$2(this.this$0, this.$scope, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalAudioInputService$flushLocalAudioAndGetPath$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L13:
        AudioFileOutputManager r5 = LocalAudioInputService.XOO0ii0(this.this$0);
        if (r5 == null) goto L17;
        r5.XIi00iiXO(this.$scope);
    L17:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        AudioFileOutputManager r6 = LocalAudioInputService.XOO0ii0(this.this$0);
        if (r6 == null) goto L13;
        this.label = 1;
        if (r6.XO0O10(this) != r0) goto L13;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
