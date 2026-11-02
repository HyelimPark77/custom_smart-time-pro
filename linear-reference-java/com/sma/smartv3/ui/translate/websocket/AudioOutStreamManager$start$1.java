package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.AudioOutStreamManager$start$1", f = "AudioOutStreamManager.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AudioOutStreamManager$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudioOutStreamManager this$0;

    public static final class OXO1<T> implements IXiXI {
        public final /* synthetic */ AudioOutStreamManager IO;

        public OXO1(AudioOutStreamManager r1) {
            this.IO = r1;
        }

        public final Object OXO1(ByteString r1, Continuation<? super Unit> r2) {
            byte[] r3 = r1.toByteArray();
            AudioOutStreamManager.O00(this.IO).X1ii(r3);
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return OXO1((ByteString) r1, r2);
        }
    }

    public AudioOutStreamManager$start$1(AudioOutStreamManager r1, Continuation<? super AudioOutStreamManager$start$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new AudioOutStreamManager$start$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AudioOutStreamManager$start$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L6;
        ResultKt.X1ii(r5);
    L12:
        throw new KotlinNothingValueException();
    L6:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r5);
        l94<ByteString> r6 = AudioOutStreamManager.iO(this.this$0).XIi00iiXO();
        OXO1 r2 = new OXO1(this.this$0);
        this.label = 1;
        if (r6.collect(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
