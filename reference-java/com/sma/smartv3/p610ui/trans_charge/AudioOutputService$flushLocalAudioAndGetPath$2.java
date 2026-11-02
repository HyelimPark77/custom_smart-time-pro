package com.sma.smartv3.p610ui.trans_charge;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOOiIIII;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.trans_charge.AudioOutputService$flushLocalAudioAndGetPath$2", m39466f = "AudioOutputService.kt", m39467i = {}, m39468l = {43}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioOutputService$flushLocalAudioAndGetPath$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ i00OIXiO $scope;
    int label;
    final /* synthetic */ AudioOutputService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioOutputService$flushLocalAudioAndGetPath$2(AudioOutputService audioOutputService, i00OIXiO i00oixio, Continuation<? super AudioOutputService$flushLocalAudioAndGetPath$2> continuation) {
        super(2, continuation);
        this.this$0 = audioOutputService;
        this.$scope = i00oixio;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioOutputService$flushLocalAudioAndGetPath$2(this.this$0, this.$scope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AudioOutputService$flushLocalAudioAndGetPath$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            IXOOiIIII iXOOiIIII = this.this$0.XIi00iiXO;
            this.label = 1;
            if (iXOOiIIII.XO0O10(this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.this$0.XIi00iiXO.XIi00iiXO(this.$scope);
        return Unit.OXO1;
    }
}
