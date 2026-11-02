package com.sma.smartv3.p610ui.translate;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.X0I1OO1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.AudioRepository$stopRecordAndStreamPlayer$1", m39466f = "AudioRepository.kt", m39467i = {}, m39468l = {87, 88}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioRepository$stopRecordAndStreamPlayer$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudioRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRepository$stopRecordAndStreamPlayer$1(AudioRepository audioRepository, Continuation<? super AudioRepository$stopRecordAndStreamPlayer$1> continuation) {
        super(2, continuation);
        this.this$0 = audioRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioRepository$stopRecordAndStreamPlayer$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AudioRepository$stopRecordAndStreamPlayer$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r5.I1XOi1(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            X0I1OO1 x0i1oo1 = this.this$0.f54822iO;
            this.label = 1;
            if (x0i1oo1.XIi00iiXO(this) != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i == 1) {
            ResultKt.X1ii(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        return Unit.OXO1;
        AudioRepository audioRepository = this.this$0;
        this.label = 2;
    }
}
