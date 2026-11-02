package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.X0I1OO1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.AudioRepository$stopRecordAndStreamPlayer$1", f = "AudioRepository.kt", i = {}, l = {87, 88}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AudioRepository$stopRecordAndStreamPlayer$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudioRepository this$0;

    public AudioRepository$stopRecordAndStreamPlayer$1(AudioRepository r1, Continuation<? super AudioRepository$stopRecordAndStreamPlayer$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new AudioRepository$stopRecordAndStreamPlayer$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AudioRepository$stopRecordAndStreamPlayer$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        ResultKt.X1ii(r5);
    L17:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r5);
    L13:
        AudioRepository r6 = this.this$0;
        this.label = 2;
        if (r6.I1XOi1(this) != r0) goto L17;
    L15:
        return r0;
    L10:
        ResultKt.X1ii(r5);
        X0I1OO1 r7 = AudioRepository.XIi00iiXO(this.this$0);
        this.label = 1;
        if (r7.XIi00iiXO(this) != r0) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
